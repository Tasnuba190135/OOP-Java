public class Triangle
{
  public static void main(String[]args)
  { 
     for(int i=1;i<=5;i++)
     {
         for(int k=1;k<=5-i+1;k++)
         {
             System.out.print(" ");
         } 
         int num = 1;
         for(int j=1;j<=i;j++)
         {
             System.out.print(num);
             num++;
         } 
         System.out.println();
     }
  } 
}
