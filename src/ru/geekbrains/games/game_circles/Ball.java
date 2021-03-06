package ru.geekbrains.games.game_circles;

import java.awt.*;

class Ball extends Sprite {

    private float vx = 150 + (float)(Math.random() * 200f);
    private float vy = 150 + (float)(Math.random() * 200f);
    private final Color color = new Color((int)(Math.random() * 255f), (int)(Math.random() * 255f), (int)(Math.random() * 255f));

    Ball(){
        halfHeight = 20 + (float)(Math.random() * 50f);
        //noinspection SuspiciousNameCombination
        halfWidth = halfHeight;
    }

    @Override
    void update(GameCanvas gameCanvas, float deltaTime) {
        x += vx * deltaTime;
        y += vy * deltaTime;
        if(getLeft() < gameCanvas.getLeft()){
            setLeft(gameCanvas.getLeft());
            vx = -vx;
        }
        if(getRight() > gameCanvas.getRight()){
            setRight(gameCanvas.getRight());
            vx = -vx;
        }
        if(getTop() < gameCanvas.getTop()){
            setTop(gameCanvas.getTop());
            vy = -vy;
        }
        if(getBottom() > gameCanvas.getBottom()){
            setBottom(gameCanvas.getBottom());
            vy = -vy;
        }
    }

    @Override
    void render(GameCanvas gameCanvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int)getLeft(), (int)getTop(), (int)getWidth(), (int)getHeight());
//        g.fillRect((int)getLeft(), (int)getTop(), (int)getWidth(), (int)getHeight());
    }
}
