/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

import java.awt.image.BufferedImage;

/**
 *
 * @author HOME
 */
public class Assets {
    public static BufferedImage background;
    public static BufferedImage player;
    
    public static void init(){
        background = ImageLoader.loadImage("/tutorial1/images/Background.png");
        player = ImageLoader.loadImage("/tutorial1/images/Sprite.png");
    }
    
    
    
}
