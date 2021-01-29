package design_patterns.filter;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaFemale implements Criteria{
	@Override
	public List<Person> meetCriteria(List<Person> people) {
		return people.stream().filter(p -> p.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
	}
}
