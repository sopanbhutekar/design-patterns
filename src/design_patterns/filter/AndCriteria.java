package design_patterns.filter;

import java.util.List;

public class AndCriteria implements Criteria{

	private Criteria c1;
	private Criteria c2;
	
	AndCriteria(Criteria c1, Criteria c2){
		this.c1=c1;
		this.c2=c2;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> firstCriteriaResult= c1.meetCriteria(person);
		return c2.meetCriteria(firstCriteriaResult);		
		}
}
