package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tsuchinu extends drai.dev.data.pokemon.Pokemon {
    public Tsuchinu() {
        super("Tsuchinu",
                Type.GROUND,
                new Stats(100,
                        125,
                        125,
                        70,
                        72,
                        88),
                List.of(Ability.JUSTIFIED), Ability.JUSTIFIED,
                8, 165,
                new Stats(0,2,1,0,0,0), 3,
                0.0,
                261, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- Rock Tomb Rock - Howl Normal 5 Noble Roar Normal 10 Team Up Normal 15 DigSTAB Ground 20 Helping Hand Normal 25 Drill RunSTAB Ground 30 Roar Normal 35 Slash Normal 40 Rock Slide Rock 45 Rock Climb Normal 50 Dragon Claw Dragon 55 LandslideSTAB Ground 60 EarthquakeSTAB Ground 65 Dragon Dance Dragon 70 FissureSTAB Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,5),
                        new MoveLearnSetEntry(Move.TEAMUP,10),
                        new MoveLearnSetEntry(Move.DIG,15),
                        new MoveLearnSetEntry(Move.HELPING_HAND,20),
                        new MoveLearnSetEntry(Move.DRILL_RUN,25),
                        new MoveLearnSetEntry(Move.ROAR,30),
                        new MoveLearnSetEntry(Move.SLASH,35),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,40),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,45),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.LANDSLIDE,55),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,60),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,65),
                        new MoveLearnSetEntry(Move.FISSURE,70)                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tsuchinu");

    }


}
