package com.itheima.search;

public class A03_BlockSearchDemo {
    public static void main(String[] args) {
                /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可
        */
        int[] arr = {16, 5, 9, 12, 21, 18,
                    32, 23, 37, 26, 45, 34,
                    50, 48, 61, 52, 73, 66};
        //创建三个块的对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);
        //定义数组来管理三个块的对象(索引表)
        Block[] blockArr = {b1,b2,b3};
        //定义一个变量来记录要查询的值
        int number = 23;
        //调用方法,传递索引表\数组\要查找的元素
        int index = getIndex(blockArr,arr,number);
        //打印一下
        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //1.确定number是在那一块当中
        int indexBlock = findIndexBlock(blockArr, number);
        if(indexBlock == -1){
            //表示number不在数组当中
            return -1;
        }
        //2.获取这一块的起始索引和结束索引   --- 30
        // Block b1 = new Block(21,0,5);   ----  0
        // Block b2 = new Block(45,6,11);  ----  1
        // Block b3 = new Block(73,12,17); ----  2
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i]==number){
                return i;
            }
        }
        return -1;
    }

    private static int findIndexBlock(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number<=blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }

}
class Block{
    private int max;//最大值
    private int startIndex;//起始索引
    private int endIndex;//结束索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
