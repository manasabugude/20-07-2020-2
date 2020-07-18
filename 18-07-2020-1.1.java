import java.util.ArrayList;
public class Student
{
String name;
int id;
public Student(String name, int id)
{
this.name = name;
this.id = id;
}
public static void main(String[] anyString)
{
Student s1 = new Student("Ammar", 1);
Student s2 = new Student("Ahmad", 2);
Student s3 = new Student("Arslan", 3);
ArrayList<Student> someList = new ArrayList<Student>();
boolean empty = someList.isEmpty();
if (empty == true)
System.out.println("ArrayList is Empty \n\n");
someList.add(s1);
someList.add(s2);
someList.add(s3);
if (someList.isEmpty())
System.out.println("ArrayList is Empty");
else
System.out.printf("Our ArrayList someList has a total of %d Members \n\n",
someList.size());
for (Student student : someList)
{
System.out.println(student);
}
}
@Override
public String toString()
{
return "Student [name=" + name + ", id=" + id + "]";
}
}