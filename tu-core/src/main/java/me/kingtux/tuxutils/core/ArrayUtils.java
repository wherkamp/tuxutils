package me.kingtux.tuxutils.core;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {


    public static <T> List<T> toList(T[] t) {
        List<T> list = new ArrayList<>();
        for (T s : t) {
            list.add(s);
        }
        return list;
    }
}
