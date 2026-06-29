package tristanneman6.tgrseason6mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tristanneman6.tgrseason6mod.TGRSeason6BossMod;

public class ModItems {
    public static final  Item BOTTLE_OF_VOID = registerItem("bottle_of_void", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TGRSeason6BossMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TGRSeason6BossMod.LOGGER.info("Registering Mod Items for " + TGRSeason6BossMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BOTTLE_OF_VOID);
        });
    }
}
