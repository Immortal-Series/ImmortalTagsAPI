package net.immortal.tagsapi;

import net.immortal.tagsapi.objects.ImmortalDataManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public interface ImmortalTagsAPI {
    ImmortalDataManager getDataManager();

    static ImmortalTagsAPI getInstance() {
        Plugin plugin = Bukkit.getPluginManager().getPlugin("ImmortalTags");
        if (plugin == null || !plugin.isEnabled())
            throw new IllegalStateException("ImmortalTags was not found on this server, or is not enabled!");
        return (ImmortalTagsAPI) plugin;
    }
}
