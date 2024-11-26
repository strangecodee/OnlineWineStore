package com.wine.web.repositories;

import org.springframework.data.repository.CrudRepository;

import com.wine.web.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>
{
	public Product findByPname(String name);

}
