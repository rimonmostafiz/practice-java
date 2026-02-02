package com.rimonmostafiz.core.bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author rimonmostafiz
 */
public class BitwiseOperationsShould {

    private final BitwiseOperations bitwiseOperations = new BitwiseOperations();

    @Test
    public void convertToLowerCase() {
        char ch = bitwiseOperations.toLowerCharacter('A');
        Assertions.assertEquals('a', ch);

        ch = bitwiseOperations.toLowerCharacter('z');
        Assertions.assertEquals('z', ch);

        ch = bitwiseOperations.toLowerCharacter('9');
        Assertions.assertEquals('9', ch);
    }

    @Test
    public void convertToUpperCase() {
        char ch = bitwiseOperations.toUpperCharacter('a');
        Assertions.assertEquals('A', ch);

        ch = bitwiseOperations.toUpperCharacter('Z');
        Assertions.assertEquals('Z', ch);

        ch = bitwiseOperations.toUpperCharacter('1');
        Assertions.assertEquals('1', ch);

    }

    @Test
    public void encodeAndDecodeMessage() {
        String message = "This is a message";
        String encodedMessage = bitwiseOperations.encodeString(message);
        Assertions.assertNotNull(encodedMessage);
        Assertions.assertNotEquals(message, encodedMessage);

        String decodedMessage = bitwiseOperations.decodeString(encodedMessage);
        Assertions.assertNotNull(decodedMessage);
        Assertions.assertNotEquals(encodedMessage, decodedMessage);
        Assertions.assertEquals(message, decodedMessage);
    }

    @Test
    public void printBitsOfByte() {
        String bitOfByte = bitwiseOperations.getBitsOfByte((byte) 32);
        Assertions.assertNotNull(bitOfByte);
        Assertions.assertNotEquals("", bitOfByte);
        Assertions.assertEquals("00100000", bitOfByte);
    }

}