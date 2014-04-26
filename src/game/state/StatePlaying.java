package game.state;

import game.Game;
import game.player.Player;
import game.util.resource.ImageLibrary;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class StatePlaying extends BasicGameState {
    
    public static final int VIEW_SIZE_X = Game.VIEW_SIZE_X;
    public static final int VIEW_SIZE_Y = Game.VIEW_SIZE_Y;
    public static final int WORLD_SIZE_X = VIEW_SIZE_X*20;
    public static final int WORLD_SIZE_Y = VIEW_SIZE_Y*20;
    
    private final int id;
    
    private int camX;
    private int camY;
    
    private Image background;
    
    private Player player;
    
    public StatePlaying(int id) {
        this.id = id;
        this.camX = 0;
        this.camY = 0;
    }
    
    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        background = ImageLibrary.BG.getImage();
        
        player = new Player(container.getInput());
    }
    
    @Override   
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        player.update(delta);
    }
    
    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        background.draw();
        
        updateViewPort();
        
        //g.translate(-camX,-camY);
        
        player.render(g);
    }
    
    private void updateViewPort() {
        camX = (int)(player.getX()-VIEW_SIZE_X/2);
        camY = (int)(player.getY()-VIEW_SIZE_Y/2);
    }
    
    @Override
    public int getID() {
        return id;
    }
}