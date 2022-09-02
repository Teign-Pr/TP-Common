package org.teignbridge.common.rendering.events;

import org.teignbridge.common.event.Event;
import org.teignbridge.common.rendering.RenderEngine;
import org.teignbridge.common.rendering.Renderer;

public class RenderEvent extends Event<RenderEvent> {

    public final Renderer renderer;
    public final RenderEngine renderEngine;


    public RenderEvent(Renderer renderer, RenderEngine renderEngine){
        this.renderer = renderer;
        this.renderEngine = renderEngine;
    }
}
