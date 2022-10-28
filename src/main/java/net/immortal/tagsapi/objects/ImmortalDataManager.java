package net.immortal.tagsapi.objects;

import org.bukkit.entity.Player;

public interface ImmortalDataManager {
    ImmortalDataPlayer getPlayerData(Player paramPlayer);

    boolean hasPlayerData(Player paramPlayer);

    void addPlayerData(Player paramPlayer, ImmortalDataPlayer paramImmortalDataPlayer);

    boolean hasSpecificTag(Player paramPlayer, ImmortalTagType paramImmortalTagType);

    void removePlayerTag(Player paramPlayer);

    void addCustomTag(Player paramPlayer, ImmortalCustomTag paramImmortalCustomTag);

    void removePlayerData(Player paramPlayer);
}
