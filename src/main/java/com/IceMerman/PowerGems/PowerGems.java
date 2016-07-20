package com.IceMerman.PowerGems;

import com.IceMerman.PowerGems.handler.ConfigHandler;
import com.IceMerman.PowerGems.init.ModItems;
import com.IceMerman.PowerGems.proxy.Iproxy;
import com.IceMerman.PowerGems.references.Reference;
import com.IceMerman.PowerGems.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION,guiFactory = Reference.GUI_FACTORY_CLASS)
public class PowerGems {

    @Mod.Instance(Reference.MOD_ID)
    public static PowerGems instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static Iproxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event){

        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        ModItems.init();
        LogHelper.info("Pre initialization complete");

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        LogHelper.info("Initialization complete");

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event){
        LogHelper.info("Post initialization complete");

    }

}
