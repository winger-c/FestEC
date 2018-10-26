package com.example.latte.ec.icon;

import android.graphics.drawable.Icon;

/**
 * Created by W on 2018-09-17.
 */

public enum EcIcons implements com
        .joanzapata.iconify.Icon{

    icon_scon('\ue606'),
    icon_ali_pay('\ue606');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }


    @Override
    public String key() {
        return name().replace('_','-');
    }


    @Override
    public char character() {
        return character;
    }
}
