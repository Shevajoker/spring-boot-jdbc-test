package com.jdbc.start.model;

import java.util.Objects;

/**
 * {@link #id int(11)}
 * {@link #name String(max lenght 50)}
 * {@link #preority int(from 0 to 100)} 100 - highest priority.
 */



public class Department {

	private int id;
	private String name;
	private int preority;

	public Department() {
	}

	public Department(int id, String name, int preority) {
		this.id = id;
		this.name = name;
		this.preority = preority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPreority() {
		return preority;
	}

	public void setPreority(int preority) {
		this.preority = preority;
	}

	@Override
	public String toString() {
		return "Departmen [id=" + id + ", name=" + name + ", preority=" + preority + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(name, other.name);
	}

}
