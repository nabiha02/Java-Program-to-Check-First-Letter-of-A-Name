import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next();

        System.out.println("Your name is: "+name);

        char firstLetter = name.charAt(0);

        if(firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I' || firstLetter == 'O' || firstLetter == 'U'){
            System.out.println("The name starts with Vowel");
        }else{
            System.out.println("THe name starts with Consonent");
        }

    }

}
