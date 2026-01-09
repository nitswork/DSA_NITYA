package Java;
import java.util.*;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println("Enter your word: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <='z'){
            System.out.println(ch + " is a LowerCase Letter");
        }else{
            System.out.println(ch + " is an UpperCase Letter");
        }
        //.trim is for removingg extra spaces from the input string
    }
}
