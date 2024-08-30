package com.example.adapter.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Profile;

import com.example.domain.MenuRepository;
import com.example.domain.entity.Menu;

@Profile("prod")
public class MySqlConcrete implements MenuRepository {
    final MySqlRepository repository;

    public MySqlConcrete(final MySqlRepository mySqlConcrete) {
        this.repository = mySqlConcrete;
    }

    @Override
    public void save(Menu menu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<Menu> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Menu> findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}
    
