package tn.csf.market.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.market.model.Article;
//repository that extends CrudRepository  

public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  