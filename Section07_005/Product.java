package Section07_005;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //nhap thong tin
    public void inputData(Scanner sc) {
        Product product = new Product();
        System.out.println("Nhap vao ID san pham");
        this.id = sc.nextInt();
        System.out.println("Nhap vao Ten san pham");
        this.name = sc.next();
        System.out.println("Nhap vao Gia san pham");
        this.price = sc.nextInt();
    }

    //hien thi thong tin
    public void displayData() {
        System.out.printf("ID: %d, Name: %s, Price: %d \n", id, name, price);
    }
}


