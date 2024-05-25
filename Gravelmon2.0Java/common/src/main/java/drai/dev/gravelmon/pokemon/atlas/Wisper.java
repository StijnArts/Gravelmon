package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Wisper extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wisper() {
        super("Wisper",
                Type.GHOST, Type.FIRE,
                new Stats(40,
                        20,
                        30,
                        88,
                        50,
                        92),
                List.of(Ability.ILLUMINATE,Ability.CURSED_BODY,Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                2, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                66, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Wisper enjoy luring travellers to their deaths by creating a path of flickering lights, leading them into swamps and off the edges of cliffs."),
                List.of(new EvolutionEntry("wispette", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1)   ,
                        new MoveLearnSetEntry(Move.ASTONISH,1)   ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 28, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wisper");

    }


}
