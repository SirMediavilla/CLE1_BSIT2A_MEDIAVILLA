import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Menu M = new Menu();
        Variables P = new Variables();

        int ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nVENDING MACHINE");

            //ENTER OPTION
            System.out.println(P.choose);
            System.out.print(P.choose2);
            ch = sc.nextInt();

            switch (ch)
            {
                //ORDERING
                case 1:
                    M.order();
                    break;

                //DISPLAY VENDING MACHINE CONTENTS
                case 2:
                    P.list();
                    break;

                //EXIT
                case 3:
                    System.out.println(P.end);
                    break;
            }
        }
        while (ch != 3);
    }

}