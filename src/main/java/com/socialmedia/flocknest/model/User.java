package com.socialmedia.flocknest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String name;
    private String profilePicture;
    private String[] followers;
    private String[] following;
    private String[] posts;
    private String password;

    public User() {
    }

    public User(String username, String name, String profilePicture, String[] followers, String[] following,
            String[] posts, String password) {
        this.username = username;
        this.name = name;
        this.profilePicture = profilePicture;
        this.followers = followers;
        this.following = following;
        this.posts = posts;
        this.password = password;
    }

    public User(String username, String name, String email, String password) {
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
