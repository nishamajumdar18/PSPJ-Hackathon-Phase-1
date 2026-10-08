import java.util.Scanner;
public class MovieTicket1
{
    String movieName;
     double ticketPrice;
     int numberOfTickets;

      MovieTicket1(String movieName, double ticketPrice , int numberOfTickets)
      {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
 public double calculateTotal()
    {
      total = ticketPrice * numberOfTickets;
    
    }

    public double calculateDiscount()
    {
        if(numberOfTickets>=5)
        {
        discount=total*10/100;
        }
    }

    public double calculateFinalAmount()
    {
   famount= total - discount;
    }

    public void displayBill()
    {
        System.out.println("MOVIE NAME=" +movieName);
        System.out.println("TICKET PRICE=" +ticketPrice);
        System.out.println("NO.OF TICKETS=" +numberOfTickets);
        System.out.println("DISCOUNT=" +discount);
        System.out.println("FINAL AMOUNT=" +famount);
    }
    public class ticket
    {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = sc.nextInt();

        MovieTicket1 A = new MovieTicket1(movieName, ticketPrice, numberOfTickets);

      
        A.displayBill();
    }
}
}