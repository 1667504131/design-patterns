package io;

import java.io.*;

/**
 * @ProjectName: io中常见方法
 * @Package: io
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/2/13 15:58
 * @Version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //Demo01.text1();
        /*File file = new File("D:/111/xixi.txt");
        text3(file);
        text2(file);*/
        /*try {
            copyFile("D:/111/xixi.txt","D:/111/2.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        copyDir("D:/111","D:/222");
    }
    public static void text1(){
        File file = new File("C:/Users/user/Downloads/1952059495-doc文档.rar");
        System.out.println(file.getName());//返回名称
        System.out.println(file.getFreeSpace());
    }

    /**
     * create by: DongJW
     * description: 字节输入流
     * create time: 2020/2/13 17:05
     * @Param: file
     * @return void
     */
    public static void text2(File file){

        FileInputStream fi = null;
        try {
            fi = new FileInputStream(file);
            byte[] bt = new byte[1024];
            int len;
            while (-1!=(len=fi.read(bt))){
                String str = new String(bt,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=fi){
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void text3(File file)  {
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream(file,false);
            String str = "我是董嘉伟11\r\nhahhahah";
            byte[] bytes = str.getBytes();
            fo.write(bytes,0,bytes.length);
            fo.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=fo){
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * create by: DongJW
     * description: 拷贝文件
     * create time: 2020/2/13 18:22
     * @Param: srcPath 源文件路径
     * @Param: destPath 目标文件路径
     * @return void
     */
    public static void copyFile(String srcPath,String destPath)throws Exception{

        copyFile(new File(srcPath),new File(destPath));
    }

    /**
     * create by: DongJW
     * description: 拷贝文件
     * create time: 2020/2/13 18:23
     * @Param: src 源文件关联对象
     * @Param: dest 目标文件关联对象
     * @return void
     */
    public static void copyFile(File src,File dest)throws Exception{
        if (!src.isFile()){
            System.out.println("只能拷贝文件！");
            throw new IOException("只能拷贝文件！");
        }
        //dest为已经存在的文件夹，不能建立与文件夹同名的文件
        if (dest.isDirectory()){
            System.out.println("不能建立与文件夹同名的文件！");
            throw new IOException(dest.getAbsolutePath()+"不能建立与文件夹同名的文件！");
        }
        //选择流
        InputStream is = new FileInputStream(src);
        OutputStream os = new FileOutputStream(dest);
        //文件拷贝 循环+读取+写出
        byte[] bytes = new byte[1024];
        int len;
        while (-1!=(len=is.read(bytes))){
            //写出
            os.write(bytes,0,len);
        }
        //强制写入刷新
        os.flush();
        //关闭流
        os.close();
        is.close();
    }


    /**
     * create by: DongJW
     * description: 拷贝文件夹
     * create time: 2020/2/13 18:43
     * @Param: srcPath 源路径
     * @Param: destPath 目标路径
     * @return void
     */
    public static void copyDir(String srcPath,String destPath){
        File src = new File(srcPath);
        File dest = new File(destPath);
        copyDir(src,dest);
    }

    /**
     * create by: DongJW
     * description: 拷贝文件夹
     * create time: 2020/2/13 18:47
     * @Param: src
     * @Param: dest
     * @return void
     */
    public static void copyDir(File src,File dest){
        if (dest.isDirectory()){
            dest = new File(dest,src.getName());
        }
        copyDirDetail(src,dest);
    }

    /**
     * create by: DongJW
     * description: 拷贝文件夹细节
     * create time: 2020/2/13 18:43
     * @Param: src
     * @Param: dest
     * @return void
     */
    public static void copyDirDetail(File src,File dest){
        if (src.isFile()){
            try {
                copyFile(src,dest);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (src.isDirectory()){
            //确保目标文件夹存在
            dest.mkdirs();
            //获取下一级目录
            for (File sub:src.listFiles()){
                copyDirDetail(sub,new File(dest,sub.getName()));
            }
        }
    }
}
