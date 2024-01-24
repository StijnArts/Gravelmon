package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Afunn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Afunn() {
        super("Afunn",
                Type.FIRE,Type.ROCK,
                new Stats(65,
                        85,
                        90,
                        65,
                        75,
                        10),
                List.of(Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                8, 165,
                new Stats(0,1,1,0,0,0), 50,
                0.0,
                78, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Harden Normal - Tackle Normal 6 Rock BlastSTAB Rock 12 Tar Shot Rock 18 IncinerateSTAB Fire 24 Amnesia Psychic 30 Heat CrashSTAB Fire 36 Sandstorm Rock 42 Take Down Normal 48 Ancient PowerSTAB Rock 54 Trick Room Psychic 60 Zen Headbutt Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,6),
                        new MoveLearnSetEntry(Move.TAR_SHOT,12),
                        new MoveLearnSetEntry(Move.INCINERATE,18),
                        new MoveLearnSetEntry(Move.AMNESIA,24),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,30),
                        new MoveLearnSetEntry(Move.SANDSTORM,36),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,42),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,48),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,54),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,60)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Afunn");

    }


}
