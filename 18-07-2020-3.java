import java.util.*;  
public class Vector1
{  
public static void main(String args[])
{  
Vector<String> v=new Vector<String>();  
v.add("matrix");  
v.add("Addition");  
v.add("substraction");  
v.add("division");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  