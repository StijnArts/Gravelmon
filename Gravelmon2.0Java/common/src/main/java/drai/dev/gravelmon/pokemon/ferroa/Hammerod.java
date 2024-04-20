package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hammerod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hammerod() {
        super("Hammerod",
                Type.STEEL, Type.DARK,
                new Stats(60,
                        70,
                        100,
                        60,
                        100,
                        110),
                List.of(Ability.HUSTLE,Ability.SHEER_FORCE,Ability.UNBURDEN), Ability.UNBURDEN,
                8, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It delights in showing off on busy roads, causing havoc. The side pods can separate from the main body and move on their own to scope out the surrounding territory."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASSURANCE,1),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hammerod");

    }


}
