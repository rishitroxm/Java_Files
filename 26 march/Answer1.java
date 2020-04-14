interface Movie
{ 
     void series() 
    { 
        System.out.println("Movie"); 
    } 
} 
  
interface A extends Movie{ } 
  
interface B extends Movie { } 
  

class Answer1 implements A,B 
{ 
    public static void main(String args[]) 
    { 
        Answer1 d = new Answer1(); 
        d.series(); 
    } 
} 