package drai.dev.data;

import drai.dev.data.games.*;
import drai.dev.data.pokemon.*;
import net.fabricmc.api.*;

public class GravelmonJsonGenerator implements ModInitializer {
    public static void run()
    {
        GameRegistry.registerGames();
        PostRegistration.postRegistration();
        JSONOutputGenerator.generate(System.getProperty("user.dir").split("data")[0]+"common\\src\\main\\resources");
    }

    @Override
    public void onInitialize() {
    }
}
