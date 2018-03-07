package mosaic.cobalt.util;

import org.bukkit.plugin.Plugin;

public class MessageBuilder {

    private Plugin cobalt;
    private Translation t;

    public MessageBuilder(Plugin p) {
        cobalt = p;
        t = new Translation(p);
    }

    public String buildMessage(String msg) {
        return String.format("%s %s", t.getTranslation("chat.prefix"), msg);
    }

}
