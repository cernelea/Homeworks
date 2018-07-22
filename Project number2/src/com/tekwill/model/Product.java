package com.tekwill.model;

public abstract class Product<T1, T2> {

    protected T1 id;
    protected T2 name;

    public Product(T1 id, T2 name) {
        this.id = id;
        this.name = name;

    }

    public T1 getId() {

        return this.id;
    }

    public void setId(T1 id) {

        this.id = id;

    }

    public T2 getName() {

        return this.name;

    }

    public void setName(T2 name) {

        this.name = name;

    }

    public abstract void setType(T2 type);

    public abstract void setSize(Double size);

    public String toString() {

        return this.id + " " + this.name;
    }

}
