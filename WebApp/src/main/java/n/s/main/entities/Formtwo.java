package n.s.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Formtwo {
 
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String FY_Quarter;
	@Column
	private String Category_of_Grievance;
	@Column
	private String Filed_Nos;
	@Column
	private String Redressed_Nos;
	@Column
	private String Pending_Nos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFY_Quarter() {
		return FY_Quarter;
	}
	public void setFY_Quarter(String fY_Quarter) {
		FY_Quarter = fY_Quarter;
	}
	public String getCategory_of_Grievance() {
		return Category_of_Grievance;
	}
	public void setCategory_of_Grievance(String category_of_Grievance) {
		Category_of_Grievance = category_of_Grievance;
	}
	public String getFiled_Nos() {
		return Filed_Nos;
	}
	public void setFiled_Nos(String filed_Nos) {
		Filed_Nos = filed_Nos;
	}
	public String getRedressed_Nos() {
		return Redressed_Nos;
	}
	public void setRedressed_Nos(String redressed_Nos) {
		Redressed_Nos = redressed_Nos;
	}
	public String getPending_Nos() {
		return Pending_Nos;
	}
	public void setPending_Nos(String pending_Nos) {
		Pending_Nos = pending_Nos;
	}
}
