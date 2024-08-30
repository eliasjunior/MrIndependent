package com.example.domain;

import java.util.List;
import com.example.domain.entity.Menu;
import java.util.Optional;

public interface MenuRepository {
    // Save a menu
    void save(Menu menu);

    // Find all menus
    List<Menu> findAll();

    // Find a menu by ID
    Optional<Menu> findById(int id);
}