// Question ; Input a side of a square you have to output a area of square
// Hint (Area of square = side *side )

import java.util.*;
class JavaBasics{
    public static void main(String args[]){
Scanner obj = new  Scanner(System.in);
System.out.println("Input a Number to find the area of square :\n");
int side = obj.nextInt(); 

int area = side * side ;
System.out.println ("Area of a square is\n"+area);
    }
}