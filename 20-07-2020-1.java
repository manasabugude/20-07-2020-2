package com.java.serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class SerializingObject 
{
public static void main(String[] args) 
{
Employee employeeInput = null;
FileInputStream fis = null;
ObjectInputStream ois = null;
employeeInput = new Employee();
employeeInput.setSerializeValueName("Aman");
employeeInput.setNonSerializeValueSalary(50000);
try {
fis = new FileInputStream("Employee.ser");
ois = new ObjectInputStream(fis);
ois.writeObject(employeeInput);
System.out.println("Serialized data is saved in Employee.ser file");
ois.close();
fis.close();
} catch (IOException e) {

e.printStackTrace();
} 
}
}