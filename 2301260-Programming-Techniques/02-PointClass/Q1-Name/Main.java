import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int spaceIndex, secondIndex;
        String ultimate = new String();
        String firstname = new String();
        String lastname = new String();
        String age = new String();
        Scanner brother = new Scanner(System.in);
        System.out.print("Enter firstname lastname age: ");
        ultimate = brother.nextLine().trim();
        spaceIndex = ultimate.indexOf(" ");
        secondIndex = ultimate.indexOf(" ", spaceIndex+1);
        firstname = ultimate.substring(0, spaceIndex);
        lastname = ultimate.substring(spaceIndex+1, secondIndex);
        age = ultimate.substring(secondIndex+1);
        System.out.println(lastname + ", " + firstname + " is " + age + " years old.");
    }
}
