package test.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import test.model.Projectids;

@Entity
public class ProjectInfo  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private Projectids id;
	private String name;
	private String iplTeam;
	private String indName;
	
	public Projectids getId() {
		return id;
	}
	public void setId(Projectids id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIplTeam() {
		return iplTeam;
	}
	public void setIplTeam(String iplTeam) {
		this.iplTeam = iplTeam;
	}
	public String getIndName() {
		return indName;
	}
	public void setIndName(String indName) {
		this.indName = indName;
	}

}
