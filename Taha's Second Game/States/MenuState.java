package States;

import java.awt.Graphics;

import Main.Handler;
import gfx.Assets;
import UI.ClickListener;
import UI.UIImageButton;
import UI.UIManager;

public class MenuState extends State {

	private UIManager uiManager;

	public MenuState(final Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUiManager(uiManager);

		uiManager.addObject(new UIImageButton(260, 210, 128, 64, Assets.btn_start, new ClickListener() {
			@Override
			public void onClick() {
				handler.getMouseManager().setUiManager(null);
				State.setState(handler.getGame().gameState);
			}
		}));
	}

	@Override
	public void tick() {
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}

}