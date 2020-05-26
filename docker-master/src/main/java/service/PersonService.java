package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();

	public PersonService() {
		Person p = new Person();
		p.setId("101");
		p.setStart("2020-05-23T10:07:52.937+0000");
		p.setEnd("2020-05-23T11:07:52.937+0000");
		p.setEmail("aliriza.saral@gmail.com");

		persons.add(p);

		p = new Person();
		p.setId("102");
		p.setStart("2020-05-23T10:07:52.937+0000");
		p.setEnd("2020-05-23T11:07:52.937+0000");
		p.setEmail("aliriza.saral@gmail.com");

		persons.add(p);

		p = new Person();
		p.setId("103");
		p.setStart("2020-05-23T10:07:52.938+0000");
		p.setEnd("2020-05-23T11:07:52.938+0000");
		p.setEmail("aliriza.saral@gmail.com");

		persons.add(p);

		p = new Person();
		p.setId("104");
		p.setStart("2020-05-23T10:07:52.939+0000");
		p.setEnd("2020-05-23T11:07:52.939+0000");
		p.setEmail("aliriza.saral@gmail.com");

		persons.add(p);

		p = new Person();
		p.setId("105");
		p.setStart("2020-05-23T10:07:52.938+0000");
		p.setEnd("2020-05-23T11:07:52.938+0000");
		p.setEmail("aliriza.saral@gmail.com");

		persons.add(p);
		
		
		p = new Person();
		p.setId("106");
		p.setStart("2020-05-23T10:07:52.939+0000");
		p.setEnd("2020-05-23T11:07:52.939+0000");
		p.setEmail("aliriza.saral@gmail.com");

		persons.add(p);
		p = new Person();
		p.setId("107");
		p.setStart("2020-05-23T10:07:52.940+0000");
		p.setEnd("2020-05-23T11:07:52.940+0000");
		p.setEmail("john.kovin@gmail.com");

		persons.add(p);
		p = new Person();
		p.setId("108");
		p.setStart("2020-05-23T10:07:52.940+0000");
		p.setEnd("2020-05-23T11:07:52.940+0000");
		p.setEmail("john.kovin@gmail.com");

		persons.add(p);
		p = new Person();
		p.setId("109");
		p.setStart("2020-05-23T10:07:52.942+0000");
		p.setEnd("2020-05-23T11:07:52.942+0000");
		p.setEmail("john.kovin@gmail.com");

		persons.add(p);
		p = new Person();
		p.setId("110");
		p.setStart("2020-05-23T10:07:52.944+0000");
		p.setEnd("2020-05-23T11:07:52.944+0000");
		p.setEmail("aliriza.saral@gmail.com");

		persons.add(p);

	}

	public Person getPerson(String id) {
		for (Person person : persons) {
			if (person.getId().equalsIgnoreCase(id))
				return person;
		}
		return null;
	}

	public ArrayList<Person> getAll() {
		return persons;
	}
}
