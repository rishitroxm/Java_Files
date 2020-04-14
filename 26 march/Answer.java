interface Movie
{ 
     void show() 
    { 
        System.out.println("Default GPI"); 
    } 
} 
  
interface Show1 extends Movie{ } 
  
interface Show2 extends Movie { } 
  

class Answer implements Show1 , Show2 
{ 
    public static void main(String args[]) 
    { 
       Answer d = new Answer(); 
        d.show(); 
    } 
} 