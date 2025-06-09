package examplestream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		 //match
		 List<String> memberNames = new ArrayList<>();
		 memberNames.add("Aldo");
		 memberNames.add("Pluto");
		 memberNames.add("Paperino");

		 boolean matchedResult = memberNames.stream()
		 		        .anyMatch((s) -> s.startsWith("A"));
		 		 
		 		
		 System.out.println(matchedResult);     //true - esiste almeno un  elemento che inizia con A
		 		 
		 matchedResult = memberNames.stream()
		 		        .allMatch((s) -> s.startsWith("A"));
		 		 
		 System.out.println(matchedResult);     //false - non tutti gli  elementi  iniziano con A
		 		 
		 matchedResult = memberNames.stream()
		 		        .noneMatch((s) -> s.startsWith("A"));
		 		 
		 System.out.println(matchedResult);     //false - un elemento inizia con A

		 
	}

}
