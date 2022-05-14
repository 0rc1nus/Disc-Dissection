package net.orcinus.discdissection.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.orcinus.discdissection.DiscDissection;

public class DDItemTags {

    public static final TagKey<Item> CREEPER_DROP_DISC_FRAGMENTS = registerItemTag("creeper_drop_disc_fragments");

    private static TagKey<Item> registerItemTag(String name) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(DiscDissection.MODID, name));
    }

}
