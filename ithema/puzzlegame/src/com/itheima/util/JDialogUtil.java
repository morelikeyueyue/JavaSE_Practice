package com.itheima.util;

import javax.swing.*;

public class JDialogUtil {
    public static void showJDialog(String content){
        //����һ����������
        JDialog jDialog = new JDialog();
        //���ô�С
        jDialog.setSize(200,150);
        //�õ����ö�
        jDialog.setAlwaysOnTop(true);
        //�õ������
        jDialog.setLocationRelativeTo(null);
        //Ϊ�ر�ǰ���ܲ���������ҳ��
        jDialog.setModal(true);

        //����jlabel����������ֲ���ӵ�������
        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        //�õ���չʾ����
        jDialog.setVisible(true);

    }
}
