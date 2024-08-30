package com.example.adapter.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.domain.MenuRepository;
import com.example.domain.entity.Menu;

public class InMemoryMenuImpl implements MenuRepository {
    private List<Menu> menuStore = new ArrayList<>();  // In-memory list to simulate a database

    // Save a menu to the in-memory list
    @Override
    public void save(Menu menu) {
        menuStore.add(menu);
    }

    // Retrieve all menus from the in-memory list
    @Override
    public List<Menu> findAll() {
        return new ArrayList<>(menuStore);  // Return a copy to prevent modification
    }

    // Find a menu by its ID
    @Override
    public Optional<Menu> findById(int id) {
        return menuStore.stream()
                .filter(menu -> menu.getId() == id)
                .findFirst();  // Return the menu wrapped in an Optional
    }
}