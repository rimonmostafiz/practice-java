package org.rimonmostafiz.bitwise;

/**
 * @author Rimon Mostafiz
 */
public class BitwiseOperations {

    private final int secret = 88;

    /**
     * Method to get bits of a byte
     *
     * @param val a value in byte
     * @return a String contains
     */
    public String getBitOfByte(byte val) {
        StringBuilder bits = new StringBuilder();
        for (int i = 128; i > 0; i /= 2) {
            if ((val & i) != 0) bits.append("1");
            else bits.append("0");
        }
        return bits.toString();
    }

    /**
     * Method to convert upper case character to lowercase using bitwise AND operator,
     * Only difference between uppercase and lowercase character is the 6th bit,
     * when 6th bit is 0 then its uppercase, when its 1 then its lowercase.
     * <p>
     * Idea of this method is to flip the 6th bit using bitwise AND operator
     * Bit representation of number 65503 is 11111111 11111111 11111111 11011111
     *
     * @param ch lowercase character
     * @return an uppercase character
     */
    public char toUpperCharacter(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            int x = 65503;
            return (char) ((int) ch & x);
        } else {
            return ch;
        }
    }

    /**
     * Method to convert upper case character to lowercase using bitwise operation,
     * Only difference between uppercase and lowercase character is the 6th bit,
     * when 6th bit is 1 its lowercase and when its 0 then its uppercase.
     * <p>
     * Idea of this method is to flip the 6th bit using bitwise OR operation
     * Bit representation of number 32 is 00000000 00000000 00000000 00100000
     *
     * @param ch an uppercase character
     * @return a lowercase character
     */
    public char toLowerCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            int x = 32;
            return (char) ((int) ch | x);
        } else {
            return ch;
        }
    }

    /**
     * Method to encode a message using bitwise XOR operator
     * The outcome of a sequence of two XORs can produce the original value.
     * <p>
     * R1 = x  ^ y;
     * R2 = R1 ^ y;
     * Here R2 is same as x
     * <p>
     * We can use this interesting property to encode and decode a message using XOR.
     * To encode, the XOR operation is applied the first time, yielding the cipher text.
     * To decode, the XOR is applied a second time, yielding the plain text.
     *
     * @param message message to encode
     * @return encoded message which can further be decoded by {@link #decodeString(String)}
     */
    public String encodeString(String message) {
        StringBuilder encodedMsg = new StringBuilder();
        for (var i = 0; i < message.length(); i++) {
            encodedMsg.append((char) (message.charAt(i) ^ this.secret));
        }
        return encodedMsg.toString();
    }

    /**
     * Method to encode a message using bitwise XOR operator
     * The outcome of a sequence of two XORs can produce the original value.
     * <p>
     * R1 = x  ^ y;
     * R2 = R1 ^ y;
     * Here R2 is same as x
     * <p>
     * We can use this interesting property to encode and decode a message using XOR.
     * To encode, the XOR operation is applied the first time, yielding the cipher text.
     * To decode, the XOR is applied a second time, yielding the plain text.
     *
     * @param encodedMsg message to decode
     * @return actual text if previously its encoded using {@link #encodeString(String)}
     */
    public String decodeString(String encodedMsg) {
        StringBuilder decodedMsg = new StringBuilder();
        for (var i = 0; i < encodedMsg.length(); i++) {
            decodedMsg.append((char) (encodedMsg.charAt(i) ^ this.secret));
        }
        return decodedMsg.toString();
    }
}