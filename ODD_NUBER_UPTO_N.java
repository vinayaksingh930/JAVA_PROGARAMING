import java.util.Scanner;
//odd number upto n:
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();
        for( int i=1;i<=a;i++){
            int c=(i%2);
            if(c!=0){
            System.out.println(i);
        }
       
    }
}
}
