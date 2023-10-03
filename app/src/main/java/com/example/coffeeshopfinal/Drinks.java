package com.example.coffeeshopfinal;

public class Drinks {

    private String name;
    private String desc;
    private double price;
    private int imageID;

    public static final Drinks[] drinks={
        new Drinks("Latte", "this is a description of latte",1.50,R.drawable.latte3_small ),
        new Drinks("Cappuccino", "this is a description of Cappuccino",2.50,R.drawable.latte3_small ),
        new Drinks("Tea", "this is a description of Tea",1.50,R.drawable.latte3_small ),
        new Drinks("Coffee", "this is a description of Coffee",1.50,R.drawable.latte3_small ),
        new Drinks("Green Tea", "this is a description of latte",1.50,R.drawable.latte3_small ),
        new Drinks("Regular Coffee", "this is a description of latte",1.50,R.drawable.latte3_small )


};
    private  Drinks(String name, String desc, double price, int imageID) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.imageID = imageID;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
