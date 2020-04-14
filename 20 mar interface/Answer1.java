class Parent{
  public void pmethod(){
    System.out.println("This is parent class");
  }
}

class Child extends Parent{
  public void cmethod(){
    System.out.println("This is child class");
  }
}

class Answer1{
  public static void main(String[] args){
    Parent m = new Parent();
    Child n = new Child();
    m.pmethod();
    n.cmethod();
    n.pmethod();
  }
}	