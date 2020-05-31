package org.rimonmostafiz.bitwise;

/**
 * @author Rimon Mostafiz
 */
public class BitwiseOperations {

    private final int secret = 88;

    public void printBitOfByte(byte val) {
        for (int i = 128; i > 0; i /= 2) {
            if ((val & i) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
    }

    public char toUpperCharacter(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            int x = 65503;
            return (char)((int) ch & x);
        } else {
            return ch;
        }
    }

    public char toLowerCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            int x = 32;
            return (char)((int) ch | x);
        } else {
            return ch;
        }
    }

    public String encodeString(String message) {
        StringBuilder encodedMsg = new StringBuilder();
        for (var i = 0; i < message.length(); i++) {
            encodedMsg.append((char) (message.charAt(i) ^ this.secret));
        }
        return encodedMsg.toString();
    }

    public String decodeString(String encodedMsg) {
        StringBuilder decodedMsg = new StringBuilder();
        for (var i = 0; i < encodedMsg.length(); i++) {
            decodedMsg.append((char) (encodedMsg.charAt(i) ^ this.secret));
        }
        return decodedMsg.toString();
    }
}
