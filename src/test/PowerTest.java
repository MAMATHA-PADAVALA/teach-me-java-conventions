package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void sholudReturnOnePowerOneAsOne() {
        assert PowerFinder.findPowerOf(1,1) == 1;
    }

    @Test
    public void shouldReturnTwoPowerOneAsTwo() {
        assert PowerFinder.findPowerOf(2,1) == 2;
    }

    @Test
    public void shouldReturnTwoPowerTwoAsFour() {
        assert PowerFinder.findPowerOf(2, 2) == 4;
    }

    @Test
    public void shouldReturnThreePowerTwoAsNine() {
        assert PowerFinder.findPowerOf(3, 2) == 3*3;
    }
}
