package net.immortal.tagsapi.objects;

import java.util.List;

public interface ImmortalDataPlayer {
    String getDisplay();

    ImmortalTagType getTag();

    List<ImmortalCustomTag> getCustomTags();
}
