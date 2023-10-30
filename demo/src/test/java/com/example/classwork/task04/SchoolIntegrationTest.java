package com.example.classwork.task04;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SchoolIntegrationTest {

	@Test
	public void testSchoolIntegration() {

		School school = new School();

		// person01 = new Person("Leonid", true);

		// person02 = new Person("Roman", false);
		// person03 = new Person("Sergey", false);
		// person04 = new Person("Alina", false);
		// person05 = new Person("Maxim", false);
		// person06 = new Person("Alexander", false);
		// person07 = new Person("Oleg", false);
		// person08 = new Person("Inna", false);

		school.addPerson(new Person("Leonid", true));

		school.addPerson(new Person("Roman", false));
		school.addPerson(new Person("Sergey", false));
		school.addPerson(new Person("Alina", false));
		school.addPerson(new Person("Maxim", false));
		school.addPerson(new Person("Alexander", false));
		school.addPerson(new Person("Oleg", false));
		school.addPerson(new Person("Inna", false));

		assertTrue(school.isTeacherInSchool("Leonid"));

		assertTrue(school.isStudentInSchool("Roman"));

		school.addPerson(new Person("Ivan", false));

		assertTrue(school.isStudentInSchool("Ivan"));

	}

}
