package design_patterns.filter;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaMarriedMale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> people) {
		return people.stream().filter(p -> {
			if(p.getGender().equalsIgnoreCase("male")& p.getMaritalStatus().equalsIgnoreCase("Married")  ) return true;
			return false;
		}).collect(Collectors.toList());
		}
	
}
