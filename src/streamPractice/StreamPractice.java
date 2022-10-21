package streamPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.tools.javac.jvm.Gen;

public class StreamPractice {

	public void streamMethodToRun() {
		List<Person> people = getPeople();

		/* Filter */
		List<Person> females = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		// females.forEach(System.out::println);

		/* Sort */
		List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		// sorted.forEach(System.out::println);

		/* All match */
		boolean allMatch = people.stream().allMatch(person -> person.getAge() == 15);
		// System.out.println(allMatch);

		/* Any Match */
		boolean anyMatch = people.stream().anyMatch(person -> person.getAge() == 14);
		//System.out.println(anyMatch);
		
		/* Non Match */
		boolean nonMatch = people.stream().noneMatch(person -> person.getAge() == 20);
		//System.out.println(nonMatch);

		/* Max */
		people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

		/* Min */
		people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
		
		/* Group */
		Map<Gender, List<Person>> groupByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));
		groupByGender.forEach((gender, peoples) -> {
			System.out.println(gender);
			peoples.forEach(System.out::println);
		});

	}

	private static List<Person> getPeople() {
		return List.of(new Person("Antonio", 20, Gender.MALE), new Person("Alina Smith", 33, Gender.FEMALE),
				new Person("Helen White", 57, Gender.FEMALE), new Person("Alex Boz", 14, Gender.MALE),
				new Person("Jamie Goa", 99, Gender.MALE), new Person("Anna Cook", 7, Gender.FEMALE),
				new Person("Zelda Brown", 120, Gender.FEMALE));
	}
}
