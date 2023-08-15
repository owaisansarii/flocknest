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
}
