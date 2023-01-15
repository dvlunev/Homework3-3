package me.lunev.homework33.services;

import me.lunev.homework33.model.Ingredient;

public interface IngredientService {

    Ingredient addIngredient(Ingredient ingredient);

    Ingredient getIngredient(int id);
}
