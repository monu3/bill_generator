package org.com.example.billgenerator.models;


import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

//    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Bill.class)
//
//    @JoinColumn(name = "Bill_Table", foreignKey = @ForeignKey(name = "fk_itemId"))
//    private Bill bill;


}
