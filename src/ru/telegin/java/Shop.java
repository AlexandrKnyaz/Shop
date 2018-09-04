package ru.telegin.java;

public class Shop {
    private String name;
    private String adress;
    private String[] productsName;
    private int[] price;

    public Shop(int arraySize) {
        this.productsName = new String[arraySize];
        this.price = new int[arraySize];
    }

    public Shop(String name, String adress, int arraySize) {
        this(arraySize);
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void addPrice(int price) {
        int i;
        for(i = 0; this.price[i]!=0 && i < this.price.length; i++);
        if (i == this.price.length) {
            System.out.println("Свободного места нет");
        } else {
            this.price[i] = price;
        }
    }

    public void addProductName(String productName) {
        int i;
        for (i = 0; this.productsName[i] != null && i <this.productsName.length; i++);
        if(i == this.productsName.length) {
            System.out.println("Свободного места нет");
        } else {
            this.productsName[i] = productName;
        }
    }

    public void printInfo(){
        for(int i = 0; i < productsName.length; i++){
            System.out.println(productsName[i] + " - " + price[i]);
        }
    }

    public void getMinProduct() {
        int min = price[0];
        int index = 0;
        for(int i=0; i<price.length; i++){
            if(price[i] < min){
                min = price[i];
                index = i;
            }
        }
        System.out.println("Самый дешевый товар это "+ productsName[index] + " с ценой - " + price[index]);
    }

    public void getMaxProduct() {
        int max = price[0];
        int index = 0;
        for(int i = 0; i < price.length; i++){
            if(price[i] > max) {
                max = price[i];
                index = i;
            }
        }
        System.out.println("Самый дорогой товар это "+ productsName[index] + " с ценой - " + price[index]);
    }

    public void addPrice(int...priceProduct){
        for(int i=0; i<priceProduct.length; i++){
            price[i] = priceProduct[i];
        }
    }



    public void addProductName(String...name){
        for(int i=0; i<name.length; i++){
            productsName[i] = name[i];
        }
    }


    public void removeProduct(){
        for(int i = 0; i < price.length; i++){
            productsName[i] = null;
            price[i] = 0;

        }

    }

    public void removeProduct(String productName){
        for(int i = 0; i < productsName.length; i++){
            productsName[i] = null;
            price[i] = 0;
    }



}
}
