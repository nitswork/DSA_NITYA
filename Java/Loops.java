import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = in.nextInt();
        //For Loop : Use when u know how many times the loop should run
        for (int i = n; i< 5; i++){
            System.out.println("Your Number is : "+i);
        }
        //Temperature
        System.out.println("Enter temp in C : ");
        float tempC = in.nextFloat();
        float tempF = (tempC*(9/5))+ 32;
        System.out.println(tempF);

        //Conditional Loops:
        int salary = 25000;
        if(salary > 10000){
            salary = salary + 5000;
        }else{
            salary = salary+1000;
        }
        System.out.println(salary);

        //multiple ifs:
        System.out.println("Enter salary: ");
        int salary2 = in.nextInt();
        if(salary2 >= 10000){
            salary2 = salary2 + 5000;
        } else if(salary2 < 5000){
            salary2 = salary2 +500;
        }
        else{
            salary2 = salary2+1000;
        }
        System.out.println(salary2);

        //While Loop:Use when u Don't know how many times the loop will run
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }

        // Do- While Loop: Loop will execute atleast once
        int ns = 1;
        do{
            System.out.println(ns);
            ns++;
        }while(ns<= 5);

        int a = 2;
        int b = 3;
        int c= 4;
        int max = a;
        if(b> max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        else{
            System.out.println("A is max");
        }
        System.out.println("The max ele : "+max);

        int max2 = Math.max(c, Math.max(a,b));
        System.out.println(max2);
    }
}
