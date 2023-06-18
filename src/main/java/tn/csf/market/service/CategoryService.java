package tn.csf.market.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.market.model.Category;
import tn.csf.market.repository.CategoryRepository;


//defining the business logic  
@Service 

public class CategoryService {

	@Autowired  
	CategoryRepository categoryRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Category> getAllCategories()   
	{  
		List<Category> categories = new ArrayList<Category>();  
		categoryRepository.findAll().forEach(c -> categories.add(c));  
		return categories;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Category getCategoriesById(int id)   
	{  
		return categoryRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Category c)   
	{  
		categoryRepository.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		categoryRepository.deleteById(id);  
	} 

}