package com.example.w.festec.example;

import android.app.Application;

import com.example.latte.app.Latte;
import com.example.latte.ec.icon.FontEcModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by W on 2018-09-12.
 */

public class ExampleApp extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApHost("http://127.0.0.1")
                .configure();
    }
}
