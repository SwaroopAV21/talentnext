package com.js.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="jsproduct")
public class JEntity {
    
    @Id
    @Column(name ="pid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer pid;

    @Column(name="product_name")
    public String pname;

    @Column(name="product_price")
    public double pprice;

}
