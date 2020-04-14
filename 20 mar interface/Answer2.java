class Member{
  String name;
  int age;
  String number;
  String address;
  int salary;

  public void printSalary(){
    System.out.println(salary);
  }

}

class Employee extends Member{
  String specialization;
}

class Manager extends Member{
  String department;
}

class Answer2{
  public static void main(String[] args){
    Employee e = new Employee();
    e.name = "Rishit";
    e.age = 19;
    e.number = "8222";
    e.address = "NCU";
    e.salary = 1231000;
    Manager m = new Manager();
  }
}			