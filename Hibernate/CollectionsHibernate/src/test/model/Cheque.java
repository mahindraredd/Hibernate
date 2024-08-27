package test.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CHEQUE")
public class Cheque extends Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer chequeNo;
	private String chequetype;
	private LocalDate expiryDate;
	public Integer getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(Integer chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequetype() {
		return chequetype;
	}
	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

}
