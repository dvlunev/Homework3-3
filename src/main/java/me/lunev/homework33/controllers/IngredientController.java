package me.lunev.homework33.controllers;

import me.lunev.homework33.model.Ingredient;
import me.lunev.homework33.services.IngredientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping("/create")
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.addIngredient(ingredient);
    }

    @GetMapping("/get/{id}")
    public Ingredient getIngredient(@PathVariable int id) {
        return ingredientService.getIngredient(id);
    }
}
