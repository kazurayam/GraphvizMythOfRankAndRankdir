package com.kazurayam.study.domain;

import java.util.ArrayList;
import java.util.List;

public class MaterialList implements Jsonifiable {
    private final List<Material> list;
    public MaterialList() {
        list = new ArrayList<>();
    }
    public void add(Material material) {
        list.add(material);
    }
    public int size() {
        return list.size();
    }
    public Material get(int index) {
        return list.get(index);
    }

    @Override
    public String toJson() {
        throw new RuntimeException("TODO");
    }

    @Override
    public String toString() { return this.toJson(); }
}
