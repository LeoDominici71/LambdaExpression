package program;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Programa {

	public static void main(String[] args) {
		
        List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.00));
		//predicate faz decisoes booleanas
		
		
		list.removeIf(p -> p.getPrice() >= 100);// expressao lambda inline ****
		
		
		
		for (Product p : list) {
			System.out.println(p);
		}
		

	}

} 
