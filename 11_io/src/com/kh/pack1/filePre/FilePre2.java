package com.kh.pack1.filePre;

import java.io.File;
import java.text.SimpleDateFormat;

public class FilePre2 {
    public void method1(){
        File file1 = new File("C:/Users/babti/front-workspace/01_html");
        System.out.println(file1.exists());

        File[] files = file1.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for(File f : files){
            System.out.println(f.toString());
            System.out.println(f.getName());
            System.out.println(sdf.format(f.lastModified()));
        }

    }
}
