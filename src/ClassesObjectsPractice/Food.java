package ClassesObjectsPractice;

public class Food {
    private String foodName; //instance variables - are always private
    private double foodPrice; //instance variables - are always private

    public Food(){ //default constructor
        foodName = "ramen";
        foodPrice = 1.50;
    }

    public String getFoodName(){ //getter method
        return foodName;
    }

    public double getFoodPrice(){ //getter method
        return foodPrice;
    }

    public void setFoodName(String foodName){ //setter method
        this.foodName = foodName;
    }

    public void setFoodPrice(double foodPrice){ //setter method
        this.foodPrice = foodPrice;
    }




}
