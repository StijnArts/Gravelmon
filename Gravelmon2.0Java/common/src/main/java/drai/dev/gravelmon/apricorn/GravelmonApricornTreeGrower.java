package drai.dev.gravelmon.apricorn;

import drai.dev.gravelmon.*;
import net.minecraft.resources.*;
import net.minecraft.util.*;
import net.minecraft.world.level.block.grower.*;
import net.minecraft.world.level.levelgen.feature.*;
import org.jetbrains.annotations.*;

import java.util.*;

public class GravelmonApricornTreeGrower extends TreeGrower {
    private final GravelmonApricorns apricorn;

    public GravelmonApricornTreeGrower(GravelmonApricorns apricorn){
        super(apricorn.name().toLowerCase(Locale.ROOT), Optional.empty(),
                Optional.of(apricorn.getConfiguredFeature()),
                Optional.empty());
        this.apricorn = apricorn;
    }
}
