package drai.dev.data;

import dev.architectury.platform.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
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
//        Gravelmon.init(false);


    }
}
