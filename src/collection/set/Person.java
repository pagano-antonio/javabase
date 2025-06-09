package collection.set;

public class Person implements Comparable<Person> {
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

//	    // Override compareTo method to sort by age
	    @Override
	    public int compareTo(Person other) {
	        return Integer.compare(this.age, other.age);
	    }

	    // Override toString method for better output
	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	    }

	    // Override equals and hashCode (not mandatory for TreeSet but good practice)
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Person person = (Person) obj;
	        return age == person.age && name.equals(person.name);
	    }

	    // per implementazioni Hash
	    @Override
	    public int hashCode() {
	        return name.hashCode() * 31 + age;
	    }
}


