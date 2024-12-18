package org.com.example.billgenerator.models;

import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Entity
public class Bill  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;
    private double total;


//    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
//    private List<Item> items;

}
