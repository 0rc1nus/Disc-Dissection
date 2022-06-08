package net.orcinus.discdissection.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DiscFragmentItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.orcinus.discdissection.DiscDissection;

@Mod.EventBusSubscriber(modid = DiscDissection.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DiscDissection.MODID);

    public static final RegistryObject<Item> DISC_FRAGMENT_13 = ITEMS.register("disc_fragment_13", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_CAT = ITEMS.register("disc_fragment_cat", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_BLOCKS = ITEMS.register("disc_fragment_blocks", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_CHIRP = ITEMS.register("disc_fragment_chirp", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_FAR = ITEMS.register("disc_fragment_far", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_MALL = ITEMS.register("disc_fragment_mall", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_MELLOHI = ITEMS.register("disc_fragment_mellohi", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_STAL = ITEMS.register("disc_fragment_stal", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_STRAD = ITEMS.register("disc_fragment_strad", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_WARD = ITEMS.register("disc_fragment_ward", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_11 = ITEMS.register("disc_fragment_11", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_WAIT = ITEMS.register("disc_fragment_wait", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_OTHERSIDE = ITEMS.register("disc_fragment_otherside", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DISC_FRAGMENT_PIGSTEP = ITEMS.register("disc_fragment_pigstep", () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

}
