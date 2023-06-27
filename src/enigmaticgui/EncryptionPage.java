package enigmaticgui;

import steganography.Encryption;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EncryptionPage {
    final JFrame frame;
    final JButton encryptBtn;
    final JButton decryptBtn;
    final JButton about;
    static JLabel imageLabel1 = null;
    static JLabel imageLabel2 = null;
    final JButton uploadImg;
    final JButton saveImg;
    static JTextArea txtArea = null;
    static JTextField txtFld2 = null;
    final JButton uploadMsg;
    final JButton generate;
    static File file = null;
    static File encryptedFile = null;
    public EncryptionPage() {
        // Creating the frame
        frame = new JFrame();
        frame.setTitle("EnigmaticByte");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // Creating EncryptionPage Button
        encryptBtn = new JButton("Encryption");
        encryptBtn.setBounds(0, 0, 150, 26);
        encryptBtn.setBackground(Color.WHITE);
        // encryptBtn.addActionListener(this);
        frame.add(encryptBtn);

        // Creating EncryptionPage Button
        decryptBtn = new JButton("Decryption");
        decryptBtn.setBounds(150, 0, 150, 25);
        decryptBtn.setBackground(new Color(238, 238, 238));
        decryptBtn.addActionListener(e -> {
            // code to be executed when the button is clicked
            try {
                // Setting the original file reference to null so that it can't refer to the previous image
                file = null;
                frame.setVisible(false);
                new DecryptionPage();
            } catch(Exception exp) {
                System.out.println("Error Occurred: " + exp);
            }
        });
        frame.add(decryptBtn);

        // Creating About Button
        about = new JButton("About");
        about.setBounds(300, 0, 150, 25);
        about.setBackground(new Color(238, 238, 238));
        about.addActionListener(e -> {
            // code to be executed when the button is clicked
            try {
                // Setting the original file reference to null so that it can't refer to the previous image
                file = null;
                frame.setVisible(false);
                new AboutPage();
            } catch(Exception exp) {
                System.out.println("Error Occurred: " + exp);
            }
        });
        frame.add(about);

        // Creating a border to use in further code
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

        // Creating JLabel to show the uploaded image
        imageLabel1 = new JLabel();
        imageLabel1.setBounds(30, 30, 460, 320);
        imageLabel1.setBorder(border);
        imageLabel1.setBackground(Color.WHITE);
        imageLabel1.setOpaque(true);
        frame.add(imageLabel1);

        // Creating JLabel to show the stego image
        imageLabel2 = new JLabel();
        imageLabel2.setBounds(500, 30, 460, 320);
        imageLabel2.setBorder(border);
        imageLabel2.setBackground(Color.WHITE);
        imageLabel2.setOpaque(true);
        frame.add(imageLabel2);

        // Creating Upload Image Button
        uploadImg = new JButton("Upload Image");
        uploadImg.setBounds(200, 360, 150, 40);
        uploadImg.setBackground(new Color(238, 238, 238));
        uploadImg.addActionListener(e -> imgUpload());
        frame.add(uploadImg);

        // Creating Save Stego Image Button
        saveImg = new JButton("Save Stego Image");
        saveImg.setBounds(650, 360, 150, 40);
        saveImg.setBackground(new Color(238, 238, 238));
        saveImg.addActionListener(e -> imgSave());
        frame.add(saveImg);

        // JLabel for Text Field
        JLabel txtLbl2 = new JLabel("Enter The Key Bellow");
        txtLbl2.setBounds(432, 360, 150, 10);
        frame.add(txtLbl2);

        // Creating Text Field
        txtFld2 = new JTextField();
        txtFld2.setBounds(415, 380, 170, 25);
        txtFld2.setBackground(Color.WHITE);
        txtFld2.setBorder(border);
        frame.add(txtFld2);

        // JLabel for Text Field
        JLabel txtLbl = new JLabel("Enter The Message: ");
        txtLbl.setBounds(36, 410, 150, 30);
        frame.add(txtLbl);

        // Creating Text Field
        txtArea = new JTextArea();
        txtArea.setBounds(200, 410, 760, 90);
        txtArea.setBackground(Color.WHITE);
        txtArea.setBorder(border);
        frame.add(txtArea);

        // Upload Message Button
        uploadMsg = new JButton("Upload Message");
        uploadMsg.setBounds(36, 440, 150, 40);
        uploadMsg.setBackground(new Color(238, 238, 238));
        uploadMsg.addActionListener(e -> msgUpload());
        frame.add(uploadMsg);

        // Generate Stego Image Button
        generate = new JButton("Generate Stego Image");
        generate.setBounds(415, 510, 170, 40);
        generate.setBackground(new Color(238, 238, 238));
        generate.addActionListener(e -> {
            if(file != null && !(txtArea.getText().trim().isEmpty()) && !(txtFld2.getText().trim().isEmpty())) {
                encryptedFile = Encryption.Encrypt(file, txtArea.getText(), txtFld2.getText());
                // Setting the Stego Image in imageLabel2
                try {
                    // Read the image from the file and create an ImageIcon
                    Image image = ImageIO.read(encryptedFile);
                    ImageIcon icon = new ImageIcon(image);

                    // Scale the image to fit in the label
                    int width = imageLabel2.getWidth();
                    int height = imageLabel2.getHeight();
                    Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);

                    // Set the icon on the label
                    imageLabel2.setIcon(scaledIcon);
                } catch (IOException exp) {
                    System.out.println("Error Occurred in Accessing File " + exp);
                }

                // Setting the original file reference to null so that it can't refer to the previous image
                file = null;
            }
            else {
                if(file == null)
                    JOptionPane.showMessageDialog(null, "Warning: Image is not selected", "Warning", JOptionPane.WARNING_MESSAGE);
                if(txtArea.getText().trim().isEmpty())
                    JOptionPane.showMessageDialog(null, "Warning: Please enter the message to encrypt", "Warning", JOptionPane.WARNING_MESSAGE);
                if(txtFld2.getText().trim().isEmpty())
                    JOptionPane.showMessageDialog(null, "Warning: Please enter a key", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });
        frame.add(generate);

        frame.setVisible(true);
    }

    // Method for uploading Image
    static void imgUpload() {
        // Create the file chooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));

        // Opening the File Dialog Box to choose the file
        int option = fileChooser.showOpenDialog(null);

        // Selecting the file
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
        }
        try {
            // Read the image from the file and create an ImageIcon
            Image image = ImageIO.read(file);
            ImageIcon icon = new ImageIcon(image);

            // Scale the image to fit in the label
            int width = imageLabel1.getWidth();
            int height = imageLabel1.getHeight();
            Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            // Set the icon on the label
            imageLabel1.setIcon(scaledIcon);
        } catch (IOException exp) {
            System.out.println("Error Occurred in Accessing File " + exp);
        }
    }

    // Method for saving Img to default directory
    static void imgSave() {
        if(encryptedFile != null) {
            String directory = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
            /*
            getFileSystemView() returns the object of FileSystemView class which have information about
            the file system of the user and have some method and among those one method is getDefaultDirectory()
            which returns the path of the default directory as a file object so by using toString we convert it to
            string object.
             */
            // Default Directory is "C:\Users\<username>\Onedrive\Documents"
            String newImageFileString = directory + "\\export.png";
            String msg = "Image is saved to " + newImageFileString;
            JOptionPane.showMessageDialog(null, msg, "Image Saved", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Warning: Stego Image is not generated", "Warning", JOptionPane.WARNING_MESSAGE);
    }

    // Method for uploading Msg
    static void msgUpload() {
        // Creating file chooser
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);

        // Show the dialog and wait for the user to choose a file
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File msgFile = fileChooser.getSelectedFile();
            try {
                // Read the contents of the file
                BufferedReader reader = new BufferedReader(new FileReader(msgFile));
                StringBuilder contents = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    contents.append(line);
                    contents.append(System.lineSeparator());
                }
                reader.close();

                // Set the text field's text to the contents of the file
                txtArea.setText(contents.toString());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
