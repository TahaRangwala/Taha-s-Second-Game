package States;

import java.awt.Graphics;

import Entities.Creatures.Player;
import Entities.Statics.Tree;
import Main.Game;
import Main.Handler;
import Worlds.World;

public class GameState extends State{

	private World world;
	
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.lvl");
		handler.setWorld(world);
		
	}
	
	public void tick() {
		world.tick();
	}

	public void render(Graphics g) {
		world.render(g);
	}
	
}
