package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Grimapa extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grimapa() {
        super("Grimapa",
                Type.DARK,Type.GRASS,
                new Stats(140,
                        130,
                        100,
                        50,
                        90,
                        90),
                List.of(Ability.POISON_HEAL), Ability.MOXIE,
                8, 165,
                new Stats(2,1,0,0,1,0), 45,
                0.0,
                306, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The defiler of the marshes and the Destroyer of the Hall of Heroes. Once Grimapa has contaminated the entire Old Growth of a foreign land, it will prey on Deiteress's weakened soul."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,6),
                        new MoveLearnSetEntry(Move.PAYBACK,16),
                        new MoveLearnSetEntry(Move.GLARE,26),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,46),
                        new MoveLearnSetEntry(Move.HORN_LEECH,56),
                        new MoveLearnSetEntry(Move.CRUNCH,66),
                        new MoveLearnSetEntry(Move.TOXIC,76),
                        new MoveLearnSetEntry(Move.BELCH,86)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimapa");

    }


}
