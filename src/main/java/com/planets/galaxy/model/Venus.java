package com.planets.galaxy.model;

import jakarta.persistence.*;

@Entity
@Table(name="venus")
public class Venus {
    @Id
    @GeneratedValue
    private String id;
    @Column
    private String color;
    @Column(name = "description")
    private String desc;

    public Venus(String id, String color, String desc) {
        this.id = id;
        this.color = color;
        this.desc = desc;
    }

    public Venus() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
