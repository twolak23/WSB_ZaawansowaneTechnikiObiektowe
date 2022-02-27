package zad1;

import java.text.*;
import java.util.*;

public class HumanSalaryHistory {

	private Date displayDate;
	private Double salary;

	public HumanSalaryHistory() { }

	public HumanSalaryHistory(Date displayDate, Double salary) {
		this.displayDate = displayDate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		return "Data: " + sdf.format(displayDate) + ", Wartość: " + salary + "\n";
	}
}
