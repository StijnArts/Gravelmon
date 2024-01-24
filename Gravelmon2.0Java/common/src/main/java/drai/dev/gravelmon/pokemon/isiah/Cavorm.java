package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cavorm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cavorm() {
        super("Cavorm",
                Type.GROUND,
                new Stats(50,
                        50,
                        40,
                        50,
                        60,
                        40),
                List.of(Ability.SAND_RUSH), Ability.SAND_RUSH,
                8, 165,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- Tackle Normal - Sand Attack Ground 5 Mud Sport Ground 8 Wrap Normal 12 Mud Sport Ground 15 Knock Off Dark 19 DigSTAB Ground 22 Embargo Dark 26 Slam Normal 29 Rock Slide Rock 33 EarthquakeSTAB Ground 36 Acupressure Normal 40 Sandstorm Rock 43 Coil Poison 47 FissureSTAB Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.WRAP,8),
                        new MoveLearnSetEntry(Move.MUD_SPORT,12),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,15),
                        new MoveLearnSetEntry(Move.DIG,19),
                        new MoveLearnSetEntry(Move.EMBARGO,22),
                        new MoveLearnSetEntry(Move.SLAM,26),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,29),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,33),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,36),
                        new MoveLearnSetEntry(Move.SANDSTORM,40),
                        new MoveLearnSetEntry(Move.COIL,43),
                        new MoveLearnSetEntry(Move.FISSURE,47)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cavorm");

    }


}
