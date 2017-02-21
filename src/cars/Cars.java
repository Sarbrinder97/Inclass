/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.time.LocalDate;

/**
 *
 * @author Michael
 */
public class Cars {
    String make, model, features;
    int year;
    double mileage, price;

    public Cars(String make, String model, String features, int year, double mileage, double price){
        this.make = make;
        this.features = features;
        this.model = model;
        setYear(year);
        this.mileage = mileage;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getYear() {
         return year;
    }

    public void setYear(int year) {
        if(year < 1950 || year > 2017)
            throw new IllegalArgumentException("The year is not valid");
        else
          this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        if (mileage > 400000 || mileage < 0)
            throw new IllegalArgumentException("Mileage entered is not valid");
        else
            this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString()
    {
        return "The car model is " + make + " " + model "";
    }
    
}
