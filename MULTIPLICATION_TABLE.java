import java.util.Scanner;
//multiplication table of n number:
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();
        int mul=0;
        for(int i=1;i<=10;i++){
            mul=a*i;
            System.out.printf("%d * %d = %d \n", a, i,mul);
        }
       
    
}
}
