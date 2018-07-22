package com.tekwill.model;

public class Shoe<T1, T2> extends Product<T1, T2> {

    private T2 type;
    private Double size;

    public Shoe(T1 id, T2 name, Double size, T2 type) {
        super(id, name);
        this.type = type;
        this.size = size;
    }

    public T2 getType() {

        return this.type;

    }

    public void setType(T2 type) {

        this.type = type;

    }

    public Double getSize() {

        return this.size;
    }

    @Override
    public void setSize(Double size) {
        this.size = size;
    }

    public String toString() {

        return this.id + " " + this.name + " " + this.size + " " + this.type;
    }

}
