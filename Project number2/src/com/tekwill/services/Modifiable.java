package com.tekwill.services;



public interface Modifiable<K , V > {

    public void create(K id, String name, Double size, String type);

    public V find(K id);

    public V find(String name);

    public V update(K id, Integer newId, String name, Double size, String type);

    public void delete(K id);

}
