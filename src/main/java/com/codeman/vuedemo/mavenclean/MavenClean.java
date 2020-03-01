package com.codeman.vuedemo.mavenclean;

import java.io.File;
/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/2/5 22:58
 * @version: 1.0
 */
public class MavenClean {


        public static void main(String[] args) {
            File file = new File("E:/MavenRepository");
//        System.out.println(file.isDirectory());
            //需要使用递归的方法
            deleteFile(file);
        }

        //删除repository下的已lastUpdated结尾的文件，解决pom.xml文件报错的问题
        public static void deleteFile(File file){
            if(file.isDirectory()){
                //是目录就遍历下面的文件
                File[] files = file.listFiles();
                for (File file2 : files) {
                    deleteFile(file2);
                }
            }else{
                //不是目录就判断文件是否是以lastUpdated结尾,就删除该文件
                if(file.getName().endsWith(".lastUpdated")){
                file.delete();
                    System.out.println(file.getName());
                }
            }
        }

}
