package com.crimsonlogic.collections.hashsetexample.product;

public class Product {


    private int productid;
    private String ProductName;

    @Override
    public String toString() {
        return "===================="+ProductName+"===================" +
                "\nproduct Id    =" + productid +
                "\n Product Name ='" + ProductName +
                "\n prices       =" + prices +
                "\n Qty          =" + Qty +
                "\n=============================================";
    }

    private  double prices;

    public Product(int productid, String productName, double prices, int qty) {
        this.productid = productid;
        ProductName = productName;
        this.prices = prices;
        Qty = qty;
    }

    private  int Qty ;



    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }


}
