package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String myword = input.nextLine();
        char[] myletters = new char[myword.length()];
        for(int i = 0;i < myletters.length;i++) {
            myletters[i] = myword.charAt(i);
            System.out.print(myletters[i]);
        }
        for(int i=myletters.length-1;i >= 0;i--) {
            System.out.println(myletters[i]);
        }
    }
    
}
