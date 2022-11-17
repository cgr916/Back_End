package com.atguigu;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author: cgr
 * @date: 2022/5/22 - 15:35
 */
@Controller
public class FileController {

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpSession session) {
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/static/img/1.jpg");
        FileInputStream fileInputStream = null;
        ResponseEntity<byte[]> responseEntity = null;
        try {
            fileInputStream = new FileInputStream(realPath);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            MultiValueMap<String,String> header = new HttpHeaders();
            header.add("Content-Disposition","attachment;filename=1.jpg");
            HttpStatus status = HttpStatus.OK;
            responseEntity = new ResponseEntity<>(bytes, header, status);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return responseEntity;
        }
    }

    @RequestMapping("/upload")
    public String upload(MultipartFile photo,HttpSession session) throws IOException {
        String originalFilename = photo.getOriginalFilename();
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("photo");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdir();
        }
        String finalPath = realPath + File.separator +originalFilename;
        photo.transferTo(new File(finalPath));
        return "file";
    }
}
