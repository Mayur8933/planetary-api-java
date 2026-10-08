package com.planets.galaxy.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "mercury")
public class Mercury {
    @Id
    @GeneratedValue
    private String id;

    @NotNull
    @Column
    private String color;

    @Column(name = "description")
    private String desc;

    public Mercury(String id, String color, String desc) {
        this.id = id;
        this.color = color;
        this.desc = desc;
    }

    public Mercury() {

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
