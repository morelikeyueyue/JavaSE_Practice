package com.itheima.util;

import com.itheima.ui.NoteJFrame;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipThread extends Thread {
    static JDialog jDialog;
    public ZipThread(JDialog jDialog) {
        this.jDialog = jDialog;
    }

    @Override
    public void run() {
        if (getName().equals("导出功能")){
            //1.创建要压缩的文件夹路径
            File src = new File("diary\\save");
            //2.获得要压缩的文件夹的父级路径
            File destParent = src.getParentFile();
            //3.创建要压缩的目的地路径
            File dest = new File(destParent,src.getName()+".zip");
            try {
                //4.创建压缩流来关联压缩包
                ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
                //5.获取src里面的每一个文件,变成zipentry对象,放入到压缩包
                toZip(src,zos,src.getName());
                //6.释放资源
                zos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            ShowJDialogUtil.showJDialog(getName()+"已完成导出");
        }else if(getName().equals("导入功能")){
            //1.创建一个File表示要解压的路径
            File src = new File("diary\\save.zip");
            //2.创建一个File表示解压的目的地
            File dest = new File("diary");
            try {
                unzip(src, dest);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            ShowJDialogUtil.showJDialog(getName()+ "已完成导入");
            ShowJDialogUtil.showJDialog("请重新启动页面");
        }

    }

    /**
     * 作用:压缩目的文件夹到该文件夹的父目录处
     * @param src 要压缩的文件夹
     * @param zos 压缩流
     * @param name 上级路径
     * @throws IOException
     */
    private void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断是文件,变成zipentry对象,放到压缩包中
                ZipEntry entry = new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(entry);
                //读取文件中的数据,写到压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();

            }else {
                //4.判断是文件夹,递归
                toZip(file,zos,name+"\\"+file.getName());
            }

        }
    }


    /**
     * 作用:解压缩目的压缩包
     * @param src 要解压的压缩包
     * @param dest 解压目的地
     */
    private void unzip(File src, File dest) throws IOException {
        //解压的本质:把压缩包里面的每一个文件或者文件夹读取出来,按照层级拷贝到目的地中
        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //要先获取到压缩包里面的每一个zipentry对象
        ZipEntry entry;
        while ((entry = zip.getNextEntry() )!=null) {
            System.out.println(entry);
            if (entry.isDirectory()){
                //文件夹:需要在目的地dest处创建一个同样的文件夹
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }else {
                //文件:需要读取到压缩包中的文件,并且把他存放到目的地dest文件夹中(按照层级目录进行存放)
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b =zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }

        }
        zip.close();
    }

}
