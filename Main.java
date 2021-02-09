import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("How much money do you have?");
    int money = scan.nextInt();

    System.out.println("How much candy do you want to buy ");
    int candies = scan.nextInt();

    System.out.println(candy(money, candies));
    
    System.out.println("How many people are seated");
    int chairs = scan.nextInt();
    
    System.out.println("How many seats are left?");
    int openChairs = scan.nextInt();
    
    System.out.println(seats(chairs, openChairs));
  }
  
  static double candy(double numDollars, int numCandy)
     {
      double c = 3 * numCandy ;
      double change = numDollars - c;

      return change;
     }
   static int seats(int numTables, int numSeats)
  {
    int t = 5 * numTables;
    int openSeats  = numSeats - t;
      return openSeats;
  }
     
  }
