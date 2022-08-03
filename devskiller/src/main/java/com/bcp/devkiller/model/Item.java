package com.bcp.devkiller.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="TBL_ITEM")
public class Item {
    @Id
    @GeneratedValue
    @Column(name="ID_ITEM")
    private Long id;

    @Column(length = 100,name="TITLE")
//    @NotEmpty
    private String title;

    @Column(length = 200,name="DESCRIPTION")
    private String description;



    public Item() {
    }

    public Item(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }



    @Override
    public String toString() {
        return "\nItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
//              
                '}';
    }
}
