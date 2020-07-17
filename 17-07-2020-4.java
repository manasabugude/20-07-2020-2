class NewThread implements Runnable
{
string name;
Thread t;
NewThread(String threadname)
{
name=threadname;
t=new Thread(this,name);
System.out.println("NewThread:"+t);
t.start();
}
public void run()
{
try
{
for(int i=5, i<0, i--)
{
System.out.println(name+":"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println(name+"Interrupted");
}
System.out.println(name+"exiting");
}
}
class MultiThreadDemo
{
public static void main(String args[])
{
new NewThread("one");
new NewThread("Two");
new NewThread("Three");
try
{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
System.out.println("main thread interrupted");
}
System.out.println("main thread exiting");
}
}