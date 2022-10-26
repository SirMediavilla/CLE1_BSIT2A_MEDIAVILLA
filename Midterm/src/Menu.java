import java.util.Scanner;
class Menu extends Variables
{
    //VARIABLES
    private int soda = 75;
    private int water = 30;
    private int juice = 60;
    private int payment;
    private String drink;

//======================================================================================================
    //ORDERING A DRINK
    public void order()
    {
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.print("\nWhich drink would you like to order?: ");
        drink = in.next();

        if(drink.matches("a1|a3|b1|c2"))
        {
            System.out.print("\nPayment Amount: ");
            payment = scan.nextInt();

            if (payment >= soda)
            {
                System.out.println("Your change is: P." + (payment - soda));
            }

            else if (payment < soda)
            {
                System.out.print("Insufficient Amount!\n");
            }
        }

        else if (drink.matches("a2"))
        {
            System.out.print("\nPayment Amount: ");
            payment = scan.nextInt();

            if (payment >= water)
            {
                System.out.println("Your change is: P." + (payment - water));
            }

            else if (payment < water)
            {
                System.out.print("Insufficient Amount!\n");
            }
        }

        else if (drink.matches("b2|b3|c1|c3"))
        {
            System.out.print("\nPayment Amount: ");
            payment = scan.nextInt();

            if (payment >= juice)
            {
                System.out.println("Your change is: P." + (payment - juice));
            }

            else if (payment < juice)
            {
                System.out.print("Insufficient Amount!\n");
            }
        }

        else
        {
            System.out.print("\n===Product not found===\n");
        }

    }
}