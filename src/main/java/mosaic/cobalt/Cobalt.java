package mosaic.cobalt;

import mosaic.cobalt.util.Translation;
import org.bukkit.plugin.java.JavaPlugin;

public class Cobalt extends JavaPlugin {

    public Translation t;
    public static Cobalt INSTANCE;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        saveResource("lang.yml", false);
        INSTANCE = this;
        t = new Translation(this);
        getLogger().info(t.getTranslation("plugin.starting"));
        getLogger().info(t.getTranslation("plugin.finished"));
    }

}
