package drai.dev.gravelmon.items.apricorn;

import net.minecraft.world.level.block.grower.*;

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
