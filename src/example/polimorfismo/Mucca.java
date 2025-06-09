package example.polimorfismo;

public class Mucca implements Animale {

	@Override
	public void emettiVerso() {
		// TODO Auto-generated method stub
		System.out.println("MUGGITO");
	}


	public void emettiVerso(int c) {
		// TODO Auto-generated method stub
		System.out.println("MUGGITO  forter");
	}
}
