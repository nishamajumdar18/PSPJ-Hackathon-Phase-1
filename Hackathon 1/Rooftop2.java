import java.util.Scanner;
public class Rooftop2
{
public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE AMOUNT OF ENERGY GENERATED IN kWh");
    double e=sc.nextDouble();
    if(e>=10)
    {
        System.out.println("GOOD ENERGY GENERATION");
    }
    else
    {
        System.out.println("LOW ENERGY GENERATION");
    }
    }
}