package net.orcinus.discdissection;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.orcinus.discdissection.events.MiscEvents;
import net.orcinus.discdissection.init.DDItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DiscDissection.MODID)
public class DiscDissection {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "discdissection";

    public DiscDissection() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        DDItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new MiscEvents());
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

}
