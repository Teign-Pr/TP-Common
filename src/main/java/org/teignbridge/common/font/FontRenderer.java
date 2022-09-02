package org.teignbridge.common.font;

import org.teignbridge.common.rendering.elements.Color;
import org.teignbridge.common.rendering.elements.Vector2;

import java.util.ArrayList;
import java.util.Arrays;

public final class FontRenderer {
    public ArrayList<Font> fonts = new ArrayList<>();


    public static Font titleFont;
    public static Font normalFont;
    public static Font buttonFont;



    public FontRenderer(Font... f1){
        fonts.addAll(Arrays.asList(f1));
    }


    public void addFont(Font f){
        fonts.add(f);
    }


    public void renderFont(String text, Vector2 vector, Color c){
        fonts.get(0).drawText(text, vector.x, vector.y, c);
    }

    public void renderFont(String text, Vector2 vector){
        fonts.get(0).drawText(text, vector.x, vector.y);
    }

    public void renderFont(String text, Vector2 vector, Color c, int index){
        fonts.get(index).drawText(text, vector.x, vector.y, c);
    }

    public void renderFont(String text, Vector2 vector, int index){
        fonts.get(index).drawText(text, vector.x, vector.y);
    }

}
