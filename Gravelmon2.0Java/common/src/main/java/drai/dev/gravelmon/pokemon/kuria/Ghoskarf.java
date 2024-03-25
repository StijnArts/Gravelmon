package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Ghoskarf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ghoskarf() {
        super("Ghoskarf",
                Type.GHOST,Type.ICE,
                new Stats(51,
                        92,
                        60,
                        55,
                        83,
                        70),
                List.of(Ability.REFLECTIVE,Ability.MAGIC_BOUNCE), Ability.SLUSH_RUSH,
                8, 45,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                106, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Stalking strangers who get lost in snowstorms, Ghoskarf will follow someone for hours until they freeze solid. It will then keep the stature as a trophy."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ghoskarf");

    }


}
