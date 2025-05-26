class A
 {
 int i,j;
 A()
 {
 i=0;
 j=0;
 }
A(int a,int b)
 {
 i=a;
 j=b;
 }
void show()
 {
System.out.println (“i and j:“+i+” “+j);
 }
}
class B extends A
 {
 int k;
B()
 {
 i=0;
 j=0;
 k=0;
 }
B(int a,int b,int c)
 {
 i=a;
 j=b;
 k=c;
 }
void show()
 {
 System.out.println ( “i and j:“+i+” “+j);
 System.out.println (“k:”+k);
 }
}
class Override
 {
 public static void main (String args[])
 {
 B subob=new B( 1,2,3);
 subob.show() ;
 }
} 
