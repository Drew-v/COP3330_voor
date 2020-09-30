import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {

    @Test
    public void testCalcBMICategory1() {
        BodyMassIndex BMI = new BodyMassIndex(60, 94);
        double answer = BMI.calcBMI();
        double scale = Math.pow(10, 1);
        answer = Math.round(answer*scale)/scale;
        assertEquals(18.4, answer);                             //this test checks both methods in BodyMassIndex for category 1

        int testCategory = BMI.calcBMICategory();                       //rounding to account for expected behavior when printing
        assertEquals(1, testCategory);
    }
    @Test
    public void testCalcBMICategory1_1() {
        BodyMassIndex BMI = new BodyMassIndex(60, 94.5);
        double answer = BMI.calcBMI();
        double scale = Math.pow(10, 1);
        answer = Math.round(answer*scale)/scale;
        assertEquals(18.5, answer);                             //this test checks both methods in BodyMassIndex for category 1

        int testCategory = BMI.calcBMICategory();
        assertEquals(1, testCategory);
    }
    @Test
    public void testCalcBMICategory2() {
        BodyMassIndex BMI = new BodyMassIndex(74, 190);
        double answer = BMI.calcBMI();
        double scale = Math.pow(10, 1);
        answer = Math.round(answer*scale)/scale;
        assertEquals(24.4, answer);                             //this test checks both methods in BodyMassIndex for category 2

        int testCategory = BMI.calcBMICategory();
        assertEquals(2, testCategory);
    }
    @Test
    public void testCalcBMICategory3() {
        BodyMassIndex BMI = new BodyMassIndex(78, 259);
        double answer = BMI.calcBMI();
        double scale = Math.pow(10, 1);
        answer = Math.round(answer*scale)/scale;
        assertEquals(29.9, answer);                             //this test checks both methods in BodyMassIndex for category 3

        int testCategory = BMI.calcBMICategory();
        assertEquals(3, testCategory);
    }
    @Test
    public void testCalcBMICategory4() {
        BodyMassIndex BMI = new BodyMassIndex(78, 450);
        double answer = BMI.calcBMI();
        double scale = Math.pow(10, 1);
        answer = Math.round(answer*scale)/scale;
        assertEquals(52, answer);                             //this test checks both methods in BodyMassIndex for category 4

        int testCategory = BMI.calcBMICategory();
        assertEquals(4, testCategory);
    }
}