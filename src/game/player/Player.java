package game.player;

import game.state.StatePlaying;
import game.util.resource.ImageLibrary;
import game.world.World;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

public class Player {
    
    private Input input;
    private Image sprite;
    
    private World world;
    
    private int x;
    private int y;
    
    public int getX() { return x; }
    public int getY() { return y; }
    
    public Player(Input input) {
        this.input = input;
        sprite = ImageLibrary.PLAYER.getImage();
        x = 0;
        y = 0;
        world = StatePlaying.world;
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
        }
        if (input.isKeyDown(Input.KEY_S)) {
            dy++;
        }
        if (input.isKeyDown(Input.KEY_A)) {
            dx--;
        }
        if (input.isKeyDown(Input.KEY_D)) {
            dx++;
        }
        
        System.out.println(x + " " + y);
        
        if (world.getTile(x/64,(y+dy)/64+1).getType().isSolid() && dy>0)
            dy = 0;//-= (y-64)%64;
        
        x+=dx*delta;//10.0;
        y+=dy*delta;//10.0;
    }
}