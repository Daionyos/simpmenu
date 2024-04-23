package com.mygdx.game;

import com.badlogic.gdx.Game;

public class MyGdxGame extends Game {
	private MenuScreen menuScreen;
	private SettingsScreen settingsScreen;
	private GameScreen gameScreen;
	private AppPreferences preferences;
	public final static int MENU = 0;
	public final static int SETTINGS = 1;
	public final static int APP = 2;

	public void changeScreen(int screen){
		switch(screen){
			case MENU:
				if(menuScreen == null) menuScreen = new MenuScreen(this);
				this.setScreen(menuScreen);
				break;
			case SETTINGS:
				if(settingsScreen == null) settingsScreen = new SettingsScreen(this);
				this.setScreen(settingsScreen);
				break;
			case APP:
				if(gameScreen == null) gameScreen = new GameScreen(this);
				this.setScreen(gameScreen);
				break;


		}
	}

	@Override
	public void create() {
		menuScreen = new MenuScreen(this);
		setScreen(menuScreen);
		preferences = new AppPreferences();
	}
	public AppPreferences getPreferences(){
		return this.preferences;
	}


}

