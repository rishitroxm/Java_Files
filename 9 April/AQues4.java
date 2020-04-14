import java.io.*; 
  
class AQues4 { 
  
    void method() 
    { 
        System.out.println("Head"); 
    } 
} 
  
class B extends AQues4 { 
  
    void method() throws IOException 
    { 
  

        System.out.println("Class1"); 
    } 



class C extends B { 
  
    void method() throws IOException 
    { 
  

        System.out.println("Class2"); 
    } 
  
    public static void main(String args[]) 
    { 
        AQues4 s = new C(); 
        s.method(); 
    } 
}
} 