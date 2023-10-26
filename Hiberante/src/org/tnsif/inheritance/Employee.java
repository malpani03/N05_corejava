package org.tnsif.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Emp")
public class Employee extends Person
{
	private float salary;
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "salary=" + salary + ", toString()=" + super.toString() + ", getId()=" + getId()
				+ ", getName()=" + getName() + " ";
	}

	
}
