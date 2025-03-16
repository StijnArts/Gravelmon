package drai.dev.data;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.*;
import net.minecraft.client.*;

public class GravelmonShutDownManager {
    public static void shutDown() {

        ClientLifecycleEvents.CLIENT_STARTED.register(GravelmonShutDownManager::onClientStarted);
    }


    private static void onClientStarted(Minecraft minecraft) {
        minecraft.stop();
    }
}
