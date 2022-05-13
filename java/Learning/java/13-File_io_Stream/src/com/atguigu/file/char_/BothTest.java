package com.atguigu.file.char_;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: cgr
 * @date: 2022/4/21 - 10:44
 */
public class BothTest {

    @Test
    public void test(){

        File srcFile = new File("hello.txt");
        File desFile = new File("hello1.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(desFile);

            char[] chars = new char[5];
            int len;
            while ((len = fileReader.read(chars)) != -1){
                fileWriter.write(chars,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader != null && fileWriter != null){
                    fileReader.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
