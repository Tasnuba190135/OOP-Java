class A
{
int i, j;
void showij()
{
System.out.println (“ i and j: “ + i +” “+ j );
}
}
class B extends A
{
int k;
void showk()
{
System.out.println ( “K: “ + k);
}
void sum()
{
System.out.println (“ i + j + k: “ + ( i + j + k ) );
}
}
class Inherit
{
public static void main (String args[])
{
A superOb = new A();
B subOb = new B();
superOb.i = 10;
superOb.j = 20;
System.out.println(“Contents of superOb:”);
super Ob.showij() ;
System.out.println ( ); 
subOb. i = 1;
subOb. j = 2;
subOb. k = 3;
System.out.println (“Contents of supOb:” );
subOb.showij ( ) ;
subOb.showk ( );
System.out.println ( );
System.out.println (“Sum of i, j and k in subob:” );
subOb.sum ( );
}
}
