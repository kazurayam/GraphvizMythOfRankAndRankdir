package com.kazurayam.study.domain;

import java.util.ArrayList;
import java.util.List;

public class MProductGroup implements Jsonifiable {
    private final MaterialList leftList;
    private final MaterialList rightList;
    private final List<MaterialProduct> mProductGroup;
    public MProductGroup(MaterialList leftList, MaterialList rightList) {
        this.leftList = leftList;
        this.rightList = rightList;
        this.mProductGroup = new ArrayList<>();
        zipMaterialList();
    }

    @Override
    public String toJson() {
        throw new RuntimeException("TODO");
    }

    @Override
    public String toString() { return this.toJson(); }
    /**
     * given with leftList and rightList, create entries of mProductGroup
     */
    private void zipMaterialList() {
        // do something mysterious
    }
}
