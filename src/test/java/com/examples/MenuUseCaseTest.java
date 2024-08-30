package com.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.adapter.repository.InMemoryMenuImpl;
import com.example.domain.entity.Menu;
import com.example.domain.entity.MenuItem;
import com.example.domain.usecase.MenuUseCase;

/**
 * Unit test for simple App.
 */
public class MenuUseCaseTest {
    /**
     * Rigorous Test :-)
     */
    private MenuUseCase useCase;

    @BeforeEach
    void setUp() {
        // for complicate creation uses factories/builder
        useCase = new MenuUseCase(new InMemoryMenuImpl());
    }

    @Test
    void testSaveAndFindAll() {
        // Arrange: create some  menu items and menus
        MenuItem dashboard = new MenuItem(1, "Dashboard", "/dashboard", Arrays.asList("ADMIN", "STAFF"));
        MenuItem reports = new MenuItem(2, "Reports", "/reports", Arrays.asList("ADMIN", "MANAGER"));
        Menu mainMenu = new Menu(1, "Main Menu", Arrays.asList(dashboard, reports));

        // Act: save the menu
        useCase.createMenu(mainMenu);

        // Assert: check if the repository contains the saved menu
        List<Menu> allMenus = useCase.getAll();
        assertEquals(1, allMenus.size(), "There should be exactly one menu.");
        assertEquals("Main Menu", allMenus.get(0).getTitle(), "The title of the menu should be 'Main Menu'.");
    }

    @Test
    void testFindByIdFound() {
        // Arrange: create a menu
        MenuItem settings = new MenuItem(3, "Settings", "/settings", Arrays.asList("ADMIN"));
        Menu settingsMenu = new Menu(2, "Settings Menu", Arrays.asList(settings));

        // Act: createMenu method differ from repo, as meaning plays a role here in CA
        useCase.createMenu(settingsMenu);

        Menu foundMenu = useCase.getById(2);

        // Assert: the menu with ID 2 should be found
        assertEquals("Settings Menu", foundMenu.getTitle(), "The menu title should be 'Settings Menu'.");
    }

    @Test
    void testFindByIdNotFound() {
        // Act: attempt to find a menu by an ID that doesn't exist
        assertThrows(RuntimeException.class, () -> useCase.getById(999));
    }
}
