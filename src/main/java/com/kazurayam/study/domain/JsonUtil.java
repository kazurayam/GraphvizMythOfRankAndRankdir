package com.kazurayam.study.domain;

import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static String prettyPrint(String sourceJson) {
        return prettyPrint(sourceJson, Map.class);
    }

    public static <T> String prettyPrint(String sourceJson, Class<T> clazz) {
        // parse JSON text to a Map
        Object obj = gson.fromJson(sourceJson, clazz);
        // serialize the object back to a JSON text in pretty-print format
        return gson.toJson(obj);
    }

    /**
     * Given the str variable has `abc`, then a quoted string `"abc"` is returned.
     * Given the str variable contains JSON sensitve characters,
     * then these characters will be escaped with back slash character:
     *    `{"who":"knows"}` -> `"\{\"who\"\:\"knows\"\}"`
     * @param str
     * @return
     */
    public static String escape(String str) {
        return gson.toJson(str);
    }
}
