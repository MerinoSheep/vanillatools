package com.github.merinosheep.flintandblaze.item;
import com.github.merinosheep.flintandblaze.Main;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Main.MOD_ID)
@EventBusSubscriber(bus=Bus.MOD)
public class FlintAndBlazeItems {
    public static final Item FLINT_AND_BLAZE = null;

    @SubscribeEvent
    public static void registerItems(Register<Item> event){
        event.getRegistry().registerAll(new FlintAndBlazeItem().setRegistryName("flintandblaze:flint_and_blaze"));
    }
}
