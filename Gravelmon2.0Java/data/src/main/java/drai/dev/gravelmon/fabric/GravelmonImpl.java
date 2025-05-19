package drai.dev.gravelmon.fabric;

import dev.architectury.platform.*;
import drai.dev.data.*;
import net.fabricmc.api.*;

import static drai.dev.data.GravelmonJsonGenerator.run;

public class GravelmonImpl {

    public static void platformInit() {
        run();
        if(Platform.getEnv()!= EnvType.SERVER){
            GravelmonShutDownManager.shutDown();
        }
    }
}
