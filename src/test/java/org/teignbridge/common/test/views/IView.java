package org.teignbridge.common.test.views;

import org.teignbridge.common.rendering.events.KeyEvent;
import org.teignbridge.common.rendering.events.MouseClickEvent;

public interface IView {

    void renderView();

    void keyEvent(KeyEvent event);

    void mouseEvent(MouseClickEvent event);
}
