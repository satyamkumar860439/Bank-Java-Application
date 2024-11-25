import java.util.*;

class Bank
{
     static double balence =0;
     public static void main(String[]args)
     {
        Scanner sc=new Scanner(System.in);
        int option =0;
        while(option!=4)
        {
            System.out.println("Welcome to Bank of Java");
            System.out.println("1.Check Balence");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.exit");
            System.out.println("Enter an option");
             option = sc.nextInt();
             switch(option)
             {
                case 1:
          checkBalance();
          break;
        case 2:
          deposit();
          break;
        case 3:
          withdraw();
          break;
        case 4:
          exit();
          break;
        default:
          System.out.println("Invalid option. Try again.");
          break;
             
        }
        }
     }
     public static void checkBalance()
     {
         System.out.println("Your current Balence is $" +balence);   
     }
     public static void deposit()
     {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amout of deposit");
        double amount=sc.nextDouble();
        balence=balence+amount;
        System.out.println("$"+amount+"has been deposit to your account");
        checkBalance();
     }
     public static void withdraw()
     {
      Scanner sc=new Scanner(System.in);
      double amount=sc.nextDouble();
      if(amount>balence)
      {
        System.out.println("Insufficient funds");
      }
      else
      {
        balence=balence-amount;
        System.out.println("$"+amount+ "has been withdrawn from  your account");
      }
      checkBalance();
     }
     public static void exit()
     {
      System.out.println("Thank you for bank with us.Have a nice day");
     }
}