package n.s.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Formfour {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String Quarter;
	@Column
	private String Vacany;
	@Column
	private String Chairperson;
	@Column
	private String Member_cpo;
	@Column
	private String Member_licensee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuarter() {
		return Quarter;
	}
	public void setQuarter(String quarter) {
		Quarter = quarter;
	}
	public String getVacany() {
		return Vacany;
	}
	public void setVacany(String vacany) {
		Vacany = vacany;
	}
	public String getChairperson() {
		return Chairperson;
	}
	public void setChairperson(String chairperson) {
		Chairperson = chairperson;
	}
	public String getMember_cpo() {
		return Member_cpo;
	}
	public void setMember_cpo(String member_cpo) {
		Member_cpo = member_cpo;
	}
	public String getMember_licensee() {
		return Member_licensee;
	}
	public void setMember_licensee(String member_licensee) {
		Member_licensee = member_licensee;
	}
	
}
