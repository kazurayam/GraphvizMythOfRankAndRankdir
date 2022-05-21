package com.kazurayam.study.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MaterialProduct implements Jsonifiable {
    private final Material left;
    private final Material right;
    public MaterialProduct(Material left, Material right) {
        this.left = left;
        this.right = right;
    }
    public Material getLeft() { return this.left; }
    public Material getRight() { return this.right; }

    @Override
    public String toJson() {
        throw new RuntimeException("TODO");
    }

    @Override
    public String toString() { return this.toJson(); }
}
