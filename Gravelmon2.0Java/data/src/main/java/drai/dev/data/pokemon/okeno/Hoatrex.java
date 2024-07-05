package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hoatrex extends drai.dev.data.pokemon.Pokemon {
    public Hoatrex() {
        super("Hoatrex",
                Type.FIRE, Type.DRAGON,
                new Stats(100,
                        80,
                        85,
                        125,
                        90,
                        100),
                List.of(Ability.PETRIFY), Ability.SOLAR_POWER,
                28, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKY_ATTACK,1),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,6),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,13),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,22),
                        new MoveLearnSetEntry(Move.TWISTER,29),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,37),
                        new MoveLearnSetEntry(Move.PUNISHMENT,45),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,53),
                        new MoveLearnSetEntry(Move.OVERRULE,62),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,70),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,79),
                        new MoveLearnSetEntry(Move.SOLARFLARE,87),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,94)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 65, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
