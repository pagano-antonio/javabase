package example.patternprototype;

public class Dog  implements Animal {

	public Dog(){
		
		System.out.println("Dog is Made");
		
	}
	
	public Animal makeCopy() {
		
		System.out.println("Dog is Being Made");
		
		Dog DogObject = null;
		
		try {
			
			// Calls the Animal super classes clone()
			// Then casts the results to Dog
			
			DogObject = (Dog) super.clone();
			
		}
		
		// If Animal didn't extend Cloneable this error 
		// is thrown
		
		catch (CloneNotSupportedException e) {
			  
			System.out.println("The Dog was Turned to Mush");
			
			e.printStackTrace();
			  
		 }
		
		return DogObject;
	}
	
	public String toString(){
		
		return "Rex is my Hero, Baaaaa";
		
	}
	
}