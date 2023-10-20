package Shopkeeper;

class Product{
    String productName;
    double unitPrice;
    double gstPercentage;
    int quantity;

    public Product(String productName, double unitPrice, double gstPercentage, int quantity){
     this.productName=productName;
     this.unitPrice=unitPrice;
     this.gstPercentage=gstPercentage;
     this.quantity=quantity;
    }

    public double getTotalPrice(){
        double discount = 0;
        if(unitPrice >= 500){
            discount = unitPrice*0.05;
        }
        double amount = (unitPrice-discount)*(1 + gstPercentage/100)*quantity;
        return amount; 
    }
}