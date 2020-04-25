package com.product.bo.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.product.bo.ProductBO;
import com.product.bo.impl.ProductBoImpl;
import com.product.exception.BusinessException;
import com.product.model.Product;

public class ProductBoTest {

	private static ProductBO bo;
	
	@BeforeClass
	public static void preInitialization() {
		bo=new ProductBoImpl();
		try {
			bo.addProduct(new Product( "Mobile", 12.22, 3.4f, "ABC"));
			bo.addProduct(new Product( "Mobile", 13.22, 2.4f, "XYZ"));
			bo.addProduct(new Product( "Mobile", 14.22, 4.4f, "ABC"));
			bo.addProduct(new Product( "Mobile", 12.22, 3.4f, "PQR"));
			bo.addProduct(new Product( "Mobile", 12.22, 3.4f, "YYY"));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testAddProduct() {
		try {
			Product p=bo.addProduct(new Product( "Mobile", 14.22, 3.9f, "YYY"));
			assertEquals(10005, p.getId());
		} catch (BusinessException e) {
			fail();
		}
	}
	@Test
	public void testAddProductForNull() {
		try {
			assertNull(bo.addProduct(null));
		} catch (BusinessException e) {
			assertEquals("Product details cannot be empty", e.getMessage());
		}
	}
	@Test
	public void testGetProductById() {
		try {
			Product res=bo.getProductById(10005);
			//Product exp=new Product(10005, "Mobile", 14.22, 3.9f, "YYY");
			//assertEquals(exp, res);
			assertNotNull(res);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
