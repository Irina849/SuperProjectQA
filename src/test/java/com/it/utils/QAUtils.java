package com.it.utils;

import com.it.users.User;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QAUtils {
    public static String getRandomString(int count) {
        return new Random()
                .ints('a', 'z')
                .limit(count)
                .mapToObj(s -> "" + (char) s)
                .collect(Collectors.joining());
    }


}
