package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Galextrial extends drai.dev.gravelmon.pokemon.Pokemon {
    public Galextrial() {
        super("Galextrial",
                Type.STEEL,Type.NORMAL,
                new Stats(70,
                        113,
                        83,
                        60,
                        90,
                        114),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,2,0,0,0,1), 0,
                0.5,
                239, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Meteor MashSTAB Steel"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METEOR_MASH,1)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Galextrial");

    }


}
