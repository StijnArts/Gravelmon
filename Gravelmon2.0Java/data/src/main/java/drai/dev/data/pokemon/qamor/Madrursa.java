package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Madrursa extends drai.dev.data.pokemon.Pokemon {
    public Madrursa() {
        super("Madrursa",
                Type.FAIRY, Type.ICE,
                new Stats(77,
                        40,
                        50,
                        118,
                        104,
                        98),
                List.of(Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                15, 165,
                new Stats(0,0,0,2,0,0), 55,
                0.0,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FAIRY),
                List.of("Madrursa is a mysterious Pokemon that brings blizzards wherever it goes. It stays away from others in fear of endangering them in its brutal snow storms."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,8),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,24),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,28),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,32),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,38),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,42),
                        new MoveLearnSetEntry(Move.MOONBLAST,46),
                        new MoveLearnSetEntry(Move.COLDSNAP,52),
                        new MoveLearnSetEntry(Move.BLIZZARD,56),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.LIFE_DEW,"tm"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 41, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Madrursa");

    }


}
