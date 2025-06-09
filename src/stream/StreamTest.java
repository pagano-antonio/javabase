package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
	       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        
	        List<Integer> evenNumbers = numbers.stream()
	                                           .filter(n -> n % 2 == 0)
	                                            .collect(Collectors.toList());
	        
	        System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]

	}
	
	public static void map() {
		  List<String> words = Arrays.asList("hello", "world", "java", "stream");
	        
	        List<String> upperCaseWords = words.stream()
	                                           .map(n-> n.toUpperCase())
	                                           .collect(Collectors.toList());
	        
	        System.out.println(upperCaseWords); // Output: [HELLO, WORLD, JAVA, STREAM]
	  
	}
	
	public static void count() {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
        
        long count = words.stream()
                          .filter(word -> word.startsWith("a"))
                          .count();
        
        System.out.println(count); // Output: 3
    }
	
	public static void reduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        
        System.out.println(sum); // Output: 15
    }
	
	
	public static void reduceDue() {
        List<String> words = Arrays.asList("cat", "elephant", "tiger", "lion");
        
        String longestWord = words.stream()
                                  .reduce("", (longest, current) -> longest.length() > current.length() ? longest : current);
        
        System.out.println(longestWord); // Output: elephant
    }
	
}
