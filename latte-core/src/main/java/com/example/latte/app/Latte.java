package com.example.latte.app;

import android.content.Context;

import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.jar.Attributes;

/**
 * Created by W on 2018-09-06.
 */

public final class Latte {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static HashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }

    public static Context getApplication(){
        return (Context) getConfigurations().get(ConfigType.APPLICATION_CONTEXT.name());
    }
}
