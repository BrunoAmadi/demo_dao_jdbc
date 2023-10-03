package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== Test 1 InsertDepartment ===");
		Department department = new Department("Esportes", null);
		departmentDao.insert(department);
		System.out.println("Department inserted! " + department.getId());

		System.out.println();
		System.out.println("=== Test 2 FindById ===");
		department = departmentDao.findById(2);
		System.out.println(department);

		System.out.println();
		System.out.println("=== Test 3 FindAll ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		System.out.println("Find all sucessfull");

		System.out.println();
		System.out.println("=== Test 4 UpdateDepartment ===");
		department = departmentDao.findById(6);
		department.setName("Lavanderia");
		departmentDao.update(department);
		System.out.println("Department UPDATED! ");
		
		System.out.println();
		System.out.println("=== Test 5 DeleteDeparment ===");
		departmentDao.deleteById(5);
		System.out.println("Department DELETED! ");
		
		
		
		

	}

}
