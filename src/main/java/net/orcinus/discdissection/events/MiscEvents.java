package net.orcinus.discdissection.events;

import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.data.loot.EntityLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemConditionalFunction;
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.orcinus.discdissection.DiscDissection;
import net.orcinus.discdissection.init.DDItemTags;
import net.orcinus.discdissection.init.DDItems;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = DiscDissection.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiscEvents {

    @SubscribeEvent
    public void onLootTableLoad(LootTableLoadEvent event) {
        LootTable table = event.getTable();
        ResourceLocation name = event.getName();
        if (name.equals(BuiltInLootTables.BASTION_OTHER)) {
            removeDisc(table, "pigstep");
            table.addPool(LootPool.lootPool().add(addDiscFragment(DDItems.DISC_FRAGMENT_PIGSTEP, 5)).build());
        }
        if (name.equals(BuiltInLootTables.SIMPLE_DUNGEON)) {
            event.setTable(LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0F, 3.0F)).add(LootItem.lootTableItem(Items.SADDLE).setWeight(20)).add(LootItem.lootTableItem(Items.GOLDEN_APPLE).setWeight(15)).add(LootItem.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE).setWeight(2)).setRolls(UniformGenerator.between(3, 6)).add(LootItem.lootTableItem(DDItems.DISC_FRAGMENT_OTHERSIDE.get()).setWeight(2)).setRolls(UniformGenerator.between(3, 6)).add(LootItem.lootTableItem(DDItems.DISC_FRAGMENT_13.get()).setWeight(15)).setRolls(UniformGenerator.between(3, 6)).add(LootItem.lootTableItem(DDItems.DISC_FRAGMENT_CAT.get()).setWeight(15)).add(LootItem.lootTableItem(Items.NAME_TAG).setWeight(20)).add(LootItem.lootTableItem(Items.GOLDEN_HORSE_ARMOR).setWeight(10)).add(LootItem.lootTableItem(Items.IRON_HORSE_ARMOR).setWeight(15)).add(LootItem.lootTableItem(Items.DIAMOND_HORSE_ARMOR).setWeight(5)).add(LootItem.lootTableItem(Items.BOOK).setWeight(10).apply(EnchantRandomlyFunction.randomApplicableEnchantment()))).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0F, 4.0F)).add(LootItem.lootTableItem(Items.IRON_INGOT).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.GOLD_INGOT).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.BREAD).setWeight(20)).add(LootItem.lootTableItem(Items.WHEAT).setWeight(20).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.BUCKET).setWeight(10)).add(LootItem.lootTableItem(Items.REDSTONE).setWeight(15).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.COAL).setWeight(15).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.MELON_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))).add(LootItem.lootTableItem(Items.PUMPKIN_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))).add(LootItem.lootTableItem(Items.BEETROOT_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))))).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(3.0F)).add(LootItem.lootTableItem(Items.BONE).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F)))).add(LootItem.lootTableItem(Items.GUNPOWDER).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F)))).add(LootItem.lootTableItem(Items.ROTTEN_FLESH).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F)))).add(LootItem.lootTableItem(Items.STRING).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F))))).build());
        }
        if (name.equals(BuiltInLootTables.STRONGHOLD_CORRIDOR)) {
            removeDisc(table, "otherside");
            table.addPool(LootPool.lootPool()
                            .add(addDiscFragment(DDItems.DISC_FRAGMENT_OTHERSIDE))
                    .build());
        }
        if (name.equals(BuiltInLootTables.WOODLAND_MANSION)) {
            event.setTable(LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0F, 3.0F)).add(LootItem.lootTableItem(Items.LEAD).setWeight(20)).add(LootItem.lootTableItem(Items.GOLDEN_APPLE).setWeight(15)).add(LootItem.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE).setWeight(2)).setRolls(UniformGenerator.between(4, 8)).add(LootItem.lootTableItem(DDItems.DISC_FRAGMENT_13.get()).setWeight(15)).setRolls(UniformGenerator.between(4, 8)).add(LootItem.lootTableItem(DDItems.DISC_FRAGMENT_CAT.get()).setWeight(15)).add(LootItem.lootTableItem(Items.NAME_TAG).setWeight(20)).add(LootItem.lootTableItem(Items.CHAINMAIL_CHESTPLATE).setWeight(10)).add(LootItem.lootTableItem(Items.DIAMOND_HOE).setWeight(15)).add(LootItem.lootTableItem(Items.DIAMOND_CHESTPLATE).setWeight(5)).add(LootItem.lootTableItem(Items.BOOK).setWeight(10).apply(EnchantRandomlyFunction.randomApplicableEnchantment()))).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0F, 4.0F)).add(LootItem.lootTableItem(Items.IRON_INGOT).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.GOLD_INGOT).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.BREAD).setWeight(20)).add(LootItem.lootTableItem(Items.WHEAT).setWeight(20).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.BUCKET).setWeight(10)).add(LootItem.lootTableItem(Items.REDSTONE).setWeight(15).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.COAL).setWeight(15).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))).add(LootItem.lootTableItem(Items.MELON_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))).add(LootItem.lootTableItem(Items.PUMPKIN_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))).add(LootItem.lootTableItem(Items.BEETROOT_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))))).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(3.0F)).add(LootItem.lootTableItem(Items.BONE).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F)))).add(LootItem.lootTableItem(Items.GUNPOWDER).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F)))).add(LootItem.lootTableItem(Items.ROTTEN_FLESH).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F)))).add(LootItem.lootTableItem(Items.STRING).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F))))).build());
        }
        if (name.equals(new ResourceLocation("entities/creeper"))) {
            event.setTable(LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(Items.GUNPOWDER).apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 2.0F))).apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F))))).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2, 5)).add(TagEntry.expandTag(DDItemTags.CREEPER_DROP_DISC_FRAGMENTS)).when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.KILLER, EntityPredicate.Builder.entity().of(EntityTypeTags.SKELETONS)))).build());
        }
    }

    private void removeDisc(LootTable table, String name) {
        table.removePool("minecraft:music_disc_" + name);
    }

    @NotNull
    private LootPoolSingletonContainer.Builder<?> addDiscFragment(RegistryObject<Item> discFragment) {
        return LootItem.lootTableItem(discFragment.get()).apply(getCount());
    }

    @NotNull
    private LootPoolSingletonContainer.Builder<?> addDiscFragment(RegistryObject<Item> discFragment, int weight) {
        return LootItem.lootTableItem(discFragment.get()).setWeight(weight).apply(getCount());
    }

    @NotNull
    private LootItemConditionalFunction.Builder<?> getCount() {
        return SetItemCountFunction.setCount(UniformGenerator.between(3.0F, 6.0F));
    }

}
