package com.thomsonxu.drugstore.entity;

public class Drug {
    private String drug_id, drug_name, manufacturer;
    private Double price;

    public Drug(String drug_id, String drug_name, String manufacturer, Double price) {
        this.drug_id = drug_id;
        this.drug_name = drug_name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
