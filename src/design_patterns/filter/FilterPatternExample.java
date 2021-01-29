package design_patterns.filter;

import java.util.*;
public class FilterPatternExample {

	public static void main(String[] args) {
		// Filter pattern or Criteria pattern is a design pattern that enables
		// developers to filter a set of objects using different criteria and chaining
		// them in a decoupled way through logical operations. This type of design
		// pattern comes under structural pattern as this pattern combines multiple
		// criteria to obtain single criteria.
		
		List<Person> people= new ArrayList<Person>();		
		Person p1= new Person("Sopan", "Male", "Married");
		Person p2= new Person("Monika", "FeMale", "Married");
		Person p3= new Person("Kisan", "Male", "Single");
		Person p4= new Person("Aniket", "Male", "Single");
		Person p5= new Person("Muffi", "Male", "Single");
		Person p6= new Person("Sanika", "FeMale", "Married");
		Person p7= new Person("Lakshmi", "FeMale", "Single");
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		people.add(p7);
		
		Criteria male= new CriteriaMale();
		Criteria female= new CriteriaFemale();
		Criteria single= new CriteriaSingle();
		Criteria marriedMale= new CriteriaMarriedMale();
		
		Criteria femaleOrMarriedMale= new OrCriteria(female, marriedMale);
		Criteria singlFemale = new AndCriteria(single, female);
		
		System.out.println("femaleOrMarriedMale: "+femaleOrMarriedMale.meetCriteria(people));
		System.out.println("singlFemale: "+singlFemale.meetCriteria(people));
		
	}

}
