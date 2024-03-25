// Question Enter cost of 3 items from the user(using float data type) a pencil a pen and an eraser
// You have output the total cost of the items back to the user as their bill
// add on " you can try to add 18% gst tax to the items in the bill as advanced pattern"
import java.util.*;
class JavaBasics{
    public static void main(String args[]){
        // float e = 10.50f; //pencil
        // float f = 20.8f; //pen
        // float g = 12.50f; //eraser
        // float sum = (e + f + g)%18;
        // System.out.print(sum); basic of sum
        // trying additional using user input
        Scanner obj = new Scanner (System.in);
        System.out.println("Input your products price ");
        float pencil = obj.nextInt();
        float pen = obj.nextInt();
        float eraser = obj.nextInt();
        float sum = (pencil + pen + eraser);
        System.out.println(sum);
        // Add 18 %gst on bill
        float amount  = sum + (0.18f * sum);
        System.out.println("Bill with the tax of 18% is"+amount);
    }
}