package org.example;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "NVarChar(100)", nullable = false)
    private String name;
    @Column(columnDefinition = "Double")
    private double price;
    @Column(columnDefinition = "NVarChar(100)")
    private String description;
    @Column(columnDefinition = "Int")
    private int quantity;

    @ManyToOne
        @JoinColumn(name = "category_id")
    private Category category;


    /// Constructor
    public Product() {}
    public Product(int id, String name, double price, String description, int quantity, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
    }



    /// Getter Setter
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

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
