package game.world;

import org.newdawn.slick.Graphics;

public class World {
        
    private Tile[][] tiles;
    
    private Tile defaultAir = new Tile(TileType.TILE_AIR);
    
    public Tile getTile(int x, int y) {
        
        if (x<0 || y<0 || x>tiles.length || y>tiles[0].length)
            return defaultAir;
        
        return tiles[x][y];
    }
    
    public World(int width, int height) {
        tiles = new Tile[width][height];
        
        for (int i=0;i<tiles.length;i++) {
            for (int j=0;j<5;j++)
                tiles[i][j] = new Tile(TileType.TILE_AIR);
            for (int j=5;j<tiles[i].length;j++)
                tiles[i][j] = new Tile(TileType.TILE_DIRT);
        }
    }
    
    public void render(Graphics g) {
        for (int i=0;i<tiles.length;i++)
            for (int j=0;j<tiles[i].length;j++)
                tiles[i][j].render(g,i*64,j*64);
    }
}
