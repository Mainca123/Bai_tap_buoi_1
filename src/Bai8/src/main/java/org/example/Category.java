package org.example;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "Varchar(100)", nullable = false)
    private String name;
    @Column(columnDefinition = "NVarChar(100)")
    private String description;

    //Constructor
    public Category() {}
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
