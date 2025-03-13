public class method {
    public static void main(String[] args) {
        //problem 01
        String name = "KoTresh";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 02
        String text = "this is kotresh";
        text = text.replace(" ", "_");
        System.out.println(text);

        //problem 03
        String letter = "dear <|name|>, thanks a lot!";
        letter = letter.replace("<|name|>", "harry");
        System.out.println(letter);

        //problem 04
        String myString = "This string contains   double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // problem 05
        String myLetter = " Dear Harry,\n This java course is Nice.\n Thanks!";
        System.out.println(myLetter);
    }
}