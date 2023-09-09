package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //游戏界面

    //创建二维数组
    int[][] data = new int[4][4];
    //定义一个正确二维数组用于判断是否胜利

    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //记录空白方块在二维数组中的位置
    int x, y;

    //定义变量,用来统计步数
    int step = 0;

    //创建功能下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");

    //定义一个变量,记录当前展示图片的路径
    String path = "image\\animal\\animal3\\";

    //定义一个变量,记录完整图片的路径
    String allPath = path + "\\all.jpg";

    public GameJFrame() {
        //初始化界面
        initJF();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initdata();

        //初始化图片
        initImage();

        //让界面显示出来,写在最后
        this.setVisible(true);
    }

    //判断data里面的数据是否和win中一致 是 返回true
    private boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    //有一个不一致就返回false
                    return false;
                }
            }
        }
        //全部一致
        return true;
    }

    //打乱二维数组
    private void initdata() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = arr[i];
        }
        //遍历二维数组
/*        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+", ");
            }
            System.out.println();
        }*/

/*        int number = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = arr[number];
                number++;
            }
        }*/
    }

    //打乱图片
    private void initImage() {
        //路径:绝对路径  从盘符开始
        //相对路径 相对于当前项目而言

        //清空原本已经出现的图片
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利的图片
            JLabel win = new JLabel(new ImageIcon("image\\win.png"));
            win.setBounds(203, 283, 197, 73);
            this.getContentPane().add(win);
        }

        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

//        int number = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个JLabel对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path + data[i][j] + ".jpg"));
                //指定位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框  RAISED
                //0: 让图片凸起来, 1: 让图片凸起来  LOWERED
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel);
                //添加一次之后number需要自增
//                number++;
            }

        }
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
        //先添加的图片在上面,后添加的图片在下面


        //刷新一下界面
        this.getContentPane().repaint();

    }


    //初始化界面设置
    private void initJF() {
        //创建游戏界面,设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(3);//WindowConstants.EXIT_ON_CLOSE
        //取消默认的居中放置,这样才能按照xy轴的方式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }


    //初始化菜单设置
    private void initJMenuBar() {

        //创建菜单对象
        JMenuBar gameJMenuBar = new JMenuBar();

        //创建菜单上的两个选项的对象 功能 联系我们
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changeImageMenu = new JMenu("更换图片");


        //将每一个选项下面的条目,添加到选项中
        functionJMenu.add(changeImageMenu);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        changeImageMenu.add(girlItem);
        changeImageMenu.add(animalItem);
        changeImageMenu.add(sportItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);

        accountItem.addActionListener(this);

        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);


        //将菜单里面的两个选项添加到菜单中
        gameJMenuBar.add(functionJMenu);
        gameJMenuBar.add(aboutJMenu);

        //给整个界面去设置菜单
        this.setJMenuBar(gameJMenuBar);
    }

    //键盘监听
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //判断游戏是否胜利,胜利此方法直接结束,不能在执行下面的移动代码了
        if (victory()) {
            return;
        }
        //按下a不松时  65
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            //加载完整图片
            JLabel all = new JLabel(new ImageIcon(allPath));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景图片
            JLabel background = new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利,胜利此方法直接结束,不能在执行下面的移动代码了
        if (victory()) {
            return;
        }
        //对上下左右进行判断
        //左37 右39 上38 下40
        int code = e.getKeyCode();
        switch (code) {
            case 37: {
                if (y == 3) {
                    return;
                }
                System.out.println("向左移动");
                data[x][y] = data[x][y + 1];
                data[x][y + 1] = 0;
                y++;
                step++;
                initImage();
            }
            case 38: {
                System.out.println("向上移动");
                //逻辑:把空白方块的数字往上移动
                // x+1 y 表示空白位置下方的数字 把空白方块下方的数字赋值给空白方块
                if (x == 3) {
                    return;
                }
                data[x][y] = data[x + 1][y];
                data[x + 1][y] = 0;
                x++;
                step++;
                initImage();

            }
            case 39: {
                if (y == 0) {
                    return;
                }
                System.out.println("向右移动");
                data[x][y] = data[x][y - 1];
                data[x][y - 1] = 0;
                y--;
                step++;
                initImage();
            }
            case 40: {
                if (x == 0) {
                    return;
                }
                System.out.println("向下移动");
                data[x][y] = data[x - 1][y];
                data[x - 1][y] = 0;
                x--;
                step++;
                initImage();
            }
            case 65: {
                System.out.println("按键A 查看完整图片");
                //重新加载图片
                initImage();
            }
            case 87: {
                System.out.println("按键W 作弊码 直接获胜");
                data = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}
                };
                initImage();
            }
            default: {
                System.out.println("其他无效按键");
            }
        }
    }


    //动作监听
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == replayItem) {
            System.out.println("重新游戏");
            //再次打乱二维数组中的数据
            initdata();
            this.getContentPane().removeAll();
            //计步器归零
            step = 0;
            //重新加载图片
            initImage();

        } else if (e.getSource() == reLoginItem) {
            System.out.println("重新登录");
            //返回登录界面
            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();

        } else if (e.getSource() == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机即可
            System.exit(0);

        } else if (e.getSource() == accountItem) {
            System.out.println("弹出公众号");
            //创建弹框对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.png"));
            //设置位置和宽高
            jLabel.setBounds(0, 0, 258, 258);
            //把图片添加到弹框中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344, 344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);

        } else if (e.getSource() == girlItem) {
            System.out.println("更换美女照片");
            Random r = new Random();
            //计步器归零
            step = 0;
            //更换照片路径
            String str = "girl";
            int index = r.nextInt(13) + 1;
            System.out.println(index);
            String strIndex = str + Integer.toString(index);
            path = "image\\" + str + "\\" + strIndex + "\\";
            allPath = path + "\\all.jpg";
            //清空所有图片
            this.getContentPane().removeAll();
            //重新打乱数组
            initdata();
            //重新加载图片
            initImage();


        } else if (e.getSource() == animalItem) {
            System.out.println("更换动物照片");
            Random r = new Random();
            //计步器归零
            step = 0;
            //更换照片路径
            String str = "animal";
            int index = r.nextInt(8) + 1;
            System.out.println(index);
            String strIndex = str + Integer.toString(index);
            path = "image\\" + str + "\\" + strIndex + "\\";
            allPath = path + "\\all.jpg";
            //清空所有图片
            this.getContentPane().removeAll();
            //重新打乱数组
            initdata();
            //重新加载图片
            initImage();


        } else if (e.getSource() == sportItem) {
            System.out.println("更换运动照片");
            Random r = new Random();
            //计步器归零
            step = 0;
            //更换照片路径
            String str = "sport";
            int index = r.nextInt(10) + 1;
            System.out.println(index);
            String strIndex = str + Integer.toString(index);
            path = "image\\" + str + "\\" + strIndex + "\\";
            allPath = path + "\\all.jpg";
            //清空所有图片
            this.getContentPane().removeAll();
            //重新打乱数组
            initdata();
            //重新加载图片
            initImage();

        }
    }
}
