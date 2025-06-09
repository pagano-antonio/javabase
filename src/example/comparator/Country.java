package example.comparator;

import java.util.Comparator;

public class Country implements Comparable<Country> {

	private int area;
	private String name;
	private int population;

	public Country(String name, int area, int population) {
		this.name = name;
		this.area = area;
		this.population = population;
	}

	@Override
	public int compareTo(Country o) {
//		Minore di zero	Questa istanza precede o.
//		Zero	Questa istanza si trova nella stessa posizione di o nell'ordinamento.
//		Maggiore di zero	L'istanza segue o.
		
		int result;
		//result =    this.area - o.getArea();
		// negativo se o è piu grande di this
		// zero se sono uguali
		//positivo se this è mmaggiore di o
		
		result =    o.getArea() - this.area;
		
		return result;
		

	
		
		
		
	}

	public int getArea() {
		return area;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [area=" + area + ", name=" + name + ", population=" + population + "]";
	}

}
