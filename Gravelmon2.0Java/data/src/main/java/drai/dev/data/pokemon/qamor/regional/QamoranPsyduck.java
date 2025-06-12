package drai.dev.data.pokemon.qamor.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class QamoranPsyduck extends drai.dev.data.pokemon.Pokemon {
    public QamoranPsyduck(String name, Aspect aspect) {
        super(name, aspect, "Psyduck",
                Type.FAIRY,
                new Stats(60,
                        65,
                        48,
                        47,
                        50,
                        50),
                List.of(Ability.OBLIVIOUS,Ability.KLUTZ,Ability.CONTRARY), Ability.CONTRARY,
                8, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("Psyduck is hopelessly dimwitted and rely on the pity of others to survive as well as their impeccable dumb luck."),
                List.of(new EvolutionEntry("gobbledyduck", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:shiny_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
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
                        new MoveLearnSetEntry(Move.PSYCH_UP,34),
                        new MoveLearnSetEntry(Move.AMNESIA,37),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,43)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Psyduck");
        setCanSwim(true);
    }


}
