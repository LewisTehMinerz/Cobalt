package mosaic.cobalt.util;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.nio.file.Paths;

public class Localization {

    private FileConfiguration languageFile;
    private Plugin p;

    public Localization(Plugin p, String langFile) {
        File lang = Paths.get(p.getDataFolder().getAbsolutePath(), langFile).toFile();
        languageFile = YamlConfiguration.loadConfiguration(lang);
        this.p = p;
    }

    public Localization(Plugin p) {
        this(p, "lang.yml");
    }

    private String safeGetTranslation(String translation) {
        if (languageFile.getString(translation) != null) {
            p.getLogger().warning(String.format("Missing translation for %s", translation));
            return languageFile.getString(translation);
        } else {
            return translation;
        }
    }

    public String getTranslation(String translation) {
        return ChatColor.translateAlternateColorCodes('&', safeGetTranslation(translation));
    }

}
