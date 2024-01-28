package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Seascull extends drai.dev.gravelmon.pokemon.Pokemon {
    public Seascull() {
        super("Seascull",
                Type.POISON,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.POISON_TOUCH,Ability.CONTAMINATE,Ability.ACIDCLOUD), Ability.ACIDCLOUD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Seascull thrives in toxic waves of waste, bathing in it. So much that this Pokémon has gained special properties. Seascull's screech may even damage the health of other Pokémon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISONDART,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Seascull");

    }


}