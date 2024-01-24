package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lumbrig extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lumbrig() {
        super("Lumbrig",
                Type.GROUND,
                new Stats(75,
                        90,
                        60,
                        80,
                        95,
                        75),
                List.of(Ability.SAND_RUSH), Ability.SAND_RUSH,
                8, 165,
                new Stats(0,0,0,0,2,0), 0,
                0.5,
                166, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- Scratch Normal - Sand Attack Ground - Mud Sport Ground - Wrap Normal 5 Mud Sport Ground 8 Wrap Normal 12 Mud-SlapSTAB Ground 15 Knock Off Dark 19 DigSTAB Ground 22 Embargo Dark 26 Slam Normal 29 Rock Slide Rock 33 Slash Normal 36 EarthquakeSTAB Ground 42 Acupressure Normal 49 Sandstorm Rock 55 Coil Poison 62 FissureSTAB Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.WRAP,8),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,15),
                        new MoveLearnSetEntry(Move.DIG,19),
                        new MoveLearnSetEntry(Move.EMBARGO,22),
                        new MoveLearnSetEntry(Move.SLAM,26),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,29),
                        new MoveLearnSetEntry(Move.SLASH,33),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,36),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,42),
                        new MoveLearnSetEntry(Move.SANDSTORM,49),
                        new MoveLearnSetEntry(Move.COIL,55),
                        new MoveLearnSetEntry(Move.FISSURE,62)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lumbrig");

    }


}
