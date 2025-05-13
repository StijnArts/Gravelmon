package drai.dev.gravelmon.creativetab;

import dev.architectury.injectables.annotations.*;
import net.minecraft.world.item.*;

public class GravelmonTabs {
    @ExpectPlatform
    public static CreativeModeTab createGravelmonMegaTab() {
        throw new AssertionError("Platform-specific implementation required.");
    }
}
