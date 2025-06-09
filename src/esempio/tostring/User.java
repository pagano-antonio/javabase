package esempio.tostring;

public class User {
	private String name;
	private String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

//	@Override
//	public String toString() {
//		String res = "Il nome è:" + name + " e il cognome è: " + surname;
//
//		return res;
//	}

	
	
	public static void main(String[] args) {

		User r = new User();

		r.name = "PIPPO";
		r.surname = "PLUTO";

		System.out.println(r);

		//System.out.println(r.toString());

		User r1 = new User();

		System.out.println(r1);

	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + "]";
	}
}
