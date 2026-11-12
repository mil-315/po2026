package agh.po.lab3_2;
import java.util.Map;
import java.util.HashMap;

public class Codingbat {
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a")+ map.get("b"));
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String m : strings){
            map.put(m , m.length());
        }
        return map;
    }


    public static void main(String[] args){
        Codingbat codingbat = new Codingbat();

    }

}
