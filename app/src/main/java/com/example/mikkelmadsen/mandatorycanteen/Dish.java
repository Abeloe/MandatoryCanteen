package com.example.mikkelmadsen.mandatorycanteen;

import java.io.Serializable;

/**
 * Created by MikkelMadsen on 24-03-2017.
 */

public class Dish implements Serializable




{
    private int Alcohol;

    public int getAlcohol() {
        return Alcohol;
    }

    public void setAlcohol(int alcohol) {
        Alcohol = alcohol;
    }

    private int Carbohydrates;


    public int getCarbohydrates() {
        return Carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        Carbohydrates = carbohydrates;
    }

        private String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    private int Energy;

    public int getEnergy() {
        return Energy;
    }

    public void setEnergy(int energy) {
        Energy = energy;
    }

    private double Fat;

    public double getFat() {
        return Fat;
    }

    public void setFat(double fat) {
        Fat = fat;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String PictureUrl;

    public String getPictureUrl() {
        return PictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        PictureUrl = pictureUrl;
    }

    private int Price;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    private double Protein;

    public double getProtein() {
        return Protein;
    }

    public void setProtein(double protein) {
        Protein = protein;
    }

    private String Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
private int Weight;

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public Dish (int alcohol, int carbohydrates, String description, int energy, double fat, int id)
    {
        this.Alcohol = alcohol;
        this.Carbohydrates = carbohydrates;
        this.Description = description;
        this.Energy = energy;
        this.Fat = fat;
        this.id = id;
    }

    public Dish() {   }
}
