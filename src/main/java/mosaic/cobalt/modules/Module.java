package mosaic.cobalt.modules;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;

public class Module {

    private String moduleName;
    private Plugin p;

    public Module(String name, Plugin p) {
        moduleName = name;
        this.p = p;
    }

    public void enable() {
        p.getLogger().info(String.format("Module %s initialized!", moduleName));
    }

    private void registerCommand(CommandExecutor command) {
        ;
    }

}
