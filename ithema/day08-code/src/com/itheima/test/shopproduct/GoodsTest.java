package com.itheima.test.shopproduct;

public class GoodsTest {
    public static void main(String[] args) {
        //1.����һ������
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
        Goods[] arr = new Goods[3];


        //2.����������Ʒ����
        Goods g1 = new Goods("001","��ΪP40",5999,100);
        Goods g2 = new Goods("002","���±�",227,100);
        Goods g3 = new Goods("003","���",12.7,100);


        //3.����Ʒ��ӵ�������
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods =  arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getQuantity());
        }

    }
}
