package com.example.saidera.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idItem")
    private int idItem;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "value", length = 45)
    private double value;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem() {
        this.idItem = idItem;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue() {
        this.value = value;
    }
}