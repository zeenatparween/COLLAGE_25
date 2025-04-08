class Operator{
Public static void main(String args[]){
int a = 80;
int b = 50;
// Arithematic Operator
System.out.println("Arithematic Operator: ");
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a/b);
System.out.println(a%b);
System.out.println(-a%b);
System.out.println(a%-b);

// Assignment Operator
System.out.println("Assignment Operator: ");
int z, x = 90;
int y = 100;
System.out.println(z = x);
System.out.println( y = z+x);

// Comparision Operator
System.out.println("Comparision Operator:");
int n1 = 60;
int n2 = 80;
if(n1>n2)System.out.println("n1 is greator");
if(n1>=n2)System.out.println("n1 is greator");
if(n1<n2)System.out.println("n1 is smaller");
if(n1<=n2)System.out.println("n1 is smaller");

//Bitwise Operator
System.out.println("Bitwise Operator");
int p = 01001;
int q = 10010;
System.out.println(p&q);
System.out.println(p|q);
System.out.println(p^q);
System.out.println(~q);

// Logical Operator
System.out.println("Logical Operator");
if((x+y)&&(a+b))System.out.println("Equal");
else System.out.println("Not Equal");

if((x+y)||(a+b))System.out.println("true");
else System.out.println("False");

// System.out.println("Uniary Operator");
System.out.println(a++);
System.out.println(a--);
System.out.println(++a);
System.out.println(--a);
System.out.println(a++ + ++);

}

