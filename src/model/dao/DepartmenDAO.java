package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmenDAO {

	void insert(Department obj);
	void update(Department obj);
	void deletedById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
	
}
