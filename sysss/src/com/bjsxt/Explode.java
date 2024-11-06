package com.bjsxt;

import java.awt.*;

//爆炸类
public class Explode {
    double x,y;
    static Image[] imgs = new Image[16];
    static {
        for (int i=0;i<16;i++){
            imgs[i] = GameUtil.getImage("images/explode/e"+(i+1)+".gif");
            //懒加载
            imgs[i].getWidth(null);
        }
    }
    int count;
    boolean live = true;
    public void draw(Graphics g){
        if (!live){
            return;
        }
        if (count<16){
            g.drawImage(imgs[count],(int)x,(int)y,null);
            count++;
        }else {
            live = false;
        }
    }

    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
