import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("How much money do you have?");
    int money = scan.nextInt();

    System.out.println("How much candy do you want to buy ");
    int candy = scan.nextInt();

    System.out.println(candy(change));
  }
  static double candy(double numDollars, int numCandy)
     {
      double c = 3 * numCandy ;
      double change = numDollars - c;

      return change;
     }
   static int seats(int num1, int num2)
  {
      return num1 + num2;
  }
     
  }
