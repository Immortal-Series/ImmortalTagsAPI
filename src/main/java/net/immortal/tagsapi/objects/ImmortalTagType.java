package net.immortal.tagsapi.objects;

import org.bukkit.inventory.ItemStack;

public interface ImmortalTagType {
    String getIdentifier();

    String getDisplay();

    String getDisplayUnformatted();

    int getPriority();

    boolean isCustomTag();

    ItemStack getUnlockedItem();

    ItemStack getLockedItem();

    ImmortalTagType getTag();
}