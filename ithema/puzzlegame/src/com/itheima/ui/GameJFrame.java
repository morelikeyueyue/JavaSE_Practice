package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //��Ϸ����

    //������ά����
    int[][] data = new int[4][4];
    //����һ����ȷ��ά���������ж��Ƿ�ʤ��

    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //��¼�հ׷����ڶ�ά�����е�λ��
    int x, y;

    //�������,����ͳ�Ʋ���
    int step = 0;

    //���������������Ŀ����
    JMenuItem replayItem = new JMenuItem("������Ϸ");
    JMenuItem reLoginItem = new JMenuItem("���µ�¼");
    JMenuItem closeItem = new JMenuItem("�ر���Ϸ");
    JMenuItem accountItem = new JMenuItem("���ں�");
    JMenuItem girlItem = new JMenuItem("��Ů");
    JMenuItem animalItem = new JMenuItem("����");
    JMenuItem sportItem = new JMenuItem("�˶�");

    //����һ������,��¼��ǰչʾͼƬ��·��
    String path = "image\\animal\\animal3\\";

    //����һ������,��¼����ͼƬ��·��
    String allPath = path + "\\all.jpg";

    public GameJFrame() {
        //��ʼ������
        initJF();

        //��ʼ���˵�
        initJMenuBar();

        //��ʼ������
        initdata();

        //��ʼ��ͼƬ
        initImage();

        //�ý�����ʾ����,д�����
        this.setVisible(true);
    }

    //�ж�data����������Ƿ��win��һ�� �� ����true
    private boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    //��һ����һ�¾ͷ���false
                    return false;
                }
            }
        }
        //ȫ��һ��
        return true;
    }

    //���Ҷ�ά����
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
        //������ά����
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

    //����ͼƬ
    private void initImage() {
        //·��:����·��  ���̷���ʼ
        //���·�� ����ڵ�ǰ��Ŀ����

        //���ԭ���Ѿ����ֵ�ͼƬ
        this.getContentPane().removeAll();

        if (victory()) {
            //��ʾʤ����ͼƬ
            JLabel win = new JLabel(new ImageIcon("image\\win.png"));
            win.setBounds(203, 283, 197, 73);
            this.getContentPane().add(win);
        }

        JLabel stepCount = new JLabel("����" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

//        int number = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //����һ��JLabel����(��������)
                JLabel jLabel = new JLabel(new ImageIcon(path + data[i][j] + ".jpg"));
                //ָ��λ��
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //��ͼƬ��ӱ߿�  RAISED
                //0: ��ͼƬ͹����, 1: ��ͼƬ͹����  LOWERED
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel);
                //���һ��֮��number��Ҫ����
//                number++;
            }

        }
        //��ӱ���ͼƬ
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
        //����ӵ�ͼƬ������,����ӵ�ͼƬ������


        //ˢ��һ�½���
        this.getContentPane().repaint();

    }


    //��ʼ����������
    private void initJF() {
        //������Ϸ����,���ý���Ŀ��
        this.setSize(603, 680);
        //���ý���ı���
        this.setTitle("ƴͼ������ v1.0");
        //���ý����ö�
        this.setAlwaysOnTop(true);
        //���ý������
        this.setLocationRelativeTo(null);
        //������Ϸ�Ĺر�ģʽ
        this.setDefaultCloseOperation(3);//WindowConstants.EXIT_ON_CLOSE
        //ȡ��Ĭ�ϵľ��з���,�������ܰ���xy��ķ�ʽ������
        this.setLayout(null);
        //������������Ӽ��̼����¼�
        this.addKeyListener(this);
    }


    //��ʼ���˵�����
    private void initJMenuBar() {

        //�����˵�����
        JMenuBar gameJMenuBar = new JMenuBar();

        //�����˵��ϵ�����ѡ��Ķ��� ���� ��ϵ����
        JMenu functionJMenu = new JMenu("����");
        JMenu aboutJMenu = new JMenu("��������");
        JMenu changeImageMenu = new JMenu("����ͼƬ");


        //��ÿһ��ѡ���������Ŀ,��ӵ�ѡ����
        functionJMenu.add(changeImageMenu);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        changeImageMenu.add(girlItem);
        changeImageMenu.add(animalItem);
        changeImageMenu.add(sportItem);

        //����Ŀ���¼�
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);

        accountItem.addActionListener(this);

        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);


        //���˵����������ѡ����ӵ��˵���
        gameJMenuBar.add(functionJMenu);
        gameJMenuBar.add(aboutJMenu);

        //����������ȥ���ò˵�
        this.setJMenuBar(gameJMenuBar);
    }

    //���̼���
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //�ж���Ϸ�Ƿ�ʤ��,ʤ���˷���ֱ�ӽ���,������ִ��������ƶ�������
        if (victory()) {
            return;
        }
        //����a����ʱ  65
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            //��������ͼƬ
            JLabel all = new JLabel(new ImageIcon(allPath));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //���ر���ͼƬ
            JLabel background = new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            //ˢ�½���
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //�ж���Ϸ�Ƿ�ʤ��,ʤ���˷���ֱ�ӽ���,������ִ��������ƶ�������
        if (victory()) {
            return;
        }
        //���������ҽ����ж�
        //��37 ��39 ��38 ��40
        int code = e.getKeyCode();
        switch (code) {
            case 37: {
                if (y == 3) {
                    return;
                }
                System.out.println("�����ƶ�");
                data[x][y] = data[x][y + 1];
                data[x][y + 1] = 0;
                y++;
                step++;
                initImage();
            }
            case 38: {
                System.out.println("�����ƶ�");
                //�߼�:�ѿհ׷�������������ƶ�
                // x+1 y ��ʾ�հ�λ���·������� �ѿհ׷����·������ָ�ֵ���հ׷���
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
                System.out.println("�����ƶ�");
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
                System.out.println("�����ƶ�");
                data[x][y] = data[x - 1][y];
                data[x - 1][y] = 0;
                x--;
                step++;
                initImage();
            }
            case 65: {
                System.out.println("����A �鿴����ͼƬ");
                //���¼���ͼƬ
                initImage();
            }
            case 87: {
                System.out.println("����W ������ ֱ�ӻ�ʤ");
                data = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}
                };
                initImage();
            }
            default: {
                System.out.println("������Ч����");
            }
        }
    }


    //��������
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == replayItem) {
            System.out.println("������Ϸ");
            //�ٴδ��Ҷ�ά�����е�����
            initdata();
            this.getContentPane().removeAll();
            //�Ʋ�������
            step = 0;
            //���¼���ͼƬ
            initImage();

        } else if (e.getSource() == reLoginItem) {
            System.out.println("���µ�¼");
            //���ص�¼����
            //�رյ�ǰ��Ϸ����
            this.setVisible(false);
            //�򿪵�¼����
            new LoginJFrame();

        } else if (e.getSource() == closeItem) {
            System.out.println("�ر���Ϸ");
            //ֱ�ӹر����������
            System.exit(0);

        } else if (e.getSource() == accountItem) {
            System.out.println("�������ں�");
            //�����������
            JDialog jDialog = new JDialog();
            //����һ������ͼƬ����������JLabel
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.png"));
            //����λ�úͿ��
            jLabel.setBounds(0, 0, 258, 258);
            //��ͼƬ��ӵ�������
            jDialog.getContentPane().add(jLabel);
            //���������ô�С
            jDialog.setSize(344, 344);
            //�õ����ö�
            jDialog.setAlwaysOnTop(true);
            //�õ������
            jDialog.setLocationRelativeTo(null);
            //���򲻹ر����޷���������Ľ���
            jDialog.setModal(true);
            //�õ�����ʾ����
            jDialog.setVisible(true);

        } else if (e.getSource() == girlItem) {
            System.out.println("������Ů��Ƭ");
            Random r = new Random();
            //�Ʋ�������
            step = 0;
            //������Ƭ·��
            String str = "girl";
            int index = r.nextInt(13) + 1;
            System.out.println(index);
            String strIndex = str + Integer.toString(index);
            path = "image\\" + str + "\\" + strIndex + "\\";
            allPath = path + "\\all.jpg";
            //�������ͼƬ
            this.getContentPane().removeAll();
            //���´�������
            initdata();
            //���¼���ͼƬ
            initImage();


        } else if (e.getSource() == animalItem) {
            System.out.println("����������Ƭ");
            Random r = new Random();
            //�Ʋ�������
            step = 0;
            //������Ƭ·��
            String str = "animal";
            int index = r.nextInt(8) + 1;
            System.out.println(index);
            String strIndex = str + Integer.toString(index);
            path = "image\\" + str + "\\" + strIndex + "\\";
            allPath = path + "\\all.jpg";
            //�������ͼƬ
            this.getContentPane().removeAll();
            //���´�������
            initdata();
            //���¼���ͼƬ
            initImage();


        } else if (e.getSource() == sportItem) {
            System.out.println("�����˶���Ƭ");
            Random r = new Random();
            //�Ʋ�������
            step = 0;
            //������Ƭ·��
            String str = "sport";
            int index = r.nextInt(10) + 1;
            System.out.println(index);
            String strIndex = str + Integer.toString(index);
            path = "image\\" + str + "\\" + strIndex + "\\";
            allPath = path + "\\all.jpg";
            //�������ͼƬ
            this.getContentPane().removeAll();
            //���´�������
            initdata();
            //���¼���ͼƬ
            initImage();

        }
    }
}
