import java.util.Scanner;

public class Inputter {

    protected static float a;
    protected static float b;

    public static void inputting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer A");
        a = scanner.nextInt();
        System.out.println("Input integer B");
        b = scanner.nextInt();
        scanner.close();
    }

}
