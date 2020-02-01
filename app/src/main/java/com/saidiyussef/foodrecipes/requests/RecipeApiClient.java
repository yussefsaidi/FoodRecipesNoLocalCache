package com.saidiyussef.foodrecipes.requests;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.saidiyussef.foodrecipes.models.Recipe;

import java.util.List;

public class RecipeApiClient {

    private MutableLiveData<List<Recipe>> mRecipes;

    private static RecipeApiClient instance;

    public static RecipeApiClient getInstance(){
        if(instance == null){
            instance = new RecipeApiClient();
        }
        return instance;
    }

    private RecipeApiClient(){
        mRecipes = new MutableLiveData<>();
    }

    public LiveData<List<Recipe>> getRecipes(){
        return mRecipes;
    }
}
