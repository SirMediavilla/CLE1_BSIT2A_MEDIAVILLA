import java.util.Arrays;
class Variables
{
    //PHRASES TO EXECUTE
    protected String choose = "\n1.Order   2.Menu   3.Exit ";
    protected String choose2 = "Choose an Option: ";
    protected String end = "\nThank you and see you again!";

//======================================================================================================

    //MENU ITEMS
    public void list()
    {
        String[] m1 = {"a1. Coke", "a2. Nature Spring", "a3. Sprite"};
        String[] p1 = {"   P.75", "        P.30", "          P.75"};
        String[] m2 = {"b1. Pepsi", "b2. C2", "b3. Sunkist"};
        String[] p2 = {"   P.75", "   P.60", "       P.60"};
        String[] m3 = {"c1. Zesto", "c2. Royal", "c3. Real Leaf"};
        String[] p3 = {"    P.60", "     P.75", "       P.60"};

        System.out.println("\nCURRENT PRODUCTS");
        System.out.println(Arrays.asList(m1));
        System.out.println(Arrays.asList(p1));
        System.out.println();

        System.out.println(Arrays.asList(m2));
        System.out.println(Arrays.asList(p2));
        System.out.println();

        System.out.println(Arrays.asList(m3));
        System.out.println(Arrays.asList(p3));

        System.out.println();
    }
}
