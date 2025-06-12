package n.s.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Formone {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String FY_Quarter;
	@Column
	private String No_of_grievances_pending_on_start_date;
	@Column
	private String No_of_grievances_received_during_the_period;
	@Column
	private String Total_No_of_grievances_during_the_period;
	@Column
	private String No_of_grievances_not_admitted_or_withdrawn_during_the_period;
	@Column
	private String Total_No_of_grievances_actionable_during_the_period;
	@Column
	private String Within_15_working_days;
	@Column
	private String Beyond_15_working_days;
	@Column
	private String Within_60_days;
	@Column
	private String Beyond_60_days;
	@Column
	private String Total_No_of_grievances_redressed_during_the_period;
	@Column
	private String Total_No_of_grievances_pending_at_end_the_period;
	@Column
	private String No_of_decisions_in_favour_of_Consumer;
	@Column
	private String No_of_decisions_in_favour_of_Licensee;
	@Column
	private String No_of_orders_requiring_compliance_report_by_licensee;
	@Column
	private String No_of_ord_pro_pays_of_compensation_by_License_Compl;
	@Column
	private String Reports_received_within_period_as_per_order;
	@Column
	private String Reports_received_beyond_specified_period_in_the_order;
	@Column
	private String Not_Complied;
	
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
	public String getNo_of_grievances_pending_on_start_date() {
		return No_of_grievances_pending_on_start_date;
	}
	public void setNo_of_grievances_pending_on_start_date(String no_of_grievances_pending_on_start_date) {
		No_of_grievances_pending_on_start_date = no_of_grievances_pending_on_start_date;
	}
	public String getNo_of_grievances_received_during_the_period() {
		return No_of_grievances_received_during_the_period;
	}
	public void setNo_of_grievances_received_during_the_period(String no_of_grievances_received_during_the_period) {
		No_of_grievances_received_during_the_period = no_of_grievances_received_during_the_period;
	}
	public String getTotal_No_of_grievances_during_the_period() {
		return Total_No_of_grievances_during_the_period;
	}
	public void setTotal_No_of_grievances_during_the_period(String total_No_of_grievances_during_the_period) {
		Total_No_of_grievances_during_the_period = total_No_of_grievances_during_the_period;
	}
	public String getNo_of_grievances_not_admitted_or_withdrawn_during_the_period() {
		return No_of_grievances_not_admitted_or_withdrawn_during_the_period;
	}
	public void setNo_of_grievances_not_admitted_or_withdrawn_during_the_period(
			String no_of_grievances_not_admitted_or_withdrawn_during_the_period) {
		No_of_grievances_not_admitted_or_withdrawn_during_the_period = no_of_grievances_not_admitted_or_withdrawn_during_the_period;
	}
	public String getTotal_No_of_grievances_actionable_during_the_period() {
		return Total_No_of_grievances_actionable_during_the_period;
	}
	public void setTotal_No_of_grievances_actionable_during_the_period(
			String total_No_of_grievances_actionable_during_the_period) {
		Total_No_of_grievances_actionable_during_the_period = total_No_of_grievances_actionable_during_the_period;
	}
	public String getWithin_15_working_days() {
		return Within_15_working_days;
	}
	public void setWithin_15_working_days(String within_15_working_days) {
		Within_15_working_days = within_15_working_days;
	}
	public String getBeyond_15_working_days() {
		return Beyond_15_working_days;
	}
	public void setBeyond_15_working_days(String beyond_15_working_days) {
		Beyond_15_working_days = beyond_15_working_days;
	}
	public String getWithin_60_days() {
		return Within_60_days;
	}
	public void setWithin_60_days(String within_60_days) {
		Within_60_days = within_60_days;
	}
	public String getBeyond_60_days() {
		return Beyond_60_days;
	}
	public void setBeyond_60_days(String beyond_60_days) {
		Beyond_60_days = beyond_60_days;
	}
	public String getTotal_No_of_grievances_redressed_during_the_period() {
		return Total_No_of_grievances_redressed_during_the_period;
	}
	public void setTotal_No_of_grievances_redressed_during_the_period(
			String total_No_of_grievances_redressed_during_the_period) {
		Total_No_of_grievances_redressed_during_the_period = total_No_of_grievances_redressed_during_the_period;
	}
	public String getTotal_No_of_grievances_pending_at_end_the_period() {
		return Total_No_of_grievances_pending_at_end_the_period;
	}
	public void setTotal_No_of_grievances_pending_at_end_the_period(
			String total_No_of_grievances_pending_at_end_the_period) {
		Total_No_of_grievances_pending_at_end_the_period = total_No_of_grievances_pending_at_end_the_period;
	}
	public String getNo_of_decisions_in_favour_of_Consumer() {
		return No_of_decisions_in_favour_of_Consumer;
	}
	public void setNo_of_decisions_in_favour_of_Consumer(String no_of_decisions_in_favour_of_Consumer) {
		No_of_decisions_in_favour_of_Consumer = no_of_decisions_in_favour_of_Consumer;
	}
	public String getNo_of_decisions_in_favour_of_Licensee() {
		return No_of_decisions_in_favour_of_Licensee;
	}
	public void setNo_of_decisions_in_favour_of_Licensee(String no_of_decisions_in_favour_of_Licensee) {
		No_of_decisions_in_favour_of_Licensee = no_of_decisions_in_favour_of_Licensee;
	}
	public String getNo_of_orders_requiring_compliance_report_by_licensee() {
		return No_of_orders_requiring_compliance_report_by_licensee;
	}
	public void setNo_of_orders_requiring_compliance_report_by_licensee(
			String no_of_orders_requiring_compliance_report_by_licensee) {
		No_of_orders_requiring_compliance_report_by_licensee = no_of_orders_requiring_compliance_report_by_licensee;
	}
	public String getNo_of_ord_pro_pays_of_compensation_by_License_Compl() {
		return No_of_ord_pro_pays_of_compensation_by_License_Compl;
	}
	public void setNo_of_ord_pro_pays_of_compensation_by_License_Compl(
			String no_of_ord_pro_pays_of_compensation_by_License_Compl) {
		No_of_ord_pro_pays_of_compensation_by_License_Compl = no_of_ord_pro_pays_of_compensation_by_License_Compl;
	}
	public String getReports_received_within_period_as_per_order() {
		return Reports_received_within_period_as_per_order;
	}
	public void setReports_received_within_period_as_per_order(String reports_received_within_period_as_per_order) {
		Reports_received_within_period_as_per_order = reports_received_within_period_as_per_order;
	}
	public String getReports_received_beyond_specified_period_in_the_order() {
		return Reports_received_beyond_specified_period_in_the_order;
	}
	public void setReports_received_beyond_specified_period_in_the_order(
			String reports_received_beyond_specified_period_in_the_order) {
		Reports_received_beyond_specified_period_in_the_order = reports_received_beyond_specified_period_in_the_order;
	}
	public String getNot_Complied() {
		return Not_Complied;
	}
	public void setNot_Complied(String not_Complied) {
		Not_Complied = not_Complied;
	}
	
	
}
