//
//////
////abstract class Mahindra {
////    abstract void engine();
////
////                   void th()
////                   {
////                       System.out.println("help");
////                   }
////
////}
////  class Car extends Mahindra{
////    void engine()
////    {
////        System.out.println("area");
////    }
////  }
////
////  class Thar extends Mahindra {
////    void engine()
////    {
////        System.out.println("hii");
////    }
////  }
////
////  public class Main{
////    public static void main(String[] args)
////    {
////        Car c =new Car();
////        c.engine();
////        c.th();
////        Thar p = new Thar();
////        p.engine();
////    }
////  }
//
////
////abstract class Mahindra{
////    abstract void engine(); //method declare
////}
////class Car extends Mahindra{
////    void engine() //method define
////    {
////        System.out.println("area");
////    }
////}
////class Thar extends Mahindra{
////    void hondaengine()
////    {
////        System.out.println("hiii");
////    }
////}
////public class Main{
////    public static void main(String[] args)
////    {
////        Car c=new Car();
////        c.engine();
////        Thar p=new Thar();
////        p.engine();
////    }
////}
////
////
////abstract class Mahindra{
////    abstract void engine(); //method declare
////    void add()
////    {
////        System.out.println("hello");
////    }
////}
////class Car extends Mahindra{
////    void engine() //method define
////    {
////        System.out.println("area");
////    }
////}
////class Thar extends Mahindra{
////    void engine()
////    {
////        System.out.println("hiii");
////    }
////}
////public class Main{
////    public static void main(String[] args)
////    {
////        Mahindra m=new Mahindra();
////        m.add();
////        Car c=new Car();
////        c.engine();
////        Thar p=new Thar();
////        p.engine();
////    }
////}
//
//////basic code
////abstract class Mahindra{
////    abstract void engine(); //method declare
////    void add()
////    {
////        System.out.println("hello");
////    }
////}
////class Car extends Mahindra{
////    void engine() //method define
////    {
////        System.out.println("area");
////    }
////}
////class Thar extends Mahindra{
////    void engine()
////    {
////        System.out.println("hiii");
////    }
////}
////public class Main {
////    public static void main(String[] args) {
////        /*Mahindra m=new Mahindra();
////        m.add();*/
////        Car c = new Car();
////        c.add();
////        c.engine();
////        Thar p = new Thar();
////        p.engine();
////    }
////}
//
//
//
/////(1)
//
//
////abstract class Shape {
////    abstract void area();
////    abstract void volume();
////
////}
////
////   class Circle extends Shape  {
////       void area() {
////           System.out.println(" area of circle");
////       }
////
////
////       void volume() {
////           System.out.println("volume of circle");
////       }
////
////
////
////        }
////
////        class Rectangle {
////    void area()
////    {
////        System.out.println("Area of rectangle ");
////    }
////    void volume()
////    {
////        System.out.println(" volume of Rectangle ");
////    }
////        }
////
////public class Main {
////    public static void main(String[] args) {
////        Circle t = new Circle();
////        t.area();
////        t.volume();
////        Rectangle r = new Rectangle();
////        r.area();
////        r.volume();
////
////    }
////}
////
//
/////(2)
//
////abstract class Bike{
////    abstract void horn();
////    abstract void engine();
////    abstract void tyre();
////    abstract void headlight();
////
////
////}
////
////class Honda extends Bike{
////    void horn()
////    {
////        System.out.println(" bike's horn ");
////    }
////    void engine()
////    {
////        System.out.println("bike having engine");
////    }
////    void tyre()
////    {
////        System.out.println("bike hvaing tyre");
////    }
////    void headlight()
////    {
////        System.out.println(" bike having headlight");
////    }
////}
////
////class Hero extends Bike{
////    void horn()
////    {
////        System.out.println(" hero's horn ");
////    }
////    void engine()
////    {
////        System.out.println("hero's engine");
////    }
////    void tyre()
////    {
////        System.out.println("Hero bike");
////    }
////    void headlight()
////    {
////        System.out.println(" hero headlight");
////    }
////
////}
////
////class TVS extends Bike{
////    void horn()
////    {
////        System.out.println(" TVS Horn ");
////    }
////    void engine()
////    {
////        System.out.println("TVS Engine");
////    }
////    void tyre()
////    {
////        System.out.println("TVS tyre");
////    }
////    void headlight()
////    {
////        System.out.println(" TVS headlight");
////    }
////
////}
////
////class Bullet extends Bike{
////    void horn()
////    {
////        System.out.println(" Bullet Horn ");
////    }
////    void engine()
////    {
////        System.out.println("Bullet Engine");
////    }
////    void tyre()
////    {
////        System.out.println("Bullet  tyre");
////    }
////    void headlight()
////    {
////        System.out.println(" Bullet  headlight");
////    }
////
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        Honda t =new Honda();
////        t.horn();
////        t.engine();
////        t.tyre();
////        t.headlight();
////        Hero y =new Hero();
////        y.horn();
////        y.engine();
////        y.tyre();
////        y.headlight();
////        TVS v =new TVS();
////        v.horn();
////        v.engine();
////        v.tyre();
////        v.headlight();
////        Bullet b =new Bullet();
////        b.horn();
////        b.engine();
////        b.tyre();
////        b.headlight();
////
////
////    }
////}
//
//////(3)//
////abstract class  Smartphone {
////    abstract void camera();
////       void audio()
////       {
////           System.out.println("Smartphone");
////       }
////       abstract void video();
////       void youtube()
////       {
////           System.out.println("Smart Youtube");
////       }
////      abstract void google();
////          void charger()
////          {
////              System.out.println(" Smart charger");
////          }
////          abstract void sim();
////}
////
////class Vivo extends Smartphone {
////    void camera()
////    {
////        System.out.println(" Vivo is Smartphone");
////    }
////    void video()
////    {
////        System.out.println(" Vivo video ");
////    }
////    void youtube()
////    {
////        System.out.println("Vivo Youtube");
////    }
////    void google()
////    {
////        System.out.println("Vivo google");
////    }
////    void charger()
////    {
////        System.out.println(" Vivo charger");
////    }
////    void sim()
////    {
////        System.out.println("Vivo Sim");
////    }
////}
////
////class Samsung extends Smartphone{
////    void camera()
////    {
////        System.out.println(" Samsung is Smartphone");
////    }
////    void video()
////    {
////        System.out.println(" Samsung video ");
////    }
////    void youtube()
////    {
////        System.out.println(" Samsung Youtube");
////    }
////    void google()
////    {
////        System.out.println(" Samsung google");
////    }
////    void charger()
////    {
////        System.out.println(" Samsung charger");
////    }
////    void sim()
////    {
////        System.out.println("Samsung Sim");
////    }
////}
////
////class Oppo extends Smartphone{
////    void camera()
////    {
////        System.out.println(" Oppo is Smartphone");
////    }
////    void video()
////    {
////        System.out.println(" Oppo video ");
////    }
////    void youtube()
////    {
////        System.out.println(" Oppo Youtube");
////    }
////    void google()
////    {
////        System.out.println(" Oppo google");
////    }
//////    void charger()
//////    {
//////        System.out.println(" Oppo charger");
//////    }
////    void sim()
////    {
////        System.out.println("Oppo Sim");
////    }
////}
////
////class Oneplus extends Smartphone{
////    void camera()
////    {
////        System.out.println(" Oneplus is Smartphone");
////    }
////    void video()
////    {
////        System.out.println(" Oneplus  video ");
////    }
////    void youtube()
////    {
////        System.out.println(" Oneplus  Youtube");
////    }
////    void google()
////    {
////        System.out.println(" Oneplus  google");
////    }
////    void charger()
////    {
////        System.out.println(" Oneplus  charger");
////    }
////    void sim()
////    {
////        System.out.println("Oneplus  Sim");
////    }
////}
////
////
////class Nokia extends Smartphone{
////    void camera()
////    {
////        System.out.println(" Oneplus is Smartphone");
////    }
////    void video()
////    {
////        System.out.println(" Oneplus  video ");
////    }
////    void youtube()
////    {
////        System.out.println(" Oneplus  Youtube");
////    }
////    void google()
////    {
////        System.out.println(" Oneplus  google");
////    }
////    void charger()
////    {
////        System.out.println(" Oneplus  charger");
////    }
////    void sim()
////    {
////        System.out.println("Oneplus  Sim");
////    }
////}
////
////class Infinix extends Smartphone{
////    void camera()
////    {
////        System.out.println(" Infinix is Smartphone");
////    }
////    void video()
////    {
////        System.out.println(" Infinix   video ");
////    }
////    void youtube()
////    {
////        System.out.println(" Infinix  Youtube");
////    }
////    void google()
////    {
////        System.out.println(" Infinix  google");
////    }
////    void charger()
////    {
////        System.out.println(" Infinix   charger");
////    }
////    void sim()
////    {
////        System.out.println("Infinix   Sim");
////    }
////}
////
////
////class Mi extends Smartphone{
////    void camera()
////    {
////        System.out.println(" Mi is Smartphone");
////    }
////    void video()
////    {
////        System.out.println(" Mi   video ");
////    }
////    void youtube()
////    {
////        System.out.println(" Mi  Youtube");
////    }
////    void google()
////    {
////        System.out.println(" Mi  google");
////    }
////    void charger()
////    {
////        System.out.println(" Mi  charger");
////    }
////    void sim()
////    {
////        System.out.println("Mi  Sim");
////    }
////}
////
////class Redmi extends Smartphone{
////    void camera()
////    {
////        System.out.println(" Redmi is Smartphone");
////    }
////    void video()
////    {
////        System.out.println(" Redmi   video ");
////    }
////    void youtube()
////    {
////        System.out.println(" Redmi  Youtube");
////    }
////    void google()
////    {
////        System.out.println(" Redmi  google");
////    }
////    void charger()
////    {
////        System.out.println(" Redmi  charger");
////    }
////    void sim()
////    {
////        System.out.println("Redmi  Sim");
////    }
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        Vivo v= new Vivo();
////        v.youtube();
////        v.camera();
////        v.google();
////        v.charger();
////        v.sim();
////        v.video();
////        Samsung s= new Samsung();
////        s.youtube();
////        s.camera();
////        s.google();
////        s.charger();
////        s.sim();
////        s.video();
////        Oppo p= new Oppo();
////        p.youtube();
////        p.camera();
////        p.google();
////        p.charger();
////        p.sim();
////        p.video();
////        Oneplus l= new Oneplus();
////        l.youtube();
////        l.camera();
////        l.google();
////        l.charger();
////        l.sim();
////        l.video();
////       Nokia n = new Nokia();
////        n.youtube();
////        n.camera();
////        n.google();
////        n.charger();
////        n.sim();
////        n.video();
////        Infinix i= new Infinix();
////        i.youtube();
////        i.camera();
////        i.google();
////        i.charger();
////        i.sim();
////        i.video();
////        Mi m= new Mi();
////        m.youtube();
////        m.camera();
////        m.google();
////        m.charger();
////        m.sim();
////        m.video();
////      Redmi mi= new Redmi();
////      mi.youtube();
////        mi.camera();
////        mi.google();
////        mi.charger();
////        mi.sim();
////        mi.video();
////
////    }
////}
////
////public class Main {
////    public static void main(String[] args)
////    {
////        for (int i = 1; i <= 7; i+=2)
////        {
////
////            for (int j = 1; j<=i; j+=1)
////            {    int x=j;
////
////                if (j % 2 == 0)
////                {
////                    System.out.print("*");
////                }
////                else
////                {
////                    System.out.print((i*j)/i);
////
////                }
////
////            }
////            System.out.println();
////        }
////       // System.out.println();
////    }
////}
//
//
//// interface A {
////     void show();
//// }
////// class B implements A
//// {
////    public void show()
////    {
////        System.out.println("hai");
////    }
////
//// }
////public class Main {
////    public static void main(String[] args)
////    {
////        B k= new B();
////        k.show();
////    }
////}
//
////interface C{
////    void show();
////    void h();
////}
////
////class B implements C {
////    public void show()
////    {
////        System.out.println("hello");
////    }
////    public void h()
////    {
////        System.out.println("bye");
////    }
////
////}
////public class Main {
////  public static void main(String[] args)
////  {
////      B c =new B();
////      c.show();
////  }
////}
////
//// interface A{
////    void show();
////    default void msg();
////     {
////         System.out.println("hello");
////     }
//// }
//// interface C{
////    void print();
////
//// }
////
//// class B implements A,C{
////    public void show()
////    {
////        System.out.println("showing");
////    }
////    public void print()
////    {
////        System.out.println("hii");
////    }
//// }
////public class Main {
////  public static void main(String[] args)
////  {
////      B k= new B();
////      k.show();
////  }
////}
////
////interface D
////{
////    void h();
////}
////
////interface E{
////    void k();
////    void n();
////}
////
////class A implements E,D{
////    public void k()
////    {
////        System.out.println("never");
////
////    }
////    public void n()
////    {
////        System.out.println("once");
////    }
////    public void h()
////    {
////        System.out.println("where");
////    }
////}
////
////public class Main {
////  public static void main(String[] args)
////  {
////      A k = new A();
////      k.k();
////      k.n();
////      k.h();
////  }
////}
//
////
////interface A{
////    void show();
////    void me();
////}
////
////class B implements A{
////    public void show()
////    {
////        System.out.println("show");
////    }
////    public void me()
////    {
////        System.out.println("help");
////    }
////}
////
////public class Main{
////    public static void main(String[] args) {
////        B k = new B();
////        k.show();
////        k.me();
////        A p = new A();
////        {
////            System.out.println("hello");
////        }
////    };
////    p.show();
////
////    }
////
////    abstract class A{
////      abstract void show(int a);
////
////    }
////
////    class B extends A{
////       public void show(int a);
////        {
////            System.out.println(a);
////        }
////    }
////
////    public class Main{
////    public static void main(String[] args){
////        B k= new B();
////        k.show(1);
////    }
////    }
////
////    1
////    1 * 2
////    1 * 2 * 3
////    1 * 2 * 3 * 4
//
//
////(1)
//
//
////class Person{
////    String name;
////    int age;
////    void hj(String name )
////    {
////        System.out.println(name);
////    }
////    void gk(int age)
////    {
////        System.out.println(age);
////    }
////}
////public class Main {
////    public static void main(String[] args) {
////        Person p = new Person();
////        p.hj("suresh");
////        p.gk(34);
////
////    }
////}
////
//
/////(2)//
//
//
////class Rectangle{
////    int l;
////    int b;
////    void h(int l,int b)
////    {
////        System.out.println("Area of rectangle = "+ l*b);
////    }
////
////}
////public class Main {
////    public static void main(String[] args) {
////        Rectangle  p = new  Rectangle();
////        p.h(7  ,8);
////
////
////    }
////}
//
//
//
/////(3)
//
//
////class Circle{
////    float a;
////    void cr (double a)
////    {
////        System.out.println("Perimeter of Circle = "+ 2*3.14*a);
////        System.out.println("Area of Circle = "+ 3.14*a*a);
////    }
////
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        Circle p= new Circle();
////        p.cr(4.4);
////    }
////}
//
//
////(4)//
//
//
////
////class Circle {
////    double c;
////
////    void SetC(double c)
////    {
////        //System.out.println(" Area of Circle = " + 3.14*c*c);
////        this.c = c;
////    }
////
////    double getC()
////    {
////        return c;
////    }
////
////    void area()
////    {
////        System.out.println("Area of Circle = " + 3.14 * c * c);
////    }
////}
////
////    class Rectangle extends Circle{
////        int l;
////        int b;
////        void SetB(int b)
////        {
////            this.b=b;
////        }
////        int getB()
////        {
////           return b;
////        }
////        void SetL(int l)
////        {
////            this.l=l;
////        }
////        int getL()
////        {
////            return l;
////        }
////        void add()
////        {
////            System.out.println("Area of Rectangle = "+ l*b);
////        }
////    }
////
////    class Square extends Rectangle{
////        int s;
////        void SetS(int s)
////        {
////            this.s=s;
////        }
////        int getS()
////        {
////            return s;
////        }
////        void sq()
////        {
////            System.out.println("Area of Square = "+ s*s);
////        }
////
////    }
////
////public class Main{
////   public static void main(String[] args){
////    Square s= new Square();
////     s.SetB(6);
////     s.getB();
////     s.SetL(5);
////     s.getL();
////     s.add();
////       s.SetC(2.3);
////       s.getC();
////       s.area();
////       s.SetS(4);
////       s.getC();
////       s.sq();
////
////
////
////   }
////}
////
//
/////(4)//
//
//
//
////class Trafficlight{
////    void tf()
////    {
////        System.out.println("traffic light ");
////    }
////}
////class Ref extends Trafficlight{
////    void r()
////    {
////
////        System.out.println("Red light");
////    }
////}
////class Green extends Ref {
////    void gr()
////    {
////        System.out.println("Green light");
////    }
////}
////
////class Yellow extends Green{
////    void yell()
////    {
////        System.out.println("Yellow light");
////    }
////
////}
////
////public class Main {
////    public static void main(String[] args) {
////        Yellow t = new Yellow();
////        t.tf();
////        t.r();
////        t.gr();
////        t.yell();
////
////
////    }
////}
//
//
////class Cal{
////    void add(int d,int e,int f)
////    {
////        System.out.println(e+d+f);
////    }
////    void add(int a,int b,float f)
////    {
////        System.out.println(a+b+f);
////    }
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        Cal c= new Cal();
////        c.add(1,3,6);
////        c.add(1,2,4.2f);
////    }
////}
//
////class Cal{
////    int add(int a,int b)
////    {
////        int c=a+b;
////        return c;
////    }
////    int add(int a,int b,int c)
////    {
////        int d=a+b+c;
////        return d;
////    }
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        Cal p=new Cal();
////        System.out.println(p.add(1,5));
////        System.out.println(p.add(1,3,4));
////    }
////}
//
//
////class D{
////    int f(int a,int b,int c)
////    {
////        int y=a+b+c;
////        return y;
////    }
////
////    int g(int e,int f,int h)
////    {
////        int j=e+f+h;
////        return j;
////    }
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        D t= new D();
////        System.out.println( t.f(3,5,5));
////        System.out.println(t. g(4,6,7));
////    }
////}
//
//
////class A{
////    A(int a)
////    {
////        this(1,2);
////        System.out.println(a);
////    }
////    A(int a, int b)
////    {
////        System.out.println(a+b);
////    }
////    A()
////    {
////        this(1);
////    }
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        new A();
////    }
////}
//
////
////class A{
////    A(int a)
////    {
////        System.out.println(a);
////    }
////    A(int a,int b)
////    {
////        System.out.println(a+b);
////    }
////    A(int a,float b)
////    {
////        System.out.println(a+b);
////    }
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        new A(1);
////        new A(1,2);
////        new A(1,1.2f);
////    }
////}
//
//
////
//
////class A{
////    void method()
////    {
////
////        System.out.println("hai");
////    }
////}
////
////class B extends A {
////
////    void method()
////
////    {
////        super.method();
////        System.out.println("where");
////    }
////}
////
////class C extends B{
////    void method()
////    {
////        super.method();
////        System.out.println("bye bye");
////
////    }
////
////}
////
////public class Main{
////    public static void main(String[] args)
////    {
////        C n =new C ();
////        n.method();
////    }
////}
//
//
//class Cal {
//    void show(int x, int... a) {
//        System.out.println("The value of x is : " + x);
//        for (int i : a) ;
//        {
//            System.out.println(a);
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args)
//    {
//        new Cal().show(4, 5, 6, 7, 8);
//    }
//}


//class A{
//    int age=34;
//    String name="Mukesh";
//
//}
//
//class B{
//    String School="DPS";
//    int year=2019;
//    A k= new A();
//
//}
//
//public class Main{
//    public static void main(String[] args)
//    {
//        B n= new B();
//        System.out.println(n.year);
//        System.out.println(n.k.name);
//        System.out.println(n.k.age);
//    }
//}

//class A{
//    void show1()
//    {
//        System.out.println("hello");
//    }
//    void show2()
//    {
//        System.out.println("hii");
//    }
//    void  show3()
//    {
//        System.out.println("bye");
//    }
//    void show4()
//    {
//        System.out.println("tata");
//    }
//    void show5()
//    {
//        System.out.println("heyy");
//    }
//}
//public class Main{
//    public static void main(String[] args)
//    {
//        A k = new A();
//        k.show1();
//        k.show2();
//        k.show3();
//        k.show4();
//        k.show5();
//    }
//}


//class D{
//    int a,b,c,d;
//    D(int a,int b,int c,int d)
//    {
//        this.a=a;
//        this.b=b;
//        this.c=c;
//        this.d=d;
//    }
//    void show()
//    {
//        System.out.println(a+b+c+d);
//    }
//
//        }
//
//        import java.util.*;
//        public class Main{
//    public static void main(String[] args)
//    {
//        Scanner sc= new Scanner(System.in);
//        int a= sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int d=sc.nextInt();
//
//        D g = new D(a,b,c,d);
//        g.show();
//    }
//        }


// class E{
//    int add()
//    {
//        int a=5;
//        return a;
//
//    }
//}
//
//public class Main{
//    public static void main(String[] args)
//    {
//        E k = new E();
//        System.out.println(k.add());
//    }
//}

//class E{
//    int a;
//    int show(int a)
//    {
//        this. a=a;
//        return a;
//
//    }
//    void add()
//    {
//        System.out.println(a);
//    }
//}
//
//public class Main{
//    public static void main(String[] args)
//    {
//        E k = new E();
//        k.show(1);
//        k.add();
//    }
//}

/// Assignment Aggregation
//class A{
//    void show1()
//    {
//        System.out.println("hello");
//    }
//    void show2()
//    {
//        System.out.println("bye bye");
//    }
//      void show3()
//              {
//                  System.out.print("very good");
//
//              }
//}
//
//
//public class Main{
//    public static void main(String[] args)
//    {
//        A k = new A();
//        k.show1();
//        k.show2();
//        k.show3();
//
//    }
//}


//(2)
//class B{
//    int a=34,b=4;
//    void sub()
//    {
//        System.out.println(a-b);
//    }
//    void add()
//    {
//        System.out.println(a+b);
//    }
//    void multi()
//    {
//        System.out.println(a*b);
//    }
//    void modulus()
//    {
//        System.out.println(a%b);
//    }
//}
//
//public class Main{
//    public static void main(String[] args)
//    {
//        B k= new B();
//        k.sub();
//        k.add();
//        k.multi();
//        k.modulus();
//
//    }
//}

//(3)
//
//class C {
//    void Cir() {
//        float r = 2.4f;
//        double area = 3.14 * r * r;
//        System.out.println("Area of circle is =  " + area);
//    }
//
//    void rec() {
//        int s = 4;
//        int d = 6;
//        int area = s * d;
//        System.out.println("Area of square = " + area);
//    }
//
//    void tri() {
//        int b = 4;
//        int h = 6;
//        int area = (1 * 4 * 6) / 2;
//        System.out.println("Area of triangle = " + area);
//
//    }
//
//    void cyl() {
//        int r = 4;
//        int h = 7;
//        double area = 3.14 * r * h;
//        System.out.println("area of cylinder = " + area);
//    }
//
//    void sp() {
//        int r = 4;
//        double area = 4 * 3.14 * r * r;
//        System.out.println("Area of Sphere =  " + area);
//
//    }
//}
//    public class Main{
//    public static void main(String[] args)
//    {
//        C k= new C();
//        k.tri();
//        k.cyl();
//        k.sp();
//        k.rec();
//        k.Cir();
//    }
//
//
//}

//(4)

//class A{
//    int a;
//    int   show(int a)
//    {
//        this.a=a;
//        return a;
//    }
//
//}
//
//public class Main{
//    public static void main(String[] args)
//    {
//        A k= new A();
//        System.out.println(k.show(4));
//    }
//}

// 5
//
//class A{
//    int a;
//    int  method (int a)
//    {
//        this.a=a;
//        System.out.println(a);
//        return a;
//    }
//}
//
////import java.util.*;
//public class Main{
//    public static void main(String[] args)
//    {
//       // Scanner sc = new Scanner(System.in);
//       // int a= sc.nextInt();
//        A k =new A();
//        k.method(4);
//    }
//}

/// Static Keyword

//class Count{
//    int c=0;
//    Count()
//    {
//        c++;
//        System.out.println(c);
//    }
//}
//
//public class Main{
//    public static void main(String[] args){
//        Count c1= new Count();
//        Count c2= new Count();
//        Count c3= new Count();
//        Count c4= new Count();
//    }
//}

//

//class Count {
//    static c=0;
//    Count()
//        {
//            c++;
//          System.out.print(c);
//
//        }
//        }
//
//        public class Main{
//    public static void main(String[] args)
//    {
//        Count c1=
//    }
//        }

//    }
////}
//
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
////        int n= sc.nextInt();
//        for(int i=1;i<=9;i+=2)
//        {
//            int m=1;
//            for(int j=1;j<=i;j++)
//            {
//                if(j%2==0)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(m);
//                    m++;
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//

//class Count
//{
//    static int  count=0;
//     Count()
//    {
//        count++;
//        System.out.println(count);
//    }
//
//}
//public class Main {
//    public static void main(String[] args) {
//        Count c1 = new Count();
//        Count c2 = new Count();
//        Count c3 = new Count();
//        Count c4 = new Count();
//    }
//}

//
//class A{
//     static  int a;
//    static String name ="hii";
//     A(int b)
//    {
//       this. a=b;
//    }
//      static void  display()
//    {
//        System.out.println(a+" "+name);
//    }
//}
//
// import java.util.*;
//public class Main{
//    public static void main(String[] args)
//    {
//         Scanner sc = new Scanner(System.in);
//        A k= new A();
//        k.display();
//
//    }
//}

//class B{
//    private B()
//    {
//         int a=5;
//        System.out.println("hii"+a);
//    }
//    static void objext()
//    {
//        new B();
//    }
//}
//
//public class Main{
//    public static void main(String[] args)
//    {
//        B.objext();
//
//    }
//}




