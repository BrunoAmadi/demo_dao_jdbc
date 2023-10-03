package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Test 1 FindById ===");
		Seller seller = sellerDao.findById(8);

		System.out.println(seller);

		System.out.println();
		System.out.println("=== Test 2 FindByDepartment ===");
		Department department = new Department(null, 2);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);

		System.out.println();
		System.out.println("=== Test 3 FindAll ===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);

		
		
		System.out.println();
		System.out.println("=== Test 4 InsertSeller ===");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("inserted! new Id " + newSeller.getId());
		
		
		
		System.out.println();
		System.out.println("=== Test 5 UpdateSeller ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha wayne");
		sellerDao.update(seller);
		System.out.println("Updated complete!");
		
		
		
		System.out.println();
		System.out.println("=== Test 6 DeleteSeller ===");
		sellerDao.deleteById(2);
		System.out.println("Seller Deleted!");
	}
	
	
	

}
