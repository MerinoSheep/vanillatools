package com.github.merinosheep.flintandblaze;

import com.github.merinosheep.flintandblaze.proxy.IProxy;
import com.github.merinosheep.flintandblaze.proxy.ServerProxy;
import com.github.merinosheep.flintandblaze.proxy.ClientProxy;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.DistExecutor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(Main.MOD_ID)

public class Main {
    public static final String MOD_ID = "flintandblaze";
    public static final Logger LOGGER = LogManager.getLogger(Main.MOD_ID);
    
    public static final IProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public Main() {



        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
        LOGGER.debug("flintandblaze loading...");
       
    }
    private void commonSetup(final FMLCommonSetupEvent event){

    }
    private void clientSetup(final FMLClientSetupEvent event){
        
    }
    private void serverSetup(final FMLDedicatedServerSetupEvent event){
        
    }
}
