package com.example.adapter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.domain.entity.Menu;
import com.example.domain.usecase.MenuUseCase;

@RestController
@RequestMapping("/menu")
public class MenuController {
    // maybe need also a interface here.
    private MenuUseCase menuUseCase;

    public MenuController(MenuUseCase createMenuUseCase) {
        this.menuUseCase = createMenuUseCase;
    }

    @PostMapping
    public Menu createMenu(@RequestBody Menu payload) {
        System.out.println("==== Saving item ====");
        System.out.println(payload.getTitle());
        menuUseCase.createMenu(payload);
        return payload;
    }

    @GetMapping("/{id}")
    public Menu getMenu(int id) {
        return menuUseCase.getById(id);
    }
    @GetMapping
    public List<Menu> getAll() {
        return menuUseCase.getAll();
    }
}