package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number)
    {
        int p0 = number%10;
        int p1 = (number/10)%10;
        int p2 = (number/100)%10;
        int p3 = (number/1000)%10;
        System.out.println(p2+p1+p0+p3);
    }
}
