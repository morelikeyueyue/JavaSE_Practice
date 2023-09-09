package com.itheima.util;

import javax.swing.*;

public class JDialogUtil {
    public static void showJDialog(String content){
        //创建一个弹窗对象
        JDialog jDialog = new JDialog();
        //设置大小
        jDialog.setSize(200,150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //为关闭前不能操作其他的页面
        jDialog.setModal(true);

        //创建jlabel对象管理文字并添加到弹框中
        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);

    }
}
