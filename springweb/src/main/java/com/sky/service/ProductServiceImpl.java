package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepository productRepository;//new productRepositoryImpl()
	public void addProduct(Product product) {
		System.out.println("In service");
		if(product.getPrice()>20)
		{
			productRepository.addProduct(product);
		}
		
	}

	@Override
	public List<Product> getProducts() {
		
		return productRepository.getProducts();
	}

}
