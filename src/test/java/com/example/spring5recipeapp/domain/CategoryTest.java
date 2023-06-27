package com.example.spring5recipeapp.domain;

import static org.junit.Assert.*;

import org.junit.Before;

public class CategoryTest {
    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @org.junit.Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @org.junit.Test
    public void getDescription() throws Exception {
    }

    @org.junit.Test
    public void getRecipes() throws Exception {
    }
}