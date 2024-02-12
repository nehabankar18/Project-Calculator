import java.util.Scanner;

class calci{
   
   Float add(Float a, Float b){
     return a+b;
   }
   Float sub(Float a, Float b){
    return a-b; 
   }
   Float mul(Float a, Float b){
    return a*b;
   }
   Float div(Float a, Float b){
    return a/b;
   }
     public static void main (String[] args){
    Float a;
    Float b;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the 1st number: ");
    a=sc.nextFloat();
    System.out.println("Enter the 2nd number: ");
    b=sc.nextFloat();
    System.out.println("Addition of 2 numbers: "+add(a,b));
    System.out.println("substraction of 2 numbers: "+sub(a,b));
    System.out.println("multiplication of 2 numbers: "+mul(a,b));
    System.out.println("division of 2 numbers: "+div(a,b));
    



}
}

