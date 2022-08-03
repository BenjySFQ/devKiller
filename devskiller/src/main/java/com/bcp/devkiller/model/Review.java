package com.bcp.devkiller.model;

import javax.persistence.*;

@Entity
@Table(name="TBL_REVIEW")
public class Review {
    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;
    @Column(name="RATING")
    private Double rating;
    @Column(name="COMMENT")
//    @Length(max=200)
    private String comment;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ITEM")
    private Item item;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_USER")
    private User author;

    public Review() {
    }

    public Review(Double rating, String comment, User author) {
        this.rating = rating;
        this.comment = comment;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public Double getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public Item getItem() {
        return item;
    }

    public User getAuthor() {
        return author;
    }

    void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "\nReview{" +
                "id=" + id +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
