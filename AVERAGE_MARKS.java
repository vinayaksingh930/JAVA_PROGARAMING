import java.util.Scanner;
//average of n student marks:
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of student:");
        int x=sc.nextInt();
        float avg=0;
        float []m=new float[x];
        for (int i=0;i<x;i++){
            System.out.println("enter the marks of student"+(i+1)+":");
            m[i]=sc.nextFloat();
            avg=avg+m[i];
        }
        
    System.out.println("average is:"+(avg/x));
}
}
