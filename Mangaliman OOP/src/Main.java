public class Main {
public static void main(String[] args) {
	
    System.out.println("\n1. Person");
	
    Person p1 = new Person("Till", 21, "Pasig");
    System.out.println(p1.personName + ", " + p1.personAge);
    
    Person p2 = new Person("Ivan", 22, "Quezon");
    System.out.println(p2.personName + ", " + p2.personAge);
    
    Person p3 = new Person("Mizi", 22, "Mandaluyong");
    System.out.println(p3.personName + ", " + p3.personAge);
    
    Person p4 = new Person("Sua", 23, "Manila");
    System.out.println(p4.personName + ", " + p4.personAge);
    
    Person p5 = new Person("Hyuna", 27, "Rizal");
    System.out.println(p5.personName + ", " + p5.personAge);
	
    
    System.out.println("\n2. Dog");
	
	Dog d1 = new Dog();
	d1.setName("Pepper");
	d1.setBreed("Maltese");
	
	Dog d2 = new Dog();
	d2.setName("Cosmo");
	d2.setBreed("Shi Tzu");
	
	System.out.println(d1.getName() + ", " + d1.getBreed());
	System.out.println(d2.getName() + ", " + d2.getBreed());
	
	System.out.println("\n3. Rectangle");
  	
	Rectangle myRectangle = new Rectangle();
	myRectangle.area(args);

	}

}
