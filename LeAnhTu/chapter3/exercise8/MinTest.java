package chapter3.exercise8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class MinTest {

    private Integer a;
    private String b;

    @BeforeEach
    void setUp() {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        this.a = Min.min(intList);
        this.b = Min.min(stringList);
    }


    @Test
    public void testMin() {
        assertEquals(1, this.a);
        assertEquals("a", this.b);
    }


}