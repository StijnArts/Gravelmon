package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Gobbledyduck extends drai.dev.data.pokemon.Pokemon {
    public Gobbledyduck() {
        super("Gobbledyduck",
                Type.FAIRY, Type.FLYING,
                new Stats(107,
                        96,
                        82,
                        65,
                        68,
                        82),
                List.of(Ability.OBLIVIOUS,Ability.KLUTZ,Ability.CONTRARY), Ability.CONTRARY,
                17, 165,
                new Stats(1,0,0,0,1,0), 75,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("Gobbledyduck flying in the air is a bizarre sight to see, its long neck whips around in the air as it flies backwards in any which direction."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.WING_ATTACK,7),
                        new MoveLearnSetEntry(Move.CONFUSION,10),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.DISABLE,19),
                        new MoveLearnSetEntry(Move.SCREECH,22),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,25),
                        new MoveLearnSetEntry(Move.ACROBATICS,28),
                        new MoveLearnSetEntry(Move.ROOST,31),
                        new MoveLearnSetEntry(Move.PSYCH_UP,36),
                        new MoveLearnSetEntry(Move.AMNESIA,41),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,46),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,51)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gobbledyduck");

    }


}
