package com.insurgencedev.ecopetsaddon;

import com.insurgencedev.ecopetsaddon.listeners.EcoPetsEventListener;
import org.bukkit.Bukkit;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;

@IBoostersAddon(name = "EcoPetsAddon", version = "1.0.1", author = "InsurgenceDev", description = "EcoPets Support")
public class EcoPetsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Bukkit.getPluginManager().isPluginEnabled("EcoPets")) {
            registerEvent(new EcoPetsEventListener());
        }
    }
}
