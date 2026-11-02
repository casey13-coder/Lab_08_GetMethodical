public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        for(int c = -100; c <= 100; c++)
        {
            System.out.printf("%d C = %.1f F\n", c, CtoF(c));
        }
    }

    public static double CtoF(double celsius)
    {
        return celsius * 9 / 5 + 32;
    }
}