package com.wiki.poc.util;

import java.util.Random;

public class StringUtil {

    public static int getTestMsg(int random) {
        Random r = new Random();
        int temp = r.nextInt(random);
        if (temp < 100000)
            temp = temp + 100000;
        return (temp);
    }
}
