import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int input;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number (0 to stop): ");
        input = in.nextInt();

        while (input != 0) {
            System.out.print("Enter a number (0 to stop): ");
            input = in.nextInt();
        }

        System.out.println("end of processing");
    }
}
