package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Waugur extends drai.dev.data.pokemon.Pokemon {
    public Waugur() {
        super("Waugur",
                Type.POISON, Type.GHOST,
                new Stats(60,
                        102,
                        70,
                        75,
                        80,
                        50),
                List.of(Ability.LIQUID_OOZE,Ability.MUMMY,Ability.CURSED_BODY), Ability.CURSED_BODY,
                14, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They crawl and limb in the many dungeons and ruins throughout Norheim. The horns on a Waugur's head are the remains of the helmets they wore during war, fused with their skull as a reminder of horrible battles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,13),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,19),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,23),
                        new MoveLearnSetEntry(Move.FROST_BREATH,28),
                        new MoveLearnSetEntry(Move.CURSE,32),
                        new MoveLearnSetEntry(Move.POISON_JAB,36),
                        new MoveLearnSetEntry(Move.TOXIC,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,48),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,56),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .atNight()
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.TRAIL_RUINS)
    .build(), List.of());
	
           setLangFileName("Waugur");

    }


}
