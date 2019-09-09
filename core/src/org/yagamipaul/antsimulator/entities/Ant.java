package org.yagamipaul.antsimulator.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import java.awt.Shape;
import org.yagamipaul.antsimulator.utils.TextureManager;

/**
 *
 */
public class Ant extends BaseEntity {


    private ShapeRenderer shapeRenderer;

    /**
     * @param position
     * @param direction
     */
    public Ant(Vector2 position, Vector2 direction) {
        super(TextureManager.ANT_TEXTURE, position, direction);
        this.velocity = 4.0f;

    }

    @Override
    public void update() {

        if (Gdx.input.isKeyPressed(Keys.LEFT)) {
            this.rotation += 2;
        }

        if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
            this.rotation -= 2;
        }

        if (Gdx.input.isKeyPressed(Keys.UP)) {
            float x = this.velocity * MathUtils.cos((this.rotation + 90) * MathUtils.PI / 180);
            float y = this.velocity * MathUtils.sin((this.rotation + 90) * MathUtils.PI / 180);
            this.position.add(x, y);
        }

        if (Gdx.input.isKeyPressed(Keys.DOWN)) {
            this.position.add(0.0f, -1f);
        }

    }

}
