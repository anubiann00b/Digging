package game.world;

import game.util.resource.ImageLibrary;
import org.newdawn.slick.Image;

public enum TileType {
    
    TILE_AIR(null),
    TILE_DIRT(ImageLibrary.T_DIRT);
    
    private Image sprite;
    
    TileType(ImageLibrary image) {
        if (image != null)
            sprite = image.getImage();
    }

    public void draw(int x, int y) {
        if (sprite == null)
            return;
        sprite.draw(x,y);
    }
}
