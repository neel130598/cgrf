package n.s.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Formthree {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String Category_of_Grievance;
	@Column
	private String No_of_Cases_Redresed;
	@Column
	private String Amount_compensation_awarded_in_Rs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory_of_Grievance() {
		return Category_of_Grievance;
	}
	public void setCategory_of_Grievance(String category_of_Grievance) {
		Category_of_Grievance = category_of_Grievance;
	}
	public String getNo_of_Cases_Redresed() {
		return No_of_Cases_Redresed;
	}
	public void setNo_of_Cases_Redresed(String no_of_Cases_Redresed) {
		No_of_Cases_Redresed = no_of_Cases_Redresed;
	}
	public String getAmount_compensation_awarded_in_Rs() {
		return Amount_compensation_awarded_in_Rs;
	}
	public void setAmount_compensation_awarded_in_Rs(String amount_compensation_awarded_in_Rs) {
		Amount_compensation_awarded_in_Rs = amount_compensation_awarded_in_Rs;
	}

}
