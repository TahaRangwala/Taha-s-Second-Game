package UI;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import Main.Handler;

public class UIManager {

	private Handler handler;
	private ArrayList<UIObject> objects;
	
	public UIManager(Handler handler){
		this.handler = handler;
		objects = new ArrayList<UIObject>();
	}
	
	public void tick(){
		for(UIObject O: objects)
			O.tick();
	}
	
	public void render(Graphics g){
		for(UIObject O: objects)
			O.render(g);
	}
	
	public void onMouseMove(MouseEvent e){
		for(UIObject O: objects)
			O.onMouseMove(e);
	}
	
	public void onMouseRelease(MouseEvent e){
		for(UIObject O: objects)
			O.onMouseRelease(e);
	}
	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public ArrayList<UIObject> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<UIObject> objects) {
		this.objects = objects;
	}

	public void addObject(UIObject O){
		objects.add(O);
	}
	
	public void removeObject(UIObject O){
		objects.remove(O);
	}
	
}
