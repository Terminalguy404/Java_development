
class Total
{
    static int a,b,total;
    void sum()
    {
        total = a+b;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Total sum1 = new Total();
        sum1.a = 43;
        sum1.b = 4;
        sum1.sum();
        System.out.println("the sum of two numbers: " + sum1.total);
        //System.out.println("Hello world!");
    }
}