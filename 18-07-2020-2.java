import java.util.LinkedList; 
import java.util.Iterator; 
public class LinkedList1
{  
public static void main(String args[])
{  
LinkedList<String> al=new LinkedList<String>();  
al.add("account");  
al.add("number");  
al.add("salary");  
al.add("addresss");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
} 