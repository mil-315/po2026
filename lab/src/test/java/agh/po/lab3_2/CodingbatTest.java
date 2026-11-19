package agh.po.lab3_2;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CodingbatTest {

    @org.junit.jupiter.api.Test
    void mapAB() {
        Codingbat codingat = new Codingbat();
        assertEquals(Map.of("a","Hi","ab","HiThere","b","There"),
                codingat.mapAB(new HashMap<>(Map.of("a","Hi","b","There"))));
        assertEquals(Map.of("a","Hi"), codingat.mapAB(new HashMap<>(Map.of("a","Hi"))));
        assertEquals(Map.of("a","aaa","ab","aaabbb","b","bbb", "c","ccc"),
                codingat.mapAB(new HashMap<>(Map.of("a","aaa","ab","nope","b","bbb","c","ccc"))));
    }

    @org.junit.jupiter.api.Test
    void wordLen() {
        Codingbat codingbat = new Codingbat();
        assertEquals(Map.of("a", 1, "bb", 2), codingbat.wordLen(new String[]{"a", "bb", "a", "bb"}));
        assertEquals(Map.of("this", 4, "and", 3, "that", 4), codingbat.wordLen(new String[]{"this", "and", "that", "and"}));
        assertEquals(Map.of("code", 4, "bug", 3), codingbat.wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}