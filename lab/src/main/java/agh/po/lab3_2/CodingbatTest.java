package agh.po.lab3_2;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(Map.of())
    }
}