package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Micronaut extends drai.dev.data.pokemon.Pokemon {
    public Micronaut() {
        super("Micronaut",
                Type.WATER,
                new Stats(70,
                        50,
                        60,
                        45,
                        65,
                        20),
                List.of(Ability.TORRENT), Ability.HYDRATION,
                0, 0,
                new Stats(1,0,0,0,0,0), 0,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("- Tackle Normal - Leer Normal - BubbleSTAB Water 7 Bide Normal 12 Confusion Psychic 15 Water PulseSTAB Water 17 Body Slam Normal 21 Curse Ghost 25 Rain Dance Water 25 Double-Edge Normal 28 Zen Headbutt Psychic 32 Recover Normal 36 Hydro PumpSTAB Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.BIDE,7),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,15),
                        new MoveLearnSetEntry(Move.BODY_SLAM,17),
                        new MoveLearnSetEntry(Move.CURSE,21),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,25),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,25),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,28),
                        new MoveLearnSetEntry(Move.RECOVER,32),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,36)                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Micronaut");

    }


}
