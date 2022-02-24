package method.reference;

import java.util.function.Predicate;

public class LifeWithoutPredicate {
	
	public static void main(String[] args) {
		Predicate<Integer> predicateImpl = new PredicateImpl();
		System.out.println(predicateImpl.test(new Integer(10)));
		//life with predicate
		Predicate<Integer> predicate = a -> a>18;
		System.out.println(predicate.test(10));
	}

}
