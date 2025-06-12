package n.s.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Formfive {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String Number_of_orders_appealed_against;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber_of_orders_appealed_against() {
		return Number_of_orders_appealed_against;
	}
	public void setNumber_of_orders_appealed_against(String number_of_orders_appealed_against) {
		Number_of_orders_appealed_against = number_of_orders_appealed_against;
	}
	
}
