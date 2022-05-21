package com.kazurayam.study.domain;

public interface Jsonifiable {

    String toJson();


    default String toJson(boolean prettyPrint) {
        if (prettyPrint) {
            return JsonUtil.prettyPrint(toJson());
        } else {
            return this.toJson();
        }
    }
}
