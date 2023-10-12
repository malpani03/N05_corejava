package org.tnsif.Assignment;

import java.util.*;

public class Product {
		List<String>productList =new ArrayList<String>();
		
		public void addProductList(String product)
		{
			productList.add(product);		
		}
		public void sortProductList()
		{
			Collections.sort(productList);
			System.out.println(productList);
		}
		public List<String> getProductList() {
			return productList;
		}
		public void setProductList(List<String> productList) {
			this.productList = productList;
		}
	}
		


