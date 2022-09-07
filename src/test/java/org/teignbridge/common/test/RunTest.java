package org.teignbridge.common.test;

import org.teignbridge.common.event.EventBus;
import org.teignbridge.common.event.IEvent;
import org.teignbridge.common.font.Font;
import org.teignbridge.common.font.FontRenderer;
import org.teignbridge.common.rendering.*;
import org.teignbridge.common.rendering.elements.Color;
import org.teignbridge.common.rendering.elements.Vector2;
import org.teignbridge.common.rendering.events.KeyEvent;
import org.teignbridge.common.rendering.events.MouseClickEvent;
import org.teignbridge.common.rendering.events.RenderEvent;
import org.teignbridge.common.test.views.HomeView;
import org.teignbridge.common.test.views.ViewManager;

public class RunTest extends Engine {

    public static ViewManager viewManager;

    public static void main(String[] args){
        eventBus = new EventBus();

        display = new Display("TEST");
        display.init(true);

        renderer = new Renderer(display);
        renderer.init();

        java.awt.Font jFont = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 30);

        fontRenderer = new FontRenderer(new Font(jFont, true));

        viewManager = new ViewManager();
        viewManager.addView(new HomeView());
        viewManager.setView("home");

        IEvent<RenderEvent> renderEvent = e -> {
            RenderEngine.drawQuad(new Vector2(0, 0), Profile.Display.WIDTH, Profile.Display.HEIGHT, new Color(233, 233, 233));
            viewManager.getCurrentView().renderView();
        };

        IEvent<KeyEvent> keyEvent = e -> viewManager.getCurrentView().keyEvent(e);

        IEvent<MouseClickEvent> mouseEvent = e -> viewManager.getCurrentView().mouseEvent(e);

        RenderEvent.addEvent(renderEvent, RenderEvent.class);
        KeyEvent.addEvent(keyEvent, KeyEvent.class);
        MouseClickEvent.addEvent(mouseEvent, MouseClickEvent.class);



        renderEngine = new RenderEngine();
        renderEngine.render(renderer, display);
    }
}
