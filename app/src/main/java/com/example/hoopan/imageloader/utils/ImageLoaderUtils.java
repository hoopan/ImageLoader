package com.example.hoopan.imageloader.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by hoopan on 16/3/18.
 */
public class ImageLoaderUtils {

    public static void close(Closeable closeable){
        try {
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
