package com.atguigu.file.char_;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: cgr
 * @date: 2022/4/20 - 23:11
 */
public class FileWriterTest {

    @Test
    public void test() throws IOException {
        File file = new File("dream.txt");

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write("I have a dream!");

        fileWriter.close();
    }
}
