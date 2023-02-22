import java.util.Scanner;
//factorial:
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();
        int mul=1;
        for(int i=a;i>=1;i--){
           mul*=i;
          
        }
         System.out.println(mul);
    
}
}
