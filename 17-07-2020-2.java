abstract class Animal
{
public abstract void animalSound(); //abstract method
public void sleep() //regular method
{
System.out.println("Zzzz");
}
}
class Pig extends Animal
{
public void animalSound()
{
System.out.println("the pig says : baa baa");
}
}
class MyMainClass
{
public static void main(String args[])
{
Pig myPig=new Pig();
myPig.animalSound();
myPig.sleep();
}
}
