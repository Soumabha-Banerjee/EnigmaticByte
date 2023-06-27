package steganography;

public class ColumnarTransposition {
    public static String encrypt(String plaintext, String key) {
        int keyLength = key.length();
        int textLength = plaintext.length();

        // Calculate the number of rows needed
        int numRows = (int) Math.ceil((double) textLength / keyLength);

        // Create a 2D array to hold the characters
        char[][] grid = new char[numRows][keyLength];

        // Fill the grid with the characters from the plaintext
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < keyLength; j++) {
                if (index < textLength) {
                    grid[i][j] = plaintext.charAt(index);
                    index++;
                } else
                    grid[i][j] = ' ';
            }
        }

        // Rearrange the columns based on the key
        StringBuilder ciphertext = new StringBuilder();
        for (char c : key.toCharArray()) {
            int columnIndex = key.indexOf(c);
            for (int i = 0; i < numRows; i++)
                ciphertext.append(grid[i][columnIndex]);
        }

        // Returning the cipher string
        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, String key) {
        int keyLength = key.length();
        int textLength = ciphertext.length();

        // Calculate the number of rows needed
        int numRows = (int) Math.ceil((double) textLength / keyLength);

        // Calculate the number of columns
        int numColumns = keyLength;

        // Calculate the number of padding characters
        int numPaddingChars = (numRows * numColumns) - textLength;

        // Create a 2D array to hold the characters
        char[][] grid = new char[numRows][numColumns];

        // Fill the grid with the characters from the ciphertext
        int index = 0;
        for (char c : key.toCharArray()) {
            int columnIndex = key.indexOf(c);
            for (int i = 0; i < numRows; i++) {
                if (index < textLength) {
                    grid[i][columnIndex] = ciphertext.charAt(index);
                    index++;
                } else
                    grid[i][columnIndex] = ' ';
            }
        }

        // Read the characters from the grid to get the plaintext
        StringBuilder plaintext = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (plaintext.length() < textLength - numPaddingChars)
                    plaintext.append(grid[i][j]);
            }
        }

        // Returning plain string
        return plaintext.toString();
    }
}

