package com.example.domain.entity;

import java.util.List;

// Menu class
public class Menu {
    private int id;
    private String title;
    private List<MenuItem> menuItems;

    // Constructor
    public Menu(int id, String title, List<MenuItem> menuItems) {
        this.id = id;
        this.title = title;
        this.menuItems = menuItems;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // Utility method to add a menu item
    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
    }
}
