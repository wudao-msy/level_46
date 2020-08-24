package com.njfu.test;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Author:msy
 * Date:2020-07-28 14:59
 * Description:<描述>
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //FTPClient ftp=new FTPClient();
        //ftp.connect("192.168.203.136",21);
        //ftp.login("ftpuser","123");
        //ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
        //InputStream is=new FileInputStream("D:/news.jpg");
        //ftp.storeFile("21.jpg",is);
        //ftp.logout();
        InputStream is=new FileInputStream("D:/news.jpg");
        FtpUtil.uploadFile("192.168.203.136",21,"ftpuser","123","/home/ftpuser","/","zz.jpg",is);
        System.out.println("上传成功");


    }

}
