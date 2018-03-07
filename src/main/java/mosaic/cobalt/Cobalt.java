package mosaic.cobalt;

import org.bukkit.plugin.java.JavaPlugin;

public class Cobalt extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Cobalt is starting...");
        saveDefaultConfig();
        
        getLogger().info("Cobalt initialized!");
    }

}
