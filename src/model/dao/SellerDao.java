package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deletedById(Seller id);
	Department findById(Seller id);
	List<Department> findAll();
	
}
