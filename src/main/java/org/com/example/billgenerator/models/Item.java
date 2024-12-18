package org.com.example.billgenerator.models;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;
    private String productName;
    private int price;
    private int discount;
    private String companyName;
    private String location;
    private String contact;

    public Item() {
    }

    public Item(int itemId, String contact, String location, String companyName, int discount, int price, String productName) {
        this.itemId = itemId;
        this.contact = contact;
        this.location = location;
        this.companyName = companyName;
        this.discount = discount;
        this.price = price;
        this.productName = productName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Bill.class)
//
//    @JoinColumn(name = "Bill_Table", foreignKey = @ForeignKey(name = "fk_itemId"))
//    private Bill bill;


}
