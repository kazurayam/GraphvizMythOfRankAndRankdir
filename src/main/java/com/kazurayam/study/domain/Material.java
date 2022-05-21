package com.kazurayam.study.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Material implements Jsonifiable {

    private final String id;
    private final String content;

    public Material(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public Material(String json) {
        Gson gson = new GsonBuilder().create();
        Material source = gson.fromJson(json, Material.class);
        this.id = source.getId();
        this.content = source.getContent();
    }

    public String getId() { return this.id; }

    public String getContent() { return this.content; }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(this);
    }

    @Override
    public String toString() { return this.toJson(); }

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Material) ) {
            return false;
        }
        Material other = (Material)obj;
        return other.getId().equals(this.getId()) &&
                other.getContent().equals(this.getContent());
    }
}
