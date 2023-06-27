package enigmaticgui;

import steganography.Decryption;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class DecryptionPage {
    final JFrame frame;
    final JButton encryptBtn;
    final JButton decryptBtn;
    final JButton about;
    static JLabel imageLabel1 = null;
    final JTextArea txtArea;
    final JButton uploadImg;
    final JButton retrieveMsg;
    final JButton generate;
    final JTextField txtFld;
    static File file = null;

    public DecryptionPage() {
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
        encryptBtn.setBounds(0, 0, 150, 25);
        encryptBtn.setBackground(new Color(238, 238, 238));
        encryptBtn.addActionListener(e -> {
            // code to be executed when the button is clicked
            try {
                // Setting the original file reference to null so that it can't refer to the previous image
                file = null;
                frame.setVisible(false);
                new EncryptionPage();
            } catch(Exception exp) {
                System.out.println("Error Occurred: " + exp);
            }
        });
        frame.add(encryptBtn);

        // Creating EncryptionPage Button
        decryptBtn = new JButton("Decryption");
        decryptBtn.setBounds(150, 0, 150, 26);
        decryptBtn.setBackground(Color.WHITE);
        // decryptBtn.addActionListener();
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

        // Creating JLabel to show the txt msg
        txtArea = new JTextArea();
        txtArea.setBounds(500, 30, 460, 320);
        txtArea.setBorder(border);
        txtArea.setBackground(Color.WHITE);
        txtArea.setOpaque(true);
        frame.add(txtArea);

        // Creating Upload Image Button
        uploadImg = new JButton("Upload Image");
        uploadImg.setBounds(200, 360, 150, 40);
        uploadImg.setBackground(new Color(238, 238, 238));
        uploadImg.addActionListener(e -> imgUpload());
        frame.add(uploadImg);

        // JLabel for Text Field
        JLabel txtLbl = new JLabel("Enter The Key Bellow");
        txtLbl.setBounds(432, 360, 150, 10);
        frame.add(txtLbl);

        // Creating Text Field
        txtFld = new JTextField();
        txtFld.setBounds(415, 380, 170, 25);
        txtFld.setBackground(Color.WHITE);
        txtFld.setBorder(border);
        frame.add(txtFld);

        // Creating Retrieve Message Button
        retrieveMsg = new JButton("Retrieve Message");
        retrieveMsg.setBounds(650, 360, 150, 40);
        retrieveMsg.setBackground(new Color(238, 238, 238));
        retrieveMsg.addActionListener(e -> {
            if( file != null &&  !(txtFld.getText().trim().isEmpty()) ) {
                String encryptedMsg = Decryption.Decrypt(file, txtFld.getText());
                if( !encryptedMsg.equals("") )
                    txtArea.setText(encryptedMsg);
            }
            else {
                if(file == null)
                    JOptionPane.showMessageDialog(null, "Warning: Image is not selected", "Warning", JOptionPane.WARNING_MESSAGE);
                if(txtFld.getText().trim().isEmpty())
                    JOptionPane.showMessageDialog(null, "Warning: Please enter a key", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });
        frame.add(retrieveMsg);

        // Generate Another Stego Image Button
        generate = new JButton("Generate Another Stego Image");
        generate.setBounds(390, 510, 220, 40);
        generate.setBackground(new Color(238, 238, 238));
        generate.addActionListener(e -> {
            // code to be executed when the button is clicked
            try {
                // Setting the original file reference to null so that it can't refer to the previous image
                file = null;
                frame.setVisible(false);
                new EncryptionPage();
            } catch(Exception exp) {
                System.out.println("Error Occurred: " + exp);
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
        } catch (Exception exp) {
            System.out.println("Error Occurred in Accessing File " + exp);
        }
    }
}
