import java.util.Scanner;
class Binarypattern7{
public static void main(String args[]){
int i,j,rows;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number of rows: ");
rows=scan.nextInt();
for(i=1; i<=rows; i++){
  for(j=1; j<=i; j++){
  if((i+j)%2==1){
      System.out.print("1");
  }
  else{
      System.out.print("0");
  }
  
}
System.out.println();
}
}
}
