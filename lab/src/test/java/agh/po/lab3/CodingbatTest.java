package agh.po.lab3;
import static org.junit.jupiter.api.Assertions.*;

class CodingbatTest {
    Codingbat codingbat = new Codingbat();

    @org.junit.jupiter.api.Test
    void array667() {
        assertEquals(1, codingbat.array667(new int[]{2,3,5,6,7}) );
        assertEquals(4, codingbat.array667(new int[]{6,6,6,7,6,6}) );
        assertEquals(0, codingbat.array667(new int[]{1,1,6,1,6}) );
        assertEquals(0, codingbat.array667(new int[]{666,66,6,66,666}) );
        assertEquals(0, codingbat.array667(new int[]{10,2,4,7,8}) );
    }
    @org.junit.jupiter.api.Test
    void array123(){
        assertEquals(true, codingbat.array123(new int[]{1,2,3,5,6,7}) );
        assertEquals(false, codingbat.array123(new int[]{6,6,6,7,6,6}) );
        assertEquals(false, codingbat.array123(new int[]{1,1,6,1,6}) );
        assertEquals(true, codingbat.array123(new int[]{666,1,2,3,666}) );
        assertEquals(false, codingbat.array123(new int[]{10,2,4,7,8}) );
    }
}