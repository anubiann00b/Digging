package game.player;

import game.util.resource.ImageLibrary;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

public class Player {
    
    private Input input;
    private Image sprite;
    
    private int x;
    private int y;
    
    public int getX() { return x; }
    public int getY() { return y; }
    
    public Player(Input input) {
        this.input = input;
        sprite = ImageLibrary.PLAYER.getImage();
        x = 0;
        y = 0;
    }
    
    public void update(int delta) {
        resolveMove(delta);
    }
    
    public void render(Graphics g) {
        sprite.draw(x,y);
    }

    private void resolveMove(int delta) {
        
        int dx = 0;
        int dy = 0;
        
        if (input.isKeyDown(Input.KEY_W)) {
            dy--;
        } else if (input.isKeyDown(Input.KEY_S)) {
            dy++;
        } else if (input.isKeyDown(Input.KEY_A)) {
            dx--;
        } else if (input.isKeyDown(Input.KEY_D)) {
            dx++;
        }
        
        x+=dx*delta;//10.0;
        y+=dy*delta;//10.0;
    }
}