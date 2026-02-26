import java.util.Scanner;
public class symmetric{
   int r,c;
   int[][]arr;
   public void get(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of rows");
       r=sc.nextInt();
       System.out.println("Enter number of columns");
       c=sc.nextInt();
       arr=new int[r][c];
       System.out.println("Enter matrix elements:");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr[i][j]=sc.nextInt();
           }
       }
   }
   public void issym(){
       int flag=0;
       if(r !=c){
           System.out.println("Matrix is not symmetric");
           return;
       }
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(arr[i][j] !=arr[j][i]){
                   flag=1;
                   break;
               }
           }
       }
       if(flag==0)
       System.out.println("Matrix is symmetric");
       else
          System.out.println("Matrix is not symmetric");
       }
       public static void main(String[]args){
           symmetric matrix=new symmetric();
           matrix.get();
           matrix.issym();
       }
 }
