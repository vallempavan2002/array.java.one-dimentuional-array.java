import java.util.*;
public class Main 
{
        public static void main(String [] args)
        {
              Scanner sc=new Scanner(System.in);
              int arr[]=new int [5];
              System.out.println("enter the number");
              for(int i=0;i<arr.length;i++)
              {
                      arr[i]=sc.nextInt();
                      
              }
              for(int i=0;i<arr.length;i++)
              {
                      System.out.print(arr[i]+" ");
              }
        }
}
