package MorningSession;
public class methodHidingC extends methodHiding  
{  
public static void method1()  
{  
System.out.println("Method-1 of the Sample class is executed.");  
}  
public void method2()  
{  
System.out.println("Method-2 of the Sample class is executed.");  
}  
public static void main(String args[])  
{  
	methodHiding d1 = new methodHiding();  
//d2 is reference variable of class Demo that points to object of class Sample  
	methodHiding d2 = new methodHidingC();  
//method calling with reference (method hiding)  
d1.method1();  
d2.method1();  
//method calling with object (method overriding)  
d1.method2();  
d2.method2();  
}  
} 
