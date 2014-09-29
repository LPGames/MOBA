package uk.co.lukeparker.moba;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import uk.co.lukeparker.moba.states.LoginState;

public class MOBA extends StateBasedGame{

	public MOBA(String name) {
		super(name);
		
		addState(new LoginState(Settings.LOGIN));
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		getState(Settings.LOGIN).init(gc, this);
		
		enterState(Settings.LOGIN);
	}

	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new MOBA(Settings.TITLE));
		
		app.setDisplayMode(Settings.WIDTH, Settings.HEIGHT, Settings.FULLSCREEN);
		app.setShowFPS(Settings.DEBUG);
		app.setTargetFrameRate(Settings.FPS);
		app.setVSync(Settings.VSYNC);
		
		app.start();
	}
	
}
