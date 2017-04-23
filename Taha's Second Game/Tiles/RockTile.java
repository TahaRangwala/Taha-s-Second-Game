package Tiles;

import gfx.Assets;

public class RockTile extends Tile{

	public RockTile(int ID) {
		super(Assets.stone, ID);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
	
}
