package com.js.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jsproduct")
public class JEntity {
    
    @Id
    @Column(name ="pid")
    public int pid;

    @Column(name="product_name")
    public String pname;

    @Column(name="product_price")
    public double pprice;

}
