package com.saidiyussef.foodrecipes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saidiyussef.foodrecipes.R;
import com.saidiyussef.foodrecipes.models.Recipe;

import java.util.List;

public class RecipeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private List<Recipe> mRecipes;
    private OnRecipeListener mOnRecipeListener;

    public RecipeRecyclerAdapter(List<Recipe> mRecipes, OnRecipeListener mOnRecipeListener) {
        this.mRecipes = mRecipes;
        this.mOnRecipeListener = mOnRecipeListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recipe_list_item, parent, false);
        return new RecipeViewHolder(view, mOnRecipeListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((RecipeViewHolder) holder).title.setText(mRecipes.get(position).getTitle());
        ((RecipeViewHolder) holder).publisher.setText(mRecipes.get(position).getPublisher());
        ((RecipeViewHolder) holder).socialScore.setText(String.valueOf(Math.round(mRecipes.get(position).getSocial_rank())));

    }

    @Override
    public int getItemCount() {
        return mRecipes.size();
    }

    public void setRecipes(List<Recipe> recipes){
        mRecipes = recipes;
        notifyDataSetChanged();
    }

}
