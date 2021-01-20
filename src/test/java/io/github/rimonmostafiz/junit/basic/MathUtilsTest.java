package io.github.rimonmostafiz.junit.basic;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When running MathUtils tests")
public class MathUtilsTest {

    private MathUtils mathUtils;
    private boolean serverIsUp;
    private TestInfo testInfo;
    private TestReporter testReporter;

    // When using @TestInstance annotation with PER_CLASS strategy
    // we can remove static form before all method
    /*@BeforeAll
    void beforeAll() {
        System.out.println("Before all musth be static as its runs before Initialization, Even before initialization of MathUtilTest");
    }*/

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all must be static as its runs before Initialization, \n - Even before initialization of MathUtilTest");
    }

    @BeforeEach
    public void init(TestInfo testInfo, TestReporter testReporter) {
        System.out.println("Before Each Method");
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        mathUtils = new MathUtils();
        serverIsUp = false;
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after each test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all must be static, Method will run after all the test case of this class is finish");
    }

    @Nested
    @DisplayName("add method")
    @Tag("math")
    class AddTest {
        @Test
        @DisplayName("when adding two positive numbers")
        public void testAddPositive() {
            int actual = mathUtils.add(0, 1);
            assertEquals(1, actual, "should return right sum");
        }

        @Test
        @DisplayName("when adding two negative numbers")
        public void testAddNegative() {
            int actual = mathUtils.add(-10, -10);
            assertEquals(-20, actual, "should return right sum");
        }
    }

    @Test
    @DisplayName("Calculate Circle Area")
    @Tag("geo")
    public void testCalculateCircleArea() {
        double actual = mathUtils.calculateCircleArea(10);
        double expected = Math.PI * 100;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate Circle Area will fail")
    @Tag("geo")
    public void circleAreaWithWrongValueOfPI() {
        double actual = mathUtils.calculateCircleArea(10);
        double rightExpected = Math.PI * 100;
        double wrongExpected = 3.1417 * 100;
        assertEquals(rightExpected, actual, () -> "Supplier will construct this message lazily if test fails");
        assertEquals(wrongExpected, actual, () -> "Supplier will construct this message lazily, fails at " + Instant.now().toString());
    }

    @Test
    @DisplayName("Test Multiply method using assertAll")
    @Tag("math")
    public void testMultiply() {
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2, 2)),
                () -> assertEquals(0, mathUtils.multiply(2, 0)),
                () -> assertEquals(-9, mathUtils.multiply(-3, 3))
        );
    }

    @RepeatedTest(3)
    @DisplayName("Test Multiply method should be tested 3 times")
    @Tag("math")
    public void testMultiplyMultipleTimes(RepetitionInfo repetitionInfo) {
        assertEquals(4, mathUtils.multiply(2, 2));
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
