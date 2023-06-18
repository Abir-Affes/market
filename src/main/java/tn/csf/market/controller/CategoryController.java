package tn.csf.market.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.market.model.Category;
import tn.csf.market.service.CategoryService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class CategoryController {

	@Autowired  
	CategoryService categoryService;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/category")
	private List<Category> getAllCategories()   
	{  
		return categoryService.getAllCategories();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/category/{id}")  
	private Category getCategory(@PathVariable("id") int id)   
	{  
		return categoryService.getCategoriesById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/category/{id}")  
	private void deleteCategory(@PathVariable("id") int id)   
	{  
		categoryService.delete(id);  
	} 

	//create new article
	@PostMapping("/category")  
	private int saveCategory(@RequestBody Category c)   
	{  
		categoryService.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/category")  
	private Category update(@RequestBody  Category c)   
	{  
		categoryService.saveOrUpdate(c);  
		return c;  
	}  
}