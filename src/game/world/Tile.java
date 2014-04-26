package game.world;

import org.newdawn.slick.Graphics;

public class Tile {
    
    private TileType type;
    
    public TileType getType() { return type; }
    
    public Tile(TileType type) {
        this.type = type;
    }
    
    public void render(Graphics g, int x, int y) {
        type.draw(x,y);
    }
}
