package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianHonchkrow extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianHonchkrow() {
        super("Honchkrow",
                Type.FLYING,Type.GRASS,
                new Stats(90,
                        125,
                        52,
                        105,
                        52,
                        81),
                List.of(Ability.QUICK_DRAW), Ability.QUICK_DRAW,
                8, 165,
                new Stats(0,2,0,0,0,0), 30,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("When it challenges other Honchkrow to a duel, the winner earns the respect of all the Murkrow, while the loser has to leave the region forever."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Honchkrow");

    }


}
