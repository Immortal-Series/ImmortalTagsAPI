package net.immortal.tagsapi.events;

import net.immortal.tagsapi.objects.ImmortalDataPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class TagRemoveEvent extends TagEvent {
    private static final HandlerList HANDLERS = new HandlerList();

    private final RemoveCause cause;

    public RemoveCause getCause() {
        return this.cause;
    }

    public TagRemoveEvent(Player paramPlayer, ImmortalDataPlayer paramImmortalDataPlayer, RemoveCause paramRemoveCause, boolean paramBoolean) {
        super(paramPlayer, paramImmortalDataPlayer, paramBoolean);
        this.cause = paramRemoveCause;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public enum RemoveCause {
        ADMIN, PLAYER;
    }
}