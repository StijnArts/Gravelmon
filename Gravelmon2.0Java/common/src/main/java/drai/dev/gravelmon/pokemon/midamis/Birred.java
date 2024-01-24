package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Birred extends drai.dev.gravelmon.pokemon.Pokemon {
    public Birred() {
        super("Birred",
                Type.FLYING,
                new Stats(45,
                        55,
                        45,
                        45,
                        55,
                        80),
                List.of(Ability.KEEN_EYE), Ability.NOCTURNAL,
                8, 165,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Birred like to collect things, it differs per Birred what they're after but every single Birred has an obsession which can be quite annoying for passing trainers, because it's impossible to tell what object they have to keep pocketed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.HAZE,6),
                        new MoveLearnSetEntry(Move.THIEF,9),
                        new MoveLearnSetEntry(Move.SWIFT,13),
                        new MoveLearnSetEntry(Move.AIR_SLASH,18),
                        new MoveLearnSetEntry(Move.GLARE,21),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,25),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,30),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,33),
                        new MoveLearnSetEntry(Move.MOONLIGHT,37),
                        new MoveLearnSetEntry(Move.DARK_PULSE,42),
                        new MoveLearnSetEntry(Move.TAILWIND,45),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,49),
                        new MoveLearnSetEntry(Move.MOONBLAST,52),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.PECK,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Birred");

    }


}
