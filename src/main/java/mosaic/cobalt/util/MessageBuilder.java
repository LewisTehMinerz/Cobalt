package mosaic.cobalt.util;

import org.bukkit.plugin.Plugin;

public class MessageBuilder {

    private Plugin cobalt;

    public MessageBuilder(Plugin p) {
        cobalt = p;
    }

    public String buildMessage(String msg) {
        return String.format("%s %s", cobalt.getConfig().getString("prefix"), msg);
    }

}
