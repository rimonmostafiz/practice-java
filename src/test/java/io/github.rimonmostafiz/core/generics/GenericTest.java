package io.github.rimonmostafiz.core.generics;

import com.rimonmostafiz.core.generics.Generic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Rimon Mostafiz
 */

class GenericTest {

    @Test
    public void genericInteger() {
        Generic<Integer> aInt = new Generic<>();
        Generic<Integer> gInt = new Generic<>(12);
        Assertions.assertNotNull(aInt, "Should Not Null");
        Assertions.assertNull(aInt.getObj(), "Should Null");
        aInt.setObj(30);
        assertNotNull(aInt.getObj(), "Should Not Null");
        assertEquals(aInt.getObj(), 30, "Value should be 30");
        assertEquals(gInt.getObj(), 12, "Value should be 12");
        assertEquals(aInt.getTypeOfObj(), "java.lang.Integer", "Type should be Integer");
    }
}