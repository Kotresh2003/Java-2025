import java.util.*; 
public class question {
    public static void main(String[] args) {
        int a = 75;
        int b = 80;
        int c = 90;
        int d = 68;
        int sum = a+b+c+d;
        System.out.println(sum);


        // question 2
        int marks1 = 75;
        int marks2 = 90;
        int marks3 = 97;
        int marks4 = 68;
        int cgpa = (marks1 +marks2 +marks3 +marks4)/40;
        System.out.println(cgpa);

        float marks1 = 75;
        float marks2 = 90;
        float marks3 = 97;
        float marks4 = 68;
        float cgpa = (marks1 +marks2 +marks3 +marks4)/40;
        System.out.println(cgpa);

        // question 3
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello" + name + "have a good day" );

        // question 5
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}