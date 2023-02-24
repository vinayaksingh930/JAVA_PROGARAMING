import java.util.Scanner;
//create an array of 3 floats and find their sum:
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        float []m=new float[3];
        for (int i=0;i<3;i++){
            m[i]=sc.nextFloat();
        }
        float n=0;
        for (int j=0;j<3;j++){
            n=n+m[j];
        }
    System.out.println(n);
}
}
