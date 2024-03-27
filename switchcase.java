import java.util.*;
class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new  Scanner (System.in);
        //printing 1-7 weeks in a month
        //solution :
        System.out.println("Input a number");
        int weeks = sc.nextInt();
        switch (weeks){
            case 1:
                System.out.println("Monday");
                break;
                 case 2:
                System.out.println("Tuesday");
                break;
                 case 3:
                System.out.println("Wednesday");
                break;
                 case 4:
                System.out.println("Thursday");
                break;
                 case 5:
                System.out.println("Friday");
                break;
                 case 6:
                System.out.println("Saturday");
                break;
                 case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("There are only 7 weeks in a month");
                
        }
    }
}