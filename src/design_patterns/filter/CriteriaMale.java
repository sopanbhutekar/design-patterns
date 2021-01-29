package design_patterns.filter;

import java.util.*;
import java.util.stream.Collectors;

public class CriteriaMale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> people) {
		return people.stream().filter(p -> p.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
	}	
}
