package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int p0 = number%10;
        int p1 = (number/10)%10;
        int p2 = (number/100)%10;
        System.out.println(""+p0+p1+p2);
    }
}
