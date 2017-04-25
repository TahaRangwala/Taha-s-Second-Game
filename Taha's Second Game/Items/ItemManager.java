package Items;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import Main.Handler;

public class ItemManager {

	public Handler handler;
	private ArrayList<Item>items;
	
	public ItemManager(Handler handler){
		this.handler = handler;
		items = new ArrayList<Item>();
	}
	
	public void tick(){
		Iterator<Item> it = items.iterator();
		while(it.hasNext()){
			Item i = it.next();
			i.tick();
			if(i.getCount() == Item.PICKUP)
				it.remove();
		}
	}
	
	public void render(Graphics g){
		for(Item i: items)
			i.render(g);
	}
	
	public void addItem(Item I){
		I.setHandler(handler);
		items.add(I);
	}

	//GETTERS AND SETTERS
	
	public Handler getHandler() {
		return handler;
	}
	
	public void setHandler(Handler handler){
		this.handler = handler;
	}
	
	
	
	
	
}
