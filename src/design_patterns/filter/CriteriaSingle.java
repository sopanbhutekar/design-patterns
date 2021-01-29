package design_patterns.filter;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> people) {
		return people.stream().filter(p -> p.getMaritalStatus().equalsIgnoreCase("Single")).collect(Collectors.toList());
	}
}
