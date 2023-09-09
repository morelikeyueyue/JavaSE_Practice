package com.itheima.search;

public class A03_BlockSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};

        //分块
        Block1 b1 = new Block1(40, 22, 0, 4);
        Block1 b2 = new Block1(20, 13, 5, 8);
        Block1 b3 = new Block1(10, 7, 9, 10);
        Block1 b4 = new Block1(50, 40, 11, 13);
        //创建索引表
        Block1[] blockArr = {b1, b2, b3, b4};
        //定义要查找的数字
        int number = 48;
        //调用方法查找
        int index = search(blockArr, arr, number);
        //打印index
        System.out.println(index);
    }

    private static int search(Block1[] blockArr, int[] arr, int number) {
        //1.确定在哪一块中
        int indexBlock = getIndexBlock(blockArr, number);
        if (indexBlock == -1) {
            //不存在
            return -1;
        }
        //2.得到起始索引和结束索引
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;

    }

    private static int getIndexBlock(Block1[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            int max = blockArr[i].getMax();
            int min = blockArr[i].getMin();
            if (number < max && number > min) {
                return i;
            }
        }
        return -1;
    }


}

//创建块的对象
class Block1 {
    private int max;
    private int min;
    private int startIndex;
    private int endIndex;

    public Block1() {
    }

    public Block1(int max, int min, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     *
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", min = " + min + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
