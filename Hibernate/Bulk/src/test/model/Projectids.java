package test.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class Projectids implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "Projectids [pid=" + pid + ", proId=" + proId + "]";
	}
	private Integer pid;
	private Integer proId;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}

}
