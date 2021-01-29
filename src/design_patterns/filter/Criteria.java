package design_patterns.filter;

import java.util.*;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> people);
}
