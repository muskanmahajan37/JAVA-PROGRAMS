abstract class Base
{
 abstract void display(); //abstract method
}
class Parent extends Base
{
 void display()
 {
  System.out.println("Parent's display()");
 }
}
class Child extends Parent 
{
 void display() //Overriding
 {
  System.out.println("Child's display()");
 }
  int add(int x,int y)
 {
  return x+y;
 }
  double add(double x,double y) //Overloading
 {
  return x+y;
 }
}

class Implement
{ 
 public static void main(String args[])
 {
  Parent p= new Parent();
  p.display();
  Child c=new Child();
  c.display();
  System.out.println(c.add(3,6));
  System.out.println(c.add(3.0,6.0));
  p=c;
  p.display(); //Dispatch method
 }
}








