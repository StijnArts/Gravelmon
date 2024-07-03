package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Gildefish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gildefish() {
        super("Gildefish",
                Type.GROUND,
                new Stats(115,
                        65,
                        87,
                        65,
                        87,
                        44),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("They swallow pebbles and shiny objects to build dens under the seafloor. If you drop any jewelry in the water, it will likely be eaten by a Gildefish."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,4),
                        new MoveLearnSetEntry(Move.HYPNOSIS,7),
                        new MoveLearnSetEntry(Move.SAND_TOMB,10),
                        new MoveLearnSetEntry(Move.PSYWAVE,13),
                        new MoveLearnSetEntry(Move.MIND_READER,16),
                        new MoveLearnSetEntry(Move.DIG,20),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,24),
                        new MoveLearnSetEntry(Move.PERPLEX,28),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,32),
                        new MoveLearnSetEntry(Move.MUDSLIDE,36),
                        new MoveLearnSetEntry(Move.SANDSTORM,40),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,50),
                        new MoveLearnSetEntry(Move.EMBARGO,55)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 25, 47, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Gildefish");

    }


}
