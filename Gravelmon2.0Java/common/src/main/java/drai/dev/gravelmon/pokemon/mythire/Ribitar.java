package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ribitar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ribitar() {
        super("Ribitar",
                Type.ROCK,Type.POISON,
                new Stats(70,
                        80,
                        52,
                        70,
                        65,
                        25),
                List.of(Ability.GOOEY), Ability.FLARE_BOOST,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("It was revived from a fossil found in a tar pit. Strangely, this Pokemon's face is inside its mouth! This peculiarity has made it a true scientific curiosity as to how it survived like this."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.OILFIRE,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ribitar");

    }


}
