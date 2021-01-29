package design_patterns.filter;

import java.util.*;

public class OrCriteria implements Criteria{

	private Criteria c1;
	private Criteria c2;
	
	OrCriteria(Criteria c1, Criteria c2){
		this.c1=c1;
		this.c2=c2;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> people) {
		List<Person> firstCriteriaResult=c1.meetCriteria(people);
		List<Person> secondCriteriaResult=c2.meetCriteria(people);
		Set<Person> finalResult= new LinkedHashSet<Person>(firstCriteriaResult);
		finalResult.addAll(secondCriteriaResult);
		return new ArrayList<Person>(finalResult);
	}

}
