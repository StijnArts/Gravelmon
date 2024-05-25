package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Diverguare extends drai.dev.gravelmon.pokemon.Pokemon {
    public Diverguare() {
        super("Diverguare",
                Type.GROUND, Type.GRASS,
                new Stats(95,
                        85,
                        80,
                        70,
                        95,
                        44),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 165,
                new Stats(0,0,0,0,0,0), 65,
                0.5,
                210, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It slowly crawls in one direction for days on end; whenever it changes direction, it grows a new spine. Old ones are covered in sharp spikes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.ABSORB,3),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,10),
                        new MoveLearnSetEntry(Move.TWINEEDLE,13),
                        new MoveLearnSetEntry(Move.MAGNITUDE,16),
                        new MoveLearnSetEntry(Move.SPIKES,20),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,24),
                        new MoveLearnSetEntry(Move.SYNTHESIS,27),
                        new MoveLearnSetEntry(Move.AMNESIA,31),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,36),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.LEECH_SEED,46),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Diverguare");

    }


}
