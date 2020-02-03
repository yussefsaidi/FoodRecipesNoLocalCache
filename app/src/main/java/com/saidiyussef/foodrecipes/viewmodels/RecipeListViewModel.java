package com.saidiyussef.foodrecipes.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.saidiyussef.foodrecipes.models.Recipe;
import com.saidiyussef.foodrecipes.repositories.RecipeRepository;

import java.util.List;

public class RecipeListViewModel extends ViewModel {

    private RecipeRepository mRecipeRepository;
    private boolean mIsViewingRecipes;

    public RecipeListViewModel() {
        mIsViewingRecipes = false;
        mRecipeRepository = RecipeRepository.getInstance();
    }

    public LiveData<List<Recipe>> getRecipes(){
        return mRecipeRepository.getRecipes();
    }

    public void searchRecipesApi(String query, int pageNumber){
        mIsViewingRecipes = true;
        mRecipeRepository.searchRecipesApi(query, pageNumber);
    }

    public boolean isViewingRecipes(){
        return mIsViewingRecipes;
    }

    public void setIsViewingRecipes(boolean isViewingRecipes){
        mIsViewingRecipes = isViewingRecipes;
    }

}
