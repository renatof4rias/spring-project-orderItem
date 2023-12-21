package com.softelse.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.softelse.course.entities.Category;
import com.softelse.course.entities.Order;
import com.softelse.course.entities.OrderItem;
import com.softelse.course.entities.Product;
import com.softelse.course.entities.User;
import com.softelse.course.entities.enums.OrderStatus;
import com.softelse.course.repositories.CategoryRepository;
import com.softelse.course.repositories.OrderItemRepository;
import com.softelse.course.repositories.OrderRepository;
import com.softelse.course.repositories.ProductRepository;
import com.softelse.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired	
	private UserRepository userRepository;
	
	@Autowired	
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Arroz Doce", "ArrozDoce@gmail.com", "98765433", "1234567");
		User u2 = new User(null,"Pamonha Doce", "PamonhaDoce@gmail.com", "98451234", "6789456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);
		
		Category c1 = new Category (null, "Sobremesa");
		Category c2 = new Category (null, "Entrada");
		Category c3 = new Category (null, "Prato Principal");
		
		Product p1 = new Product (null, "Panqueca", "Prato Sobremesa", 7.50, "http:aaaaa.com");
		Product p2 = new Product (null, "Picanha", "Prato Principal", 77.50, "http:aaaaa.com");
		Product p3 = new Product (null, "Batata Frita", "Prato Entrada", 5.50, "http:aaaaa.com");
		Product p4 = new Product (null, "Pudim", "Prato Sobremesa", 12.50, "http:aaaaa.com");
		Product p5 = new Product (null, "Hamburgue", "Prato Principal", 47.50, "http:aaaaa.com");
		Product p6 = new Product (null, "Cebola Crisp", "Prato Entrada", 17.50, "http:aaaaa.com");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
		p1.getCategories().add(c1);
		p1.getCategories().add(c2);
		p2.getCategories().add(c3);
		p3.getCategories().add(c2);
		p4.getCategories().add(c1);
		p4.getCategories().add(c2);
		p5.getCategories().add(c3);
		p6.getCategories().add(c2);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4,p5, p6));
		
		
		OrderItem oi1 = new OrderItem(o1, p1, 2 , p1.getPrice());
		OrderItem oi2 = new OrderItem(o1, p3, 1 , p3.getPrice());
		OrderItem oi3 = new OrderItem(o2, p3, 2 , p3.getPrice());
		OrderItem oi4 = new OrderItem(o3, p5, 2 , p5.getPrice());
		
		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
		
	}
	
}
