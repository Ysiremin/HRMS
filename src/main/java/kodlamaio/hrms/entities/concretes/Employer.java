package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User{
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="wep_site")
	private String wepSite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public Employer() {}
	
	public Employer(String companyName, String wepSite, String phoneNumber) {
		super();
		this.companyName = companyName;
		this.wepSite = wepSite;
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWepSite() {
		return wepSite;
	}

	public void setWepSite(String wepSite) {
		this.wepSite = wepSite;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
