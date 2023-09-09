package test;

public class Test5 {
    public static void main(String[] args) {
        //1.定义三个变量记录三个和尚的身高
        int height1 = 150;
        int height2 = 165;
        int height3 = 210;

        //2.拿着第一个和尚和第二个和尚进行比较
        //再拿着比较结果和第三个和尚进行比较
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        //ctrl+alt+L 自动的格式代码
        System.out.println(max);
    }
}
