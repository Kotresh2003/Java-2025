import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        String name = new String("kotresh");
        String name = "harry";
        System.out.print("The name is: ");
        System.out.println(name);
        int a = 20;
        float b = 5.888f;
        System.out.printf("the value of a is %d and value of b is %20.2f", a, b);
        System.out.format("the value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
        // String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);
    }
}