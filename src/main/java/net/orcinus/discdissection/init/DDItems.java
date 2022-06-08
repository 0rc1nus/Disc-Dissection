package net.orcinus.discdissection.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DiscFragmentItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.orcinus.discdissection.DiscDissection;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = DiscDissection.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DiscDissection.MODID);

    public static final RegistryObject<Item> DISC_FRAGMENT_13 = ITEMS.register("disc_fragment_13", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_CAT = ITEMS.register("disc_fragment_cat", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_BLOCKS = ITEMS.register("disc_fragment_blocks", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_CHIRP = ITEMS.register("disc_fragment_chirp", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_FAR = ITEMS.register("disc_fragment_far", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_MALL = ITEMS.register("disc_fragment_mall", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_MELLOHI = ITEMS.register("disc_fragment_mellohi", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_STAL = ITEMS.register("disc_fragment_stal", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_STRAD = ITEMS.register("disc_fragment_strad", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_WARD = ITEMS.register("disc_fragment_ward", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_11 = ITEMS.register("disc_fragment_11", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_WAIT = ITEMS.register("disc_fragment_wait", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_OTHERSIDE = ITEMS.register("disc_fragment_otherside", gen());
    public static final RegistryObject<Item> DISC_FRAGMENT_PIGSTEP = ITEMS.register("disc_fragment_pigstep", gen());

    @NotNull
    private static Supplier<Item> gen() {
        return () -> new DiscFragmentItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    }

}
