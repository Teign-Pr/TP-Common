package org.teignbridge.common.rendering.elements;

import org.teignbridge.common.font.Font;
import org.teignbridge.common.rendering.Profile;

public final class Vector2 {
    public float x, y;

    public Vector2(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    public Vector2(final double x, final double y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    public Vector2(final float x, final float y) {
        this.x = x;
        this.y = y;
    }

    public void addToVect(final float x, final float y){
        this.x += x;
        this.y += y;
    }

    public void subToVect(final float x, final float y){
        this.x -= x;
        this.y -= y;
    }

    @Override
    public String toString(){
        return "[X: " + this.x + ", Y: " + this.y + "]";
    }

    public static Vector2 centerFontX(Font f, float y, String text){
        return centerScreenX(y, f.getWidth(text));
    }

    public static Vector2 centerFontY(Font f, float x, String text){
        return centerScreenY(x, f.getHeight(text));
    }

    public static Vector2 centerScreenY(float x, float height){
        return new Vector2(x, Profile.Display.HEIGHT / 2f - height / 2f);
    }

    public static Vector2 centerScreenX(float y, float length){
        return new Vector2(Profile.Display.WIDTH / 2f - length / 2f, y);
    }
}
