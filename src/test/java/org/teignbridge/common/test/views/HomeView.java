package org.teignbridge.common.test.views;

import org.teignbridge.common.rendering.Engine;
import org.teignbridge.common.rendering.elements.Color;
import org.teignbridge.common.rendering.elements.Vector2;
import org.teignbridge.common.rendering.events.KeyEvent;
import org.teignbridge.common.rendering.events.MouseClickEvent;

public class HomeView extends View {

    @Override
    public void renderView() {
        Engine.getFontRenderer().renderFont("TEST", Vector2.centerFontX(Engine.getFontRenderer().fonts.get(0), 0, "Test"), Color.BLACK);
    }

    @Override
    public void keyEvent(KeyEvent event) {

    }

    @Override
    public void mouseEvent(MouseClickEvent event) {

    }
}
