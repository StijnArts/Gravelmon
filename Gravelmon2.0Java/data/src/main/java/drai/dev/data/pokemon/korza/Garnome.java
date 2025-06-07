package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Garnome extends drai.dev.data.pokemon.Pokemon {
    public Garnome() {
        super("Garnome",
                Type.NORMAL,Type.ROCK,
                new Stats(75,
                        59,
                        92,
                        51,
                        73,
                        50),
                List.of(Ability.SAP_SIPPER), Ability.FLOWER_VEIL,
                6, 60,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                80, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MINERAL),
                List.of("Garnome like to live around wildflowers and suburban lawns. They will tend to and care for any plants they come across, and especially love living in gardens."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,4),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,10),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,14),
                        new MoveLearnSetEntry(Move.ROTOTILLER,20),
                        new MoveLearnSetEntry(Move.WATER_SPORT,23),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,28),
                        new MoveLearnSetEntry(Move.BULLDOZE,30),
                        new MoveLearnSetEntry(Move.HEADBUTT,33),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,37),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,37),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,49),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,53),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,58),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Garnome");

    }


}
