package enigmaticgui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;


public class AboutPage {
    final JFrame frame;
    final JButton encryptBtn;
    final JButton decryptBtn;
    final JButton about;
    static JLabel imageLabel1 = null;
    public AboutPage() {
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
                frame.setVisible(false);
                new EncryptionPage();
            } catch (Exception exp) {
                System.out.println("Error Occurred: " + exp);
            }
        });
        frame.add(encryptBtn);

        // Creating EncryptionPage Button
        decryptBtn = new JButton("Decryption");
        decryptBtn.setBounds(150, 0, 150, 25);
        decryptBtn.setBackground(new Color(238, 238, 238));
        decryptBtn.addActionListener(e -> {
            // code to be executed when the button is clicked
            try {
                frame.setVisible(false);
                new DecryptionPage();
            } catch (Exception exp) {
                System.out.println("Error Occurred: " + exp);
            }
        });
        frame.add(decryptBtn);

        // Creating About Button
        about = new JButton("About");
        about.setBounds(300, 0, 150, 26);
        about.setBackground(Color.WHITE);
        // about.addActionListener();
        frame.add(about);

        // Creating a border to use in further code
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

        // Taking about image
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("F:\\Java_Development\\EnigmeticByte\\src\\Docs\\project_poster.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create an ImageIcon from the loaded image
        ImageIcon icon = new ImageIcon(image);

        // Creating JLabel to show the uploaded image
        imageLabel1 = new JLabel(icon);
        imageLabel1.setBounds(30, 30, 930, 320);
        imageLabel1.setBorder(border);
        imageLabel1.setBackground(Color.WHITE);
        imageLabel1.setOpaque(true);

        // Scale the image to fit in the label
        int width = imageLabel1.getWidth();
        int height = imageLabel1.getHeight();
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        imageLabel1.setIcon(scaledIcon);

        frame.add(imageLabel1);

        // See project on GitHub Button
        JButton github = new JButton("See Project on GitHub");
        github.setBounds(415, 400, 170, 40);
        github.setBackground(new Color(238, 238, 238));
        github.addActionListener(e -> {
            // Taking the link
            String link = "https://github.com/Soumabha-Banerjee/EnigmaticByte";
            // Open the link in a web browser
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        frame.add(github);

        frame.setVisible(true);
    }
}
