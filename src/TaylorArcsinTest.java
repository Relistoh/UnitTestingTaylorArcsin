import static org.junit.jupiter.api.Assertions.*;

class TaylorArcsinTest {
    TaylorArcsin a = new TaylorArcsin();

    @org.junit.jupiter.api.Test
    void returnTaylorArcsinTest1() {
        assertTrue(Math.abs(a.returnTaylorArcsin(5, 0.99) - Math.asin(0.99)) < 0.00001);
    }

    @org.junit.jupiter.api.Test
    void returnTaylorArcsinTest2() {
        assertTrue(Math.abs(a.returnTaylorArcsin(12, -0.999) - Math.asin(-0.999)) < Math.pow(10, -12));
    }

    @org.junit.jupiter.api.Test
    void returnTaylorArcsinTest3() {
        assertTrue(Math.abs(a.returnTaylorArcsin(10, 0.01) - Math.asin(0.01)) < Math.pow(10, -10));
    }

    @org.junit.jupiter.api.Test
    void returnTaylorArcsinTest4() {
        assertTrue(Math.abs(a.returnTaylorArcsin(10, 0) - Math.asin(0)) < Math.pow(10, -10));
    }

    @org.junit.jupiter.api.Test
    void returnTaylorArcsinTest5() {
        assertTrue(Math.abs(a.returnTaylorArcsin(3, 0.54) - Math.asin(0.54)) < Math.pow(10, -3));
    }
}