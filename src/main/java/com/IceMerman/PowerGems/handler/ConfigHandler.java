package com.IceMerman.PowerGems.handler;

import com.IceMerman.PowerGems.references.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration cfg;

    public static final String CATEGORY_USELESS = "useless stuff";

        public static int EXAMPLE_VALUE;
        private static final String EXAMPLE_NAME = "example";
        private static final int EXAMPLE_DEFAULT = 5;

        public static String SOME_TEXT_VALUE;
        private static final String SOME_TEXT_NAME = "Some text";
        private static final String SOME_TEXT_DEFAULT = "Default text";

    public static void init(File file){

        if(cfg == null){
            cfg = new Configuration(file);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadConfiguration();
        }
    }

    private static void loadConfiguration(){
        //Set before the parameters in case of faults while loading the file
        EXAMPLE_VALUE = cfg.get(CATEGORY_USELESS,EXAMPLE_NAME,EXAMPLE_DEFAULT).getInt();
        SOME_TEXT_VALUE = cfg.get(CATEGORY_USELESS,SOME_TEXT_NAME,SOME_TEXT_DEFAULT).getString();

        if(cfg.hasChanged()){
            cfg.save();
        }


    }

}

