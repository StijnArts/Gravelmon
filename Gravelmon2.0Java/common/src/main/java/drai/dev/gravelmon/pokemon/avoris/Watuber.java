package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Watuber extends drai.dev.gravelmon.pokemon.Pokemon {
    public Watuber() {
        super("Watuber",
                Type.WATER,
                new Stats(57,
                        60,
                        43,
                        52,
                        50,
                        48),
                List.of(Ability.TORRENT), Ability.CUTE_CHARM,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Watuber are very playful and often like to amuse themselves in pools and near shores. Because they're not very good swimmers, they often borrow tubes and floaters."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,5),
                        new MoveLearnSetEntry(Move.AQUASLAP,7),
                        new MoveLearnSetEntry(Move.WATER_SPORT,11),
                        new MoveLearnSetEntry(Move.COVET,13),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,17),
                        new MoveLearnSetEntry(Move.YAWN,19),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,23),
                        new MoveLearnSetEntry(Move.WATER_PULSE,25),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,29),
                        new MoveLearnSetEntry(Move.BODY_SLAM,31),
                        new MoveLearnSetEntry(Move.FACADE,35),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,37),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46)                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Watuber");

    }


}
