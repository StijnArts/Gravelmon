package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Harihary extends drai.dev.gravelmon.pokemon.Pokemon {
    public Harihary() {
        super("Harihary",
                Type.NORMAL,
                new Stats(60,
                        60,
                        75,
                        20,
                        75,
                        50),
                List.of(Ability.DRY_SKIN), Ability.RATTLED,
                8, 165,
                new Stats(0,0,1,0,0,0), 180,
                0.75,
                100, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("An extremely elusive Pokémon that supposedly only lives deep in the darkest woods. Anybody who claims to have seen one also claims it disappeared in a puff of scraggly hairs upon capture."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WRAP,5),
                        new MoveLearnSetEntry(Move.HOWL,8),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,16),
                        new MoveLearnSetEntry(Move.COVET,20),
                        new MoveLearnSetEntry(Move.CHARM,26),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,30),
                        new MoveLearnSetEntry(Move.SANDSTORM,32),
                        new MoveLearnSetEntry(Move.SLAM,36)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Harihary");

    }


}
