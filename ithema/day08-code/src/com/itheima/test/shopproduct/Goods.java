package com.itheima.test.shopproduct;

public class Goods {
    private String id;
    private String name;
    private double price;
    private int quantity;


    public Goods() {
    }

    public Goods(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * ��ȡ
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * ����
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * ����
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * ��ȡ
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * ����
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
