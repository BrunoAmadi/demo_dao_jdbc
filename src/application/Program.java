package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Department dp = new Department("Bruno", 3);
		Seller seller = new Seller(10, "pedro", "pedro@gmail.com", LocalDate.parse("07/06/1995",fmt), 3000.00, dp);
		
		

		System.out.println(dp);
		System.out.println(seller);
	}

}
