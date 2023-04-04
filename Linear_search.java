import java.util.Scanner;
//linear search:
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of student:");
        int x=sc.nextInt();
        int f=0,index=0;
        int []a=new int[x];
        for (int i=0;i<x;i++){
            System.out.println("enter the marks of student"+(i+1)+":");
            a[i]=sc.nextInt();
            //avg=avg+m[i];
        }
        System.out.println("enter the marks to be serched");
        int ele=sc.nextInt();
        for(int i=0;i<x;i++){
            if(a[i]==ele){
                f=1;
                index=i+1;
                break;
            }
        }
        if(f==1)
    System.out.println("pos of the number"+ index);
    else
    System.out.println("not found");
}
}
