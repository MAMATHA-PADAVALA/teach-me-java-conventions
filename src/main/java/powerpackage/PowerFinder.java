package powerpackage;

public class PowerFinder {
    public static int findPowerOf(int number,int exponent){
        int power=1;
        for(int powerfactor=1;powerfactor<=exponent;powerfactor++) power *= number;
        return  power;
    }
}
