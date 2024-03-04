package com.sample.practicePrograms.StreamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Filter4Examples {
    public static void main(String[] args) {

        // Sample list of products
        List<Product> products = Arrays.asList(
                new Product("A", 100, "Electronics"),
                new Product("B", 250, "Clothing"),
                new Product("C", 150, "Electronics"),
                new Product("D", 175, "Sports & Footwear"),
                new Product("E", 100, "Books"),
                new Product("F", 150, "Books")


        );

          // 1. Filter products with price below 200 and category "Electronics"
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getPrice() < 200 && product.getCategory().equals("Books")|| product.getCategory().equals("Electronics") )
                .collect(Collectors.toList());
        // Print the filtered products
        System.out.println("\nFiltered products:");
        filteredProducts.forEach(System.out::println);



// 2. Products with "&" in category name
        List<Product> productsWithAmpersand = products.stream()
                .filter(product -> product.getCategory().contains("&"))
                .toList();
        System.out.println("\nProducts with '&' in category:");
        productsWithAmpersand.forEach(System.out::println);

// 3. Products with "oo" anywhere in the category name
        List<Product> productsWithOO = products.stream()
                .filter(product -> product.getCategory().contains("oo"))
                .toList();
        System.out.println("\nProducts with 'oo' in category:");
        productsWithOO.forEach(System.out::println);

// 4. Highest and lowest priced products
        int highestPrice = products.stream().mapToInt(Product::getPrice).max().orElse(0);
        int lowestPrice = products.stream().mapToInt(Product::getPrice).min().orElse(0);
        System.out.println("\nHighest price: " + highestPrice);
        System.out.println("Lowest price:\n " + lowestPrice);



    }

    // Product class for demonstration purposes
    public static class Product {
        private String name;
        private int price;
        private String category;

        public Product(String name, int price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", category='" + category + '\'' +
                    '}';
        }

        public int getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }
    }
}

