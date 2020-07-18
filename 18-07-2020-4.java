import java.util.Stack;
import java.util.Iterator;  
public class Stack1
{  
public static void main(String args[])
{  
Stack<String> stack = new Stack<String>();  
stack.push("A");  
stack.push("B");  
stack.push("P");  
stack.push("M");  
stack.push("G");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  