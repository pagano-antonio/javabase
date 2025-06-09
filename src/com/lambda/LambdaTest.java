package com.lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaTest {

public static void main(String[] args) {
	Consumer<String> printer = message -> System.out.println(message); 
	printer.accept("Hello, world!");

	Supplier< Integer> randomNumberSupplier = ()-> (int) (Math.random() * 100); 
	int randomValue = randomNumberSupplier.get();

	Predicate<Integer> isEven = number -> number % 2 == 0; 
	boolean result = isEven.test(6); // Returns true

	Function<String, Integer> stringToInt = Integer::parseInt; 
	int intValue = stringToInt.apply("42"); // Converts "42" to 42

	UnaryOperator<Integer> square = x -> x * x; 
	int squaredValue = square.apply(5); // Returns 25

	BinaryOperator<Integer> addition = (x, y) -> x*y; 
	int sum  = addition.apply(2, 3); // Returns 5

	BiFunction<Integer, Integer, Integer> add = (x, y) -> x+y; 
	int result1 = add.apply(3, 4); // Returns 7

	BiPredicate<Integer, Integer> islqual = (x, y) -> x.equals(y);
	boolean arellqual = islqual.test(5, 5); // Returns true


}


	
}
