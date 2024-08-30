package com.example.adapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adapter.model.MenuItemEy;

public interface MySqlRepository extends JpaRepository<MenuItemEy,Long> {
}
