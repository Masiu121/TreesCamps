package com.maksuu.treescamps;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.maksuu.TreesCampsAPI.Map;

public class TreesCamps extends ApplicationAdapter {
	SpriteBatch batch;
	Texture clear;
	Texture grass;
	Texture camp;
	Texture tree;
	Map map;
	final int textWidth = 16;

	@Override
	public void create () {
		batch = new SpriteBatch();
		map = new Map(10, 10);
		clear = new Texture("tiles/clear.png");
		grass = new Texture("tiles/grass.png");
		camp = new Texture("tiles/camp.png");
		tree = new Texture("tiles/tree.png");
	}

	public void update() {

	}

	@Override
	public void render () {
		update();
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		for(int i = 0; i < map.width; i++) {
			for(int j = 0; j < map.height; j++) {
				batch.draw(getTexture(map.getTile(i, j)), i*textWidth, j*textWidth);
			}
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		clear.dispose();
		grass.dispose();
		camp.dispose();
		tree.dispose();
	}

	private Texture getTexture(int i) {
		switch(i) {
			case 0:
				return clear;
			case 1:
				return grass;
			case 2:
				return camp;
			case 3:
				return tree;
		}
		return null;
	}
}
