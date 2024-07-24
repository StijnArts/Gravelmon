package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Arisfly extends drai.dev.data.pokemon.Pokemon {
    public Arisfly() {
        super("Arisfly",
                Type.BUG, Type.FLYING,
                new Stats(70,
                        80,
                        125,
                        55,
                        75,
                        80),
                List.of(Ability.BATTLE_ARMOR), Ability.MULTISCALE,
                13, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Arisfly use their glowing white patterns to lure unsuspecting prey to them at night. Their mating calls also make use of these patterns. evolve: air cutter"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,26),
                        new MoveLearnSetEntry(Move.TAILWIND,30),
                        new MoveLearnSetEntry(Move.AIR_SLASH,33),
                        new MoveLearnSetEntry(Move.LUNGE,37),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,40),
                        new MoveLearnSetEntry(Move.ACROBATICS,44),
                        new MoveLearnSetEntry(Move.SKY_DIVE,48),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,50)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 24, 42, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
