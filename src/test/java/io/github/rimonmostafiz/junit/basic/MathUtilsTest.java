package io.github.rimonmostafiz.junit.basic;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When running MathUtils tests")
public class MathUtilsTest {

    private MathUtils mathUtils;

    private boolean serverIsUp;

    // When using @TestInstance annotation with PER_CLASS strategy
    // we can remove static form before all method
    /*@BeforeAll
    void beforeAll() {
        System.out.println("Before all musth be static as its runs before Initialization, Even before initialization of MathUtilTest");
    }*/

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all must be static as its runs before Initialization, \n - Even before initialization of MathUtilTest");
    }

    @BeforeEach
    public void init() {
        System.out.println("Before Each Method");
        mathUtils = new MathUtils();
        serverIsUp = false;
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after each test");
    }

    @Nested
    @DisplayName("add method")
    class AddTest {
        @Test
        @DisplayName("when adding two positive numbers")
        public void testAddPositive() {
            int actual = mathUtils.add(0, 1);
            assertEquals(1, actual, "should return right sum");
        }

        @Test
        @DisplayName("when adding two negative number")
        public void testAddNegative() {
            int actual = mathUtils.add(-10, -10);
            assertEquals(-20, actual, "should return right sum");
        }
    }

    @Test
    @DisplayName("Calculate Circle Area")
    public void testCalculateCircleArea() {
        double actual = mathUtils.calculateCircleArea(10);
        double expected = Math.PI * 100;
        assertEquals(expected, actual);
    }

    @Test
    @Disabled
    @DisplayName("Working on TDD, Should skip for now")
    public void incompleteMethod() {
        fail();
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    @DisplayName("Should Skip as I'm not using Linux")
    public void enableONLinux() {
        fail("On Linux this test should fail");
    }

    @Test
    public void runIfServerIsUp() {
        assumeTrue(serverIsUp);
        // write your test here;
    }
}
