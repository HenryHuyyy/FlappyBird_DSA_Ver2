package com.henryhuyyyyy.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.henryhuyyyyy.game.FlappyBird;
import com.henryhuyyyyy.game.sprites.Bird;

public class PlayState extends State {
    private Bird bird;

    //Define constructor
    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Bird(50,100);
        cam.setToOrtho(false, FlappyBird.WIDTH / 2, FlappyBird.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {
    }

    @Override
    public void update(float dt) {
        handleInput();
        bird.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bird.getTexture(),bird.getPosition().x,bird.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
