package com.example.administrator.wyol_master;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void rex() throws Exception {
        String info = "pjmfdsa54f5dsa3re...564";
        String regex = "[^0-9.]";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(info);

        System.out.println("☆☆☆:" + mat.replaceAll(""));


    }
}