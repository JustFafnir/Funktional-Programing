

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumber {
	
	public enum STATE {
		ABUNDANT, DEFICIENT, PERFECT;
	}
	public static Set<Integer> divisors(int n) {
		return IntStream.rangeClosed(1, n)
			.filter(i -> n % i == 0)
			.boxed()
			.collect(Collectors.toSet());
	}
	public static STATE process(int n) {
		Integer suma = divisors(n).stream()
				.filter(i -> !i.equals(n))
				.mapToInt(i -> i).sum();
		
		if (suma == n)
			return STATE.PERFECT;
		else if (suma > n)
			return STATE.ABUNDANT;
		else
			return STATE.DEFICIENT;
	}
}