package net.immortal.objects;

public interface ImmortalCustomTag extends ImmortalTagType {
    boolean isSimilar(ImmortalCustomTag paramImmortalCustomTag);

    String getDescription();
}
