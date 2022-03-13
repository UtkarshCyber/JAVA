import java.util.Scanner;
class multiple<T,V>
{
  T obj1;
  V obj2;
multiple(T O1,V O2)
{
obj1=O1;
obj2=O2;
}
void showtypes()
{
System.out.println("Type of first"+obj1.getClass().getName());
System.out.println("Type of first"+obj2.getClass().getName());
}
T getobj1()
{return obj1;}
V getobj2()
{return obj2;}

public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter any string");
String s =scan.nextLine();
System.out.println("Enter any integer");
int i=scan.nextInt();
System.out.println("Enter any2 string");
String st =scan.nextLine();
System.out.println("Enter any double");
Double d=scan.nextDouble();
multiple<String,Integer>tgobj=new multiple<String,Integer>(s,i);
tgobj.showtypes();
String str=tgobj.getobj1();
System.out.println("Value of set1"+str);
int v=tgobj.getobj2();
System.out.println("Value of set1"+v);
System.out.println("");
multiple<String,Double>tgobj1=new multiple<String,Double>(st,d);
tgobj1.showtypes();
String strn=tgobj1.getobj1();
System.out.println("Value of set 2"+strn);
Double vd=tgobj1.getobj2();
System.out.println("Value of set2"+vd);
}
}