package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GalleryTest {
    @Test
    public void testAdd() {
        String data = "1";
        Gallery<String> received = new Gallery<>();
        received.add(data,0);
        received.add("2",0);
        received.add("3",2);

        assertTrue(received.checkData("2",0) && received.checkData("1",1) && received.checkData("3",2));
    };

    @Test
    public void testClear() {
        Gallery<String> received = new Gallery<>();
        received.add("1",0);
        received.add("2",1);
        received.add("3",2);

        received.clear(2);

        assertTrue(received.checkData("1",0) && received.checkData("2",1));
    }

    @Test
    public void testClearAll() {
        Gallery<String> received = new Gallery<>();
        received.add("1",0);
        received.add("2",1);
        received.add("3",2);

        received.clear(2);
        received.clear(1);
        received.clear(0);

        assertTrue(received.checkSize(0));
    }

    @Test
    public void testGet() {
        Gallery<String> received = new Gallery<>();
        received.add("1",0);
        received.add("2",1);
        received.add("3",2);

        assertTrue(received.checkData(received.getData(2),2));
    }
}
