package client;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

public class HeaderHandlerResolver implements javax.xml.ws.handler.HandlerResolver {

    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<>();
        HeaderHandler hh = new HeaderHandler();
        handlerChain.add(hh);
        return handlerChain;
    }
}
