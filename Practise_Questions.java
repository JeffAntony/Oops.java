//Create a java class named Person with private attributes name and age. Provide a constructor to intializes these attributes and methods
//method to get them.
//class Person {
// private int age;
// void setAge(int age)
// {
// this.age=age;
// }
// int getAge()
// {
// return age;
// }
// void age()
// {
// System.out.println(age);
// }
// private String name;
//
// void setName(String name)
// {
// this.name=name;
// }
// String getName()
// {
// return name;
// }
// void name()
// {
// System.out.println(name);
// }
//}
//
//public class Main {
// public static void main(String[] args) {
//
// Person p = new Person();
// p.setAge(34);
// p.getAge();
// p.setName("Mukesh");
// p.getName();
// p.age();
// p.name();
// }
//}




// Create a subclass student that extends the Person class. Add a private attribute studentId and provide methods to get
// and set it.




//
//class Person {
// private String studentId;
//
//
// void setStudentId(String studentId) {
// this.studentId = studentId;
// }
//
// String getStudentId()
// {
// return studentId;
// }
//
// void add() {
// System.out.println("StudentId of the person ="+studentId);
// }
//
//}
//
//class Student extends Person {
//
// private String studentId;
//
// void setStudentId(String studentId)
// {
// this.studentId=studentId;
// }
// String getstudentId()
// {
// return studentId;
// }
// void ng()
// {
// System.out.println("StuddentId of the student = "+studentId);
// }
//}
//public class Main {
// public static void main(String[] args)
// {
// Person p = new Person();
// p.setStudentId("111AE");
// p.getStudentId();
// p.add();
// Student s = new Student();
// s.setStudentId("1124AGH");
// s.getstudentId();
// s.ng();
//
//
// }
//}


// Create an interface shape with a method CalculateArea(). Implemenent this interface with classes circle and Rectangle


//interface Shape
//{
// void calculateArea();
//
// }
//
// class B implements Shape {
// public void calculateArea()
// {
// System.out.print("Return I am");
// }
// }
//
// class D implements Shape
// {
//
// public void calculateArea()
// {
// System.out.println("Where I am ");
// }
//
//
// }
//
// public class Main {
// public static void main(String[] args) {
//
// new D().calculateArea();
// new B().calculateArea();
//
// }
//}




//
// Create a class BankAccount with attributes accountnumber ,balance , and owner. Add methods to deposit
// and withdraw funds.
//
//class ICICI {
//
// private int account_number=143534627;
// private int balance=6000;
// private String owner="Mukesh Kumar";
//
// void deposit(int deposit_amount)
// {
// int current_balance=deposit_amount+balance;
// System.out.println(account_number);
// System.out.println(owner);
// System.out.println("Total amount = "+current_balance);
// }
// void withdraw(int withdraw_amount)
// {
// System.out.println(account_number);
// System.out.println(owner);
// System.out.println("Current balance = "+(balance - withdraw_amount));
// }
//}
//
//class SBI extends ICICI{
//
// private int account_number=783433624;
// private int balance=12000;
// private String owner="Sushil Sen";
//
// void deposit(int deposit_amount)
// {
// int current_balance=deposit_amount+balance;
// System.out.println("account_number = "+account_number);
// System.out.println("owner ="+owner);
// System.out.println("Total amount = "+current_balance);
// }
// void withdraw(int withdraw_amount)
// {
// System.out.println("account_number"+account_number);
// System.out.println("owner"+owner);
// System.out.println("Current balance = "+(balance - withdraw_amount));
// }
//}
//public class Main {
//
// public static void main(String[] args) {
//
// ICICI k =new ICICI();
// k.deposit(4500);
// k.withdraw(2300);
// SBI s =new SBI();
// s.deposit(5000);
// s.withdraw(3400);
//
//
// }
//}




// Create an abstract class animal with a method makesound().Create subclasses Dog and cat that implements this method;


//abstract class Animal {
//
// void make_me_Sound()
// {
// System.out.println("sound of animals ");
// }
//
// }
//
// class Dog extends Animal {
//
// void make_me_sound()
// {
// System.out.println("barking sound");
// }
// }
//
// class Cat extends Animal {
//
// void make_me_sound()
// {
// System.out.println("meow meow");
// }
// }
// public class Main {
// public static void main(String[] args)
// {
// Dog k = new Dog();
// k.make_me_sound();
// Cat n = new Cat();
// n.make_me_sound();
// }
//}






// Create a car class with private attributes make, model and year. Provide a parameterless constructor and a constructor
// that makes these attributes as parameters


//class Car {
// private int make=1987;
// private String model="Hynundai verna ez";
// private int year=2019;
// Car()
// {
// System.out.println("make "+make);
// System.out.println("Model "+model);
// System.out.println("year = "+year);
// }
//
// Car(int make,String model,int year)
// {
// this.make=make;
// this.model=model;
// this.year=year;
// System.out.println(make);
// System.out.println(model);
// System.out.println(year);
// }
//}
//
//public class Main {
// public static void main(String[] args)
// {
// new Car();
// new Car(13,"Hyundai i10 es",2009);
//
// }
//}
//


// Create a class Calculator with methods for addition ,division,substraction,division.
// use method overloading to handle different argument types.


//class Calculator {
//
// void addition(int a,int b)
// {
// System.out.println(a+b);
// }
// int substraction (int a,int b)
// {
// return a-b;
// }
// void multiply(float b,int c)
// {
// System.out.println(c*b);
// }
// float division(float b,float c)
// {
// return b*c;
// }
//
//}
//
//public class Main {
// public static void main(String[] args) {
//
// new Calculator().addition(4,6);
// new Calculator().substraction(6,7);
// System.out.println( new Calculator().substraction(6,7));
// new Calculator().multiply(4.2f,3);
// System.out.println(new Calculator().division(3.2f,4.5f));
// }
//}


// Create an Interface Playable with a method for addition,multiplication,substraction
// and division . Use method overloading to handle diiferent argument types;


//
//interface Playable {
//
// void play();
//}
//
//class Guitar implements Playable {
//
// public void play() {
// System.out.println("playing guitar");
// }
//}
//
// class Piano implements Playable {
//
//
// public void play()
// {
// System.out.println("Piano sound ");
// }
//
// }
// public class Main {
// public static void main(String[] args) {
//
// new Guitar().play();
// new Piano().play();
//
// }
// }


// Create an abstract class shape with an abstract method CalculateArea(). Implement this class with
// subclasses Circle and Rectangle




//abstract class Shape {
//
// abstract void calculatearea();
//
//
// }
// class Circle extends Shape {
// void calculatearea()
// {
// System.out.println("Area of Circle");
// }
// }
//
// class Rectangle extends Circle {
//
// void calculatearea()
// {
// System.out.println("Area of Rectangle");
// }
// }
//
// public class Main{
// public static void main(String[] args) {
//
// Shape s = new Rectangle();
// s.calculatearea();
// new Circle().calculatearea();
//
// }
// }


// Create a class Book with private attributes title and author. Implement the equals () method to compare a
// two book objects Based on their title and author.


//class Book {
// private String title;
// private String author;
//
// void read(String title, String author) {
// this.title = title;
// this.author = author;
// }
//}
//
// public class Main {
// public static void main(String[] args) {
//
// Book a = new Book();
// a.read("Where is my home","William Shakespeare");
// Book b = new Book();
// b.read("Atomic habits","Joe tolstoy");
// System.out.println(a.equals(b));
// }
// }




// Create an interface Playable with a default method playMusic() . Create a class Mp3 Player that implements this
// interface and overrides the default method.


//interface Playable {
//
// default void playMusic()
// {
// System.out.println("Playing music very loudly");
// }
//}
//
//class Mp3Player implements Playable {
//
// public void playMusic()
// {
// System.out.println("Playing music loudly");
// }
//}
//
//public class Main {
// public static void main(String[] args)
// {
//
// Playable p = new Mp3Player() ;
// p.playMusic();
// }
//
// }


//Create an abstract class Shape with abstract methods CalculateArea() and calculatePerimeter().
// Implement this class with subclasses Circle and Rectangle.


//abstract class Shape {
//
// abstract void calculateArea();
//
// abstract void calculatePerimeter();
//
//}
//
//class Circle extends Shape {
//
// void calculateArea()
// {
// System.out.println("Shape of the Circle");
// }
// void calculatePerimeter()
// {
// System.out.println("Perimeter of the Circle");
// }
//
//
//}
//
//public class Main {
// public static void main(String[] args)
// {
// Shape s = new Circle();
// s.calculateArea();
// s.calculatePerimeter();
// }
//}




// Create an interface printable with a method print(). Implements this interface with classes Document
// and Image


//interface Printable {
//
// void print();
//}
//class Document implements Printable {
// public void print() {
// System.out.println("Aadhar is printed ");
//
// }
//}
//
//class Image extends Document implements Printable {
//
// public void print()
// {
// System.out.println("Printing the Image");
// }
//}
//
//public class Main {
// public static void main(String[] args) {
//
// Printable p = new Image();
// p.print();
// new Document().print();
// }
//}




// Create an superclass Vehicle with private attributes make and model
// Derive two subclasses Car and Motorcycle from Vehicle. Implement constructors and methods to
// display vehicle information


class Vehicle {
private String make="Build materaial";
private String model="hj235";
void g ()
{
System.out.println("Making the vehicle"+make+model);
}
void h()
{
System.out.println("Model of the vehicle"+make+model);
}
}


class Car extends Vehicle {


void p()
{
System.out.println("Car manufacturing");
}
void f()
{
System.out.println("Vehicle manufacturing");
}
}


class MotorCycle extends Vehicle {


void p()
{
System.out.println("MotorCycle manufacturing");
}
void f()
{
System.out.println("MotorCycle manufacturing");
}
}
public class Main {
public static void main(String[] args) {


new MotorCycle().p();


new MotorCycle().f();


new MotorCycle().p();
new Car().p();
new Car().f();
new Vehicle().g();
new Vehicle().h();


}
}

