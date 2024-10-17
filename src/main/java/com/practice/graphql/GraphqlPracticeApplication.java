package com.practice.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlPracticeApplication {
    /*
    @Autowired
    private ProductRepository repository;

    @PostConstruct
    public void initDB() {
        List<Product> products = Stream.of(new Product("Laptop", "Electronics", 7777.9f, 60),
                new Product("Smartphone", "Electronics", 6545.99f, 34),
                new Product("Office Chair", "Furniture", 64545.5f, 54),
                new Product("Notebook", "Stationary", 63354.663f, 5444),
                new Product("Desk Lamp", "Furniture", 6477.544F, 463),
                new Product("Water Bottle", "Accessories", 46456.44f, 736)
        ).toList();

        repository.saveAll(products);
    }

     */
    public static void main(String[] args) {
        SpringApplication.run(GraphqlPracticeApplication.class, args);

    }
}
