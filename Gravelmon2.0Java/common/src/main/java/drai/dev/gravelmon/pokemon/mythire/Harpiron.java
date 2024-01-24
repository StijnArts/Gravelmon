package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Harpiron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Harpiron() {
        super("Harpiron",
                Type.STEEL,Type.FLYING,
                new Stats(65,
                        70,
                        105,
                        90,
                        70,
                        100),
                List.of(Ability.SERENE_GRACE,Ability.UNBURDEN,Ability.STALWART), Ability.STALWART,
                8, 165,
                new Stats(0,0,1,0,0,1), 45,
                0.25,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.HUMAN_LIKE),
                List.of("Harpiron are very fussy and stubborn Pokémon that aren't willing to back down from what they've learned. In ancient times, they were used to guard sacred places."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENERGYLOOP,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Harpiron");

    }


}
