package method.reference;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return (t.intValue() > 18)?true:false;
	}

}
