package net.immortal.tagsapi.events;

import net.immortal.tagsapi.objects.ImmortalDataPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

public abstract class TagEvent extends Event implements Cancellable {
    private boolean cancelled;

    private boolean customTag;

    protected final Player player;

    protected ImmortalDataPlayer tag;

    public void setCancelled(boolean paramBoolean) {
        this.cancelled = paramBoolean;
    }

    public void setCustomTag(boolean paramBoolean) {
        this.customTag = paramBoolean;
    }

    public void setTag(ImmortalDataPlayer paramImmortalDataPlayer) {
        this.tag = paramImmortalDataPlayer;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean isCustomTag() {
        return this.customTag;
    }

    public Player getPlayer() {
        return this.player;
    }

    public ImmortalDataPlayer getTag() {
        return this.tag;
    }

    public TagEvent(Player paramPlayer, ImmortalDataPlayer paramImmortalDataPlayer, boolean paramBoolean) {
        super(!Bukkit.isPrimaryThread());
        this.player = paramPlayer;
        this.tag = paramImmortalDataPlayer;
        this.customTag = paramBoolean;
    }
}
