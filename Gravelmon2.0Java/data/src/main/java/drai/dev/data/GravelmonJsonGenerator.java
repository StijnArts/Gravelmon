package drai.dev.data;

import drai.dev.data.games.registry.*;
import drai.dev.data.jsonwriters.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import net.fabricmc.api.*;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.*;
import net.minecraft.client.*;

public class GravelmonJsonGenerator implements ModInitializer
{
    private static int dexCounter = 1;

    public static void run()
    {
        GameRegistry.registerGames();
        PostRegistration.postRegistration();
        JSONOutputGenerator.generate(System.getProperty("user.dir").split("data")[0]+"common\\src\\main\\resources");

    }

    public static void incrementDexCounter(){
        dexCounter++;
    }

    public static void setDexCounter(int dexCounter) {
        GravelmonJsonGenerator.dexCounter = dexCounter;
    }

    public static int getDexCounter(){
        return dexCounter;
    }

    @Override
    public void onInitialize() {
        Gravelmon.init();
        run();
        ClientLifecycleEvents.CLIENT_STARTED.register(this::onClientStarted);
    }

    private void onClientStarted(Minecraft minecraft) {
        minecraft.stop();
    }
}
