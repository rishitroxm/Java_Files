class Shape{
  public void printshape(){
    System.out.println("This is shape");
  }
}


class Rectangle extends Shape{
  public void printrect(){
    System.out.println("This is rectangular shape");
  }
}


class Circle extends Shape{
  public void printcircle(){
    System.out.println("This is circular shape");
  }
}


class Square extends Rectangle{
  public void printsquare(){
    System.out.println("Square is a rectangle");
  }
}


class Answer5{
  public static void main(String[] args){
    Square sq = new Square();  
    sq.printshape();   
    sq.printrect();   
  }
}