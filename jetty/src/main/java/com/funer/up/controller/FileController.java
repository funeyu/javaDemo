package com.funer.up.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by fuheyu on 2018/3/9.
 */

@Controller
public class FileController {
    @RequestMapping(value="/uploadFile", method= RequestMethod.POST)
    @ResponseBody
    public String fileHandler(@RequestParam("apkFile")MultipartFile file) {
        System.out.println("requrest coming!");
        if(!file.isEmpty()) {
            try {
                String rootPath = "\\Users\\fuheyu\\Desktop\\Java";
                File dir = new File(rootPath);
                if(!dir.exists()) {
                    dir.mkdir();
                }
                File serverFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());
                file.transferTo(serverFile);
                return "You successed";
            } catch(Exception e) {
                return "Failed";
            }
        } else {
            return "failed!";
        }
    }

    @RequestMapping(value="/get", method=RequestMethod.GET)
    @ResponseBody
    public String get() {
        return "test!";
    }
}
