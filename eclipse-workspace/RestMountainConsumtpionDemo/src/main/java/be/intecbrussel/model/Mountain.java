package be.intecbrussel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Mountain {
    private  long id;
    private  String name;
    private double height;

    public Mountain() {
    }

    public Mountain(long id, String name, double height) {
        super();
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mountain [id=" + id + "/n, name=" + name + "/n, height=" + height + "/n]";
    }
}
