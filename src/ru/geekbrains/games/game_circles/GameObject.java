package ru.geekbrains.games.game_circles;

import java.awt.*;

/**
 * Created by mikhail.shchegolev on 06.03.2017.
 */
public interface GameObject {

    void update(GameCanvas gameCanvas, float deltaTime){}

    void render(GameCanvas gameCanvas, Graphics g){}
}
