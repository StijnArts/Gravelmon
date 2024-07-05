package drai.dev.gravelmon.apricorn;

import net.minecraft.world.level.block.*;

public class GravelmonApricornSaplingBlock extends SaplingBlock {
    public GravelmonApricornSaplingBlock(Properties properties, GravelmonApricorns apricorn) {
        super(new GravelmonApricornTreeGrower(apricorn), properties);
    }
}
