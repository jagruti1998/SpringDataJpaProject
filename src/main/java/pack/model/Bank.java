package pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankdetails")
public class Bank {
	@Column(name="name")
	String name;
	@Column(name="branch")
	String branch;
	@Column(name="address")
	String address;
	@Column(name="accno")
	String accno;
	@Column(name="curr")
	String curr;
	@Id
	@Column(name="id")
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public Bank(String name, String branch, String address, String accno, String curr) {
		super();
		this.name = name;
		this.branch = branch;
		this.address = address;
		this.accno = accno;
		this.curr = curr;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Bank() {
		
	}
}
