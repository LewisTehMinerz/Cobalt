package mosaic.cobalt;

import mosaic.cobalt.util.Localization;
import org.bukkit.plugin.java.JavaPlugin;

public class Cobalt extends JavaPlugin {

    private Localization t;
    public static Cobalt INSTANCE;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        saveResource("lang.yml", false);
        INSTANCE = this;
        t = new Localization(this);
        getLogger().info(t.getTranslation("plugin.starting"));
        getLogger().info(t.getTranslation("plugin.finished"));
    }

}
