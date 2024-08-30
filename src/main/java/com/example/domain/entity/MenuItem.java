package com.example.domain.entity;

import java.util.List;

// MenuItem class
public class MenuItem {
    private int id;
    private String name;
    private String link;
    private List<String> rolesAllowed;

    // Constructor
    public MenuItem(int id, String name, String link, List<String> rolesAllowed) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.rolesAllowed = rolesAllowed;
    }

    // Getters and Setters
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<String> getRolesAllowed() {
        return rolesAllowed;
    }

    public void setRolesAllowed(List<String> rolesAllowed) {
        this.rolesAllowed = rolesAllowed;
    }
}