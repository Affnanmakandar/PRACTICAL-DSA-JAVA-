import java.util.*;
class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        // System.out.print("Input a number");
        // // ques 1 :  Write a Java program to get a number from the user and print whether it is positive or negative
        // int positive=sc.nextInt();
        // if (positive > 0 ){
        //     System.out.print("It is positive");
        // }else{
        //     System.out.print (" It is negative");
        // }
        //ques 2 : PRINT A CODE YOU HAVE A FEVER OR NOT
        // double  temperature = 103.5;
        // if (temperature > 100){
        //     System.out.print("You have a fever");
        // }else{
        //     System.out.print("You don't have a fever it means you are well");
        // }
        //que3 ; print whether it is leap year or not
           System.out.println("Input a year");
        int div = sc.nextInt() ;
     
    if ((div % 4 == 0)&& (div % 100 != 0)|| (div%100==0)){
        System.out.println("The year is a leap year"+div);
    }else{
        System.out.print(div+"it is not a leap year");
    }
    }
}