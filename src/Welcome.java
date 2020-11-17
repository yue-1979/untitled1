import java.util.Scanner;

public class Welcome
{
    public static void main(String[] args)
    {
        System.out.println("We will not use 'Hello, World!");
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.nextLine();
        System.out.println(name);
    }
}
