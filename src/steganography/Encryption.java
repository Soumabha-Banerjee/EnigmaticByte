package steganography;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class Encryption {
    public static File Encrypt(File imageFile, String message, String key) {
        // Creating an Image File Named "export.png" Which Can be Stored Inside Default Directory
        String directory = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
		/*
		getFileSystemView() returns the object of FileSystemView class which have information about
		the file system of the user and have some method and among those one method is getDefaultDirectory()
		which returns the path of the default directory as a file object so by using toString we convert it to
		string object.
		 */
        // Default Directory is "C:\Users\<username>\Onedrive\Documents"
        String newImageFileString = directory + "\\export.png";
        File newImageFile = new File(newImageFileString);

        // Encrypting The Selected Image File and Store It to Default Directory
        BufferedImage image;
        try {
            // Converting Normal Image to Buffered Image
            image = ImageIO.read(imageFile);
            // Copy The Original Buffered Image To a New Buffered Image Where The Message is Going to Encrypt
            BufferedImage imageToEncrypt = getImageToEncrypt(image);
            // Getting the 1D Pixel Array From 2D Buffered Image
            Pixel[] pixels = GetPixelArray(imageToEncrypt);
            // Message goes for columnar transposition encryption
            message = ColumnarTransposition.encrypt(message, key);
            // Converting The Message Into Binary
            String[] messageInBinary = ConvertMessageToBinary(message);
            // Encrypting The Binary Message Into Pixel
            EncodeMessageBinaryInPixels(pixels, messageInBinary);
            ReplacePixelsInNewBufferedImage(pixels, image);
            SaveNewFile(image, newImageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newImageFile;
    }

    // Copy The Original Buffered Image To a New Buffered Image Where The Message is Going to Encrypt
    private static BufferedImage getImageToEncrypt(BufferedImage image) {
        ColorModel colorModel = image.getColorModel();
        boolean isAlphaPremultiplied = colorModel.isAlphaPremultiplied();
        WritableRaster raster = image.copyData(null);
        return new BufferedImage(colorModel, raster, isAlphaPremultiplied, null);
    }

    // Gets 1D Array of Colors From The imageToEncrypt Buffered Image
    private static Pixel[] GetPixelArray(BufferedImage imageToEncrypt){
        int height = imageToEncrypt.getHeight();
        int width = imageToEncrypt.getWidth();
        // This Will Create The Array of Type Pixel (Java Doesn't Have a Pixel Type Object, We Have to Made It)
        // Pixel[] is Basically an 1D Array of Objects Having Information of  Buffered Image's Each Pixel Index and Their RGB Colour Data
        Pixel[] pixels = new Pixel[height * width];
        int count = 0;
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                Color colorToAdd = new Color(imageToEncrypt.getRGB(x, y));
                pixels[count] = new Pixel(x, y, colorToAdd);
                count++;
            }
        }
        return pixels;
    }

    // Converting The Message Into Binary
    private static String[] ConvertMessageToBinary(String message) {
        int[] messageInAscii = ConvertMessageToAscii(message);
        return ConvertAsciiToBinary(messageInAscii);
    }

    // Converting The Message Into ASCII
    private static int[] ConvertMessageToAscii(String message) {
        int[] messageCharactersInAscii = new int[message.length()];
        for(int i = 0; i < message.length(); i++) {
            // As I Take asciiValue int It Will Automatically Typecast Each Word of Message to Equivalent ASCII
            int asciiValue = message.charAt(i);
            messageCharactersInAscii[i] = asciiValue;
        }
        return messageCharactersInAscii;
    }

    // Converting The ASCII Code to Binary
    private static String[] ConvertAsciiToBinary(int[] messageInAscii) {
        String[] messageInBinary = new String[messageInAscii.length];
        for(int i = 0; i < messageInAscii.length; i++) {
            // Converting The ASCII to Binary and Add Zeros at Left (MSB) to Make It 8 Bits
            String asciiBinary = LeftPadZeros(Integer.toBinaryString(messageInAscii[i]));
            messageInBinary[i] = asciiBinary;
        }
        return messageInBinary;
    }

    // Left Padding Add Zeros to Make It 8 Bits
    private static String LeftPadZeros(String value) {
        StringBuilder paddedValue = new StringBuilder("00000000");
        int offSet = 8 - value.length();
        for(int i = 0 ; i < value.length(); i++) {
            paddedValue.setCharAt(i+offSet, value.charAt(i));
        }
        return paddedValue.toString();
    }


    // Encrypts The Binary Message Into Pixel
    private static void EncodeMessageBinaryInPixels(Pixel[] pixels, String[] messageBinary) {
        int pixelIndex = 0;
        boolean isLastCharacter = false;
        for(int i = 0; i < messageBinary.length; i++) {
            Pixel[] currentPixels = new Pixel[] {pixels[pixelIndex], pixels[pixelIndex+1], pixels[pixelIndex+2]};
            if(i+1 == messageBinary.length) {
                isLastCharacter = true;
            }
            ChangePixelsColor(messageBinary[i], currentPixels, isLastCharacter);
            pixelIndex = pixelIndex +3;
        }
    }

    private static void ChangePixelsColor(String messageBinary, Pixel[] pixels, boolean isLastCharacter) {
        int messageBinaryIndex = 0;
        for(int i =0; i < pixels.length-1; i++) {
            char[] messageBinaryChars = new char[] {messageBinary.charAt(messageBinaryIndex), messageBinary.charAt(messageBinaryIndex+1), messageBinary.charAt(messageBinaryIndex+2)};
            String[] pixelRGBBinary = GetPixelsRGBBinary(pixels[i], messageBinaryChars);
            pixels[i].setColor(GetNewPixelColor(pixelRGBBinary));
            messageBinaryIndex = messageBinaryIndex + 3;
        }
        if(!isLastCharacter) {
            char[] messageBinaryChars = new char[] {messageBinary.charAt(messageBinaryIndex), messageBinary.charAt(messageBinaryIndex+1), '1'};
            String[] pixelRGBBinary = GetPixelsRGBBinary(pixels[pixels.length-1], messageBinaryChars);
            pixels[pixels.length-1].setColor(GetNewPixelColor(pixelRGBBinary));
        }else {
            char[] messageBinaryChars = new char[] {messageBinary.charAt(messageBinaryIndex), messageBinary.charAt(messageBinaryIndex+1), '0'};
            String[] pixelRGBBinary = GetPixelsRGBBinary(pixels[pixels.length-1], messageBinaryChars);
            pixels[pixels.length-1].setColor(GetNewPixelColor(pixelRGBBinary));
        }
    }

    private static String[] GetPixelsRGBBinary(Pixel pixel, char[] messageBinaryChars) {
        String[] pixelRGBBinary = new String[3];
        pixelRGBBinary[0] = ChangePixelBinary(Integer.toBinaryString(pixel.getColor().getRed()), messageBinaryChars[0]);
        pixelRGBBinary[1] = ChangePixelBinary(Integer.toBinaryString(pixel.getColor().getGreen()), messageBinaryChars[1]);
        pixelRGBBinary[2] = ChangePixelBinary(Integer.toBinaryString(pixel.getColor().getBlue()), messageBinaryChars[2]);
        return pixelRGBBinary;
    }

    private static String ChangePixelBinary(String pixelBinary, char messageBinaryChar) {
        StringBuilder sb = new StringBuilder(pixelBinary);
        sb.setCharAt(pixelBinary.length()-1, messageBinaryChar);
        return sb.toString();
    }

    private static Color GetNewPixelColor(String[] colorBinary) {
        return new Color(Integer.parseInt(colorBinary[0], 2), Integer.parseInt(colorBinary[1], 2), Integer.parseInt(colorBinary[2], 2));
    }

    private static void ReplacePixelsInNewBufferedImage(Pixel[] newPixels, BufferedImage newImage) {
        for (Pixel newPixel : newPixels) {
            newImage.setRGB(newPixel.getX(), newPixel.getY(), newPixel.getColor().getRGB());
        }
    }

    private static void SaveNewFile(BufferedImage newImage, File newImageFile) {
        try {
            ImageIO.write(newImage, "png", newImageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
