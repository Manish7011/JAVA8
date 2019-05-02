import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
class Animal{
	void doStuff(){
		;
	};
}
class Dog extends Animal{
	Dog(String name, int weight, int age){
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	String name;
	int weight;
	int age;
	
	int getWeight(){
		return weight;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
	public String toString(){
		return name;
	}
}
public class LambdaExp{
	public static void main(String [] args){
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("mi",30,6));dogs.add(new Dog("ri",120,7));dogs.add(new Dog("pi",35,12));dogs.add(new Dog("ci",45,8));dogs.add(new Dog("di",40,12));dogs.add(new Dog("qi",50,10));dogs.add(new Dog("oi",15,4));dogs.add(new Dog("ni",22,50));
		List<Dog> response  = null;
		response = dogQuery(dogs, dd -> dd.getAge() < 9);
		System.out.println("Age is less than 9: "+response);
		response = dogQuery(dogs, dd -> dd.getWeight() >= 50);
		System.out.println("Weight is greater or equals to 50: "+response);
		
	}
	static List<Dog> dogQuery(List<Dog> dogs, Predicate<Dog> expr){
		List<Dog> response = new ArrayList<Dog>();
		for(Dog d : dogs){
			if(expr.test(d)){
				response.add(d);
			}
		}
		return response;
	}
	
}