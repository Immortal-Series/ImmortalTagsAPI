package net.immortal.objects;

import java.util.List;

public interface ImmortalDataPlayer {
    String getDisplay();

    ImmortalTagType getTag();

    List<ImmortalCustomTag> getCustomTags();
}
