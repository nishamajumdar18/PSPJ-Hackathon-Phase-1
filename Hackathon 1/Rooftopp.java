import java.util.Scanner;
public class Rooftopp
{
    double calculateTotalEnergy(double morningEnergy, double eveningEnergy)
    {
        Scanner sc=new Scanner(System.in);
        double total;
        return total=morningEnergy+eveningEnergy;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MORNING ENERGY");
        double morningEnergy=sc.nextDouble();
        System.out.println("ENTER EVENING ENERGY");
        double  eveningEnergy=sc.nextDouble();
        System.out.println("MORNING ENERGY=" +morningEnergy);
        System.out.println("EVENING ENERGY=" +eveningEnergy);
        Rooftopp obj=new Rooftopp();
        double total=obj.calculateTotalEnergy(morningEnergy,eveningEnergy);
        System.out.println("TOTAL ENERGY=" +total);
    }
}