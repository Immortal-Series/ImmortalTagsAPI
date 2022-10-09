package net.immortal.events;

import net.immortal.objects.ImmortalDataPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class TagEquipEvent extends TagEvent {
    private static final HandlerList HANDLERS = new HandlerList();

    public TagEquipEvent(Player paramPlayer, ImmortalDataPlayer paramImmortalDataPlayer, boolean paramBoolean) {
        super(paramPlayer, paramImmortalDataPlayer, paramBoolean);
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}