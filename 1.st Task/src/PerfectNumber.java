
import java.util.*;

public class PerfectNumber {
	
	public enum STATE{
		DEFICIENT, PERFECT, ABUNDANT
	}
	
	public static Set<Integer> divisors(int n){
		Set<Integer> set = new HashSet<Integer>();
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				set.add(i);
			}
		}
		return set;
	}

	public static STATE process(int n) {
		if(n == 1) return STATE.DEFICIENT;
		Set<Integer> set = new HashSet<Integer>();
		set = divisors(n);
		int Sum = 0;
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
		   Sum+= (int)iterator.next();
		}
		Sum-=n;
		if (Sum < n ) return STATE.DEFICIENT;
		if (Sum == n ) return STATE.PERFECT;
		return STATE.ABUNDANT;			
	}
}