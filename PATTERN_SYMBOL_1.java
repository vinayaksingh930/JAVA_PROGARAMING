import java.util.Scanner;
//pattern *:
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();

        for(int i=1 ;i<=a;i++){ 
            for(int j=a ;j>=i;j--){
                
        
            System.out.print('*');
        }
     System.out.println();
    }
}
}
