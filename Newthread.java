class Newthread implements Runnable
{
String name;
long time1;
int x;
Thread t;
Newthread (String threadname,long time,int x1)
{
name=threadname;
x=x1;
time1=time;

}
public void run()
{
try
{
for (int i=x;i>0;i--)
{
System.out.println(this.name);
Thread.sleep(time1);
}
}
catch(InterruptedException e)
{
System.out.println(name+"Interrupted");
}
}
public static void main(String args[])
{
Newthread n1=new Newthread ("BMS COLLEGE OF ENGINEERING",1000,2);
Thread t1=new Thread(n1);
t1.start();
Newthread n2=new Newthread ("CSE",2000,10);
Thread t2=new Thread(n2);
t2.start();
}
}