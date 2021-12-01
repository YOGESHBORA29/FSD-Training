package BussinessCode;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Mathutils {
	public static Integer sum(List<Integer> vals) { Optional sum = vals.stream().reduce(Integer::sum);
	return (Integer) sum.get();
	} public static List<Integer> positive(List<Integer> vals)
	{ return vals.stream().filter(val -> val > 0).collect(Collectors.toList()); } 
	public static List<Integer> negative(List<Integer> vals)
	{ return vals.stream().filter(val -> val < 0).collect(Collectors.toList());
	}

}
