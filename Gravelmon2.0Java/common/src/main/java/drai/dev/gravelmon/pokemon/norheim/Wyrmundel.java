package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wyrmundel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wyrmundel() {
        super("Wyrmundel",
                Type.WATER,Type.DRAGON,
                new Stats(165,
                        100,
                        85,
                        140,
                        100,
                        90),
                List.of(Ability.MEGA_LAUNCHER), Ability.DRIZZLE,
                76, 165,
                new Stats(0,1,0,2,0,0), 45,
                0.0,
                306, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The Connector of Worlds and the Serpent of the Ore Sea. After an epic clash with Hamarrcal, Wyrmundel nearly swallowed an entire region and its surrounding waters; a time when heroes were at stake."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,4),
                        new MoveLearnSetEntry(Move.DIVE,8),
                        new MoveLearnSetEntry(Move.THRASH,22),
                        new MoveLearnSetEntry(Move.AQUA_RING,26),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,34),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,40),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,44),
                        new MoveLearnSetEntry(Move.GLARE,50),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,56),
                        new MoveLearnSetEntry(Move.OUTRAGE,62),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,70),
                        new MoveLearnSetEntry(Move.ORIGIN_PULSE,78)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
