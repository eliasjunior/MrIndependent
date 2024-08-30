package com.example.domain.usecase;

import java.util.List;
import java.util.Optional;

import com.example.domain.MenuRepository;
import com.example.domain.entity.Menu;

public class MenuUseCase {
    // this is the bridge to access the persistence,
    // but in the controllers we might have rules, that need to pass here and not directly to menuRepository, however this is just for start
    // we may need also a bridge between the use case and the controller
    private final MenuRepository menuRepository;

    public MenuUseCase(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Menu createMenu(Menu menu) {
        menuRepository.save(menu);
        return menu;
    }
   
    public Menu getById(int id) {
        Optional<Menu> op = menuRepository.findById(id);
        // validations, policies
        if(op.isEmpty()) {
            // some more rules
            System.out.println("--- Send Message Alert Menu not found id="+id);
           // send alerts
            throw new RuntimeException("Maybe this is a custom exception");
        }
        Menu menu = op.get();
        return menu;
    }

    public List<Menu> getAll() {
        return menuRepository.findAll();
    }
}

