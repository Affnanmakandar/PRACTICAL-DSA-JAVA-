// question Input a 3 nos abc you have to output 
// the average of 3 nos hint (average of n nos divided by N)
import java.util.*;
 class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to find the average\n");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("Your average is:"+average);

    }
}