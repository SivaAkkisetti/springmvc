package in.javahome.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Register {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "REG_ID")
	private Integer regId;
	@Column(name = "FULL_NAME")
	private String fullName;
	@Column(name = "MAIL")
	private String mail;
	@Column(name = "PASSWORD")
	private String password;
	
	public Integer getRegId() {
		return regId;
	}
	public void setRegId(Integer regId) {
		this.regId = regId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
