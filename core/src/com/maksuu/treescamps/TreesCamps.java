package com.maksuu.treescamps;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class TreesCamps extends ApplicationAdapter {
	SpriteBatch batch;
	Texture clear;
	Texture grass;
	Texture camp;
	Texture tree;

	@Override
	public void create () {
		batch = new SpriteBatch();
		clear = new Texture("tiles/clear.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(clear, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		clear.dispose();
	}
}
