package me.lunev.homework33.services;

import me.lunev.homework33.model.Recipe;

public interface RecipeService {

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipe(int id);
}
