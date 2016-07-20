package com.IceMerman.PowerGems.handler;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration cfg;

    private static final String CATEGORY_USELESS = "useless stuff";

        public static int EXAMPLE_VALUE;
        private static final String EXAMPLE_NAME = "example";
        private static final int EXAMPLE_DEFAULT = 5;

        public static String SOME_TEXT_VALUE;
        private static final String SOME_TEXT_NAME = "Some text";
        private static final String SOME_TEXT_DEFAULT = "Default text";

    public static void init(File file){

        cfg = new Configuration(file);

        //TODO: create a class that set the default values for the config

        EXAMPLE_VALUE = EXAMPLE_DEFAULT;
        SOME_TEXT_VALUE = SOME_TEXT_DEFAULT;
        //Set before the parameters in case of faults while loading the file

        try{
            cfg.load();

            EXAMPLE_VALUE = cfg.get(CATEGORY_USELESS, EXAMPLE_NAME, EXAMPLE_DEFAULT, "Comment about the value").getInt(EXAMPLE_DEFAULT);
            SOME_TEXT_VALUE = cfg.get(CATEGORY_USELESS, SOME_TEXT_NAME, SOME_TEXT_DEFAULT).getString();

        }catch (Exception e){

        }finally {
            if(cfg.hasChanged()) {
                cfg.save();
            }
        }
        System.out.println("[Power Gems] Configuration successfully saved");
    }

}

