package com.atguigu.file.char_;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: cgr
 * @date: 2022/4/20 - 22:56
 */
public class FileReaderTest {


    @Test
    public void test() throws IOException {
        File file = null;
        FileReader fileReader = null;
        try {
            // 实例化 File 对象
            file = new File("hello.txt");

            // 提供具体的流
            fileReader = new FileReader(file);

            // 读入数据
//            int data = fileReader.read();
//            while(data != -1){
//                System.out.print((char) data);
//                data = fileReader.read();
//            }
            char[] charsBuf = new char[8];
            int len = fileReader.read(charsBuf);
            while (len != -1){

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader != null){
                    // 关闭流
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
