import java.util.Scanner;
class Vechile{
	public void  vechileclass(){
		System.out.println("This is a Vechile");

	}
}
class Car extends Vechile{
	public void carclass(){
		System.out.println("This is a Car");
	}
}	

class Bike extends Vechile{
	public void bikeclass(){
		System.out.println("This is Bike")
	}

	class Answer6{
			public static void main(String[] args){
			Scanner sc = new Scanner(System.in);}

			Int n = sc.nextInt();

			Switch(n){

			Case 2 : {
			Bike b1 = new Bike();
			b1.bikeclass();
			break;
			}

			Case 4 : {
			Car c1 = new Car();
			c1.carclass();
			break;
			}

			default : 
			{
			Vehicle v1 = new Vehicle();
			v1.Vehicleclass();
			}
		}
	}
}
