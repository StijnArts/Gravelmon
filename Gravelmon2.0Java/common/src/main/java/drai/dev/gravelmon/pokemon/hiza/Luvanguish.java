package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Luvanguish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Luvanguish() {
        super("Luvanguish",
                Type.GHOST,Type.WATER,
                new Stats(53,
                        80,
                        65,
                        100,
                        85,
                        117),
                List.of(Ability.HYDRATION), Ability.INFILTRATOR,
                8, 165,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                250, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its sole presense causes extreme discomfort. A myth tells that the one unlucky to fish a Luvanguish will never find happiness."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,4),
                        new MoveLearnSetEntry(Move.AGILITY,7),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,9),
                        new MoveLearnSetEntry(Move.SPITE,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.SING,20),
                        new MoveLearnSetEntry(Move.NIGHTMARE,21),
                        new MoveLearnSetEntry(Move.HEART_STAMP,22),
                        new MoveLearnSetEntry(Move.FLAIL,26),
                        new MoveLearnSetEntry(Move.GRUDGE,31),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,34),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,37),
                        new MoveLearnSetEntry(Move.AQUA_RING,40),
                        new MoveLearnSetEntry(Move.SOAK,42),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,49)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 39, 51, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Luvanguish");
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        setCanSwim(true);

    }


}
