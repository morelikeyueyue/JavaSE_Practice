package com.qiqi.test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取输入数据
        int n = scanner.nextInt(); // 岛上田地块数
        int a = scanner.nextInt(); // 选定区域右上角x坐标
        int b = scanner.nextInt(); // 选定区域右上角y坐标
        int[][] farmlands = new int[n][4]; // 存储每块田地的位置信息
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                farmlands[i][j] = scanner.nextInt();
            }
        }
        // 计算选定区域内的田地面积
        int area = 0; // 初始化面积为0
        for (int i = 0; i < n; i++) {
            // 计算每块田地与选定区域的交集矩形的左下角和右上角坐标
            int x1 = Math.max(0, farmlands[i][0]); // 左下角x坐标
            int y1 = Math.max(0, farmlands[i][1]); // 左下角y坐标
            int x2 = Math.min(a, farmlands[i][2]); // 右上角x坐标
            int y2 = Math.min(b, farmlands[i][3]); // 右上角y坐标

            // 如果交集矩形存在，即满足x1 < x2 && y1 < y2，则累加其面积到总面积中
            if (x1 < x2 && y1 < y2) {
                area += (x2 - x1) * (y2 - y1);
            }
        }

        // 输出结果
        System.out.println(area);
    }
}
