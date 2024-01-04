package phase.phase_dimension.phasedimension;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;

import static net.minecraft.registry.Registries.ITEM_GROUP;

public class PhaseDimension implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModBlocks.initialize();

        ItemGroupEvents
                // Register a "modify" event for the Ingredients item group.
                .modifyEntriesEvent(ItemGroups.INGREDIENTS)
                // Add the item to the group when you get access to it.
                .register((itemGroup) -> itemGroup.add(ModItems.POOP));

        ItemGroupEvents
                // Register a "modify" event for the Building Blocks item group.
                .modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                // Add the item to the group when you get access to it.
                .register((itemGroup) -> itemGroup.add(ModBlocks.CONDENSED_DIRT));
    }
}
