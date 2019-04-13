package com.MppProject.models;

import javax.persistence.*;

/**
 * Created by student.
 */
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne()
    @JoinColumn(name = "userdata_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "image_id")
    private Image image;

    private String text;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int compareTo(Comment comment2){
        return (int)(comment2.getId()- this.id);
    }
}
