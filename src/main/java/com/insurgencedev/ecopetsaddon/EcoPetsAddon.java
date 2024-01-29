package com.insurgencedev.ecopetsaddon;

import com.insurgencedev.ecopetsaddon.listeners.EcoPetsEventListener;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;
import org.insurgencedev.insurgenceboosters.libs.fo.Common;

@IBoostersAddon(name = "EcoPetsAddon", version = "1.0.2", author = "InsurgenceDev", description = "EcoPets Support")
public class EcoPetsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadAblesStart() {
        if (Common.doesPluginExist("EcoPets")) {
            registerEvent(new EcoPetsEventListener());
        }
    }
}
