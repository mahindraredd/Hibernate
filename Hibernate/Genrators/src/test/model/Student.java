package test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student {
	@Id
//	@GenericGenerator(name="gen1",strategy="increment")
//	@GeneratedValue(generator="gen1")
//	@GenericGenerator(name="gen1",strategy="identity")
//	@GeneratedValue(generator="gen1")
//	@GeneratedValue(strategy =GenerationType.AUTO)
//	@GenericGenerator(name="gen1",strategy="increment")
//	@GeneratedValue(generator="gen1")
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	private String role;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
