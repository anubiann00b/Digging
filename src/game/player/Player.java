package game.player;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player {
    
    private Input input;
    
    private double x;
    private double y;
    
    public double getX() { return x; }
    public double getY() { return y; }
    
    public Player(Input input) {
        this.input = input;
    }
    
    public void update(int delta) {
        resolveMove(delta);
        
        // input.isKeyPressed(Input.KEY_SPACE)
    }
    
    public void render(Graphics g) {
        
    }

    private void resolveMove(int delta) {
        
    }
}