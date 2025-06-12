package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Grimgarmr extends drai.dev.data.pokemon.Pokemon {
    public Grimgarmr(Stats stats) {
        super("Grimgarmr",
                Type.DARK, Type.ICE,
                stats,
                List.of(Ability.INTIMIDATE,Ability.DARKHOLD,Ability.UNNERVE), Ability.UNNERVE,
                16, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Due to its violent nature, Grimgarmr is often tied to a leash by its trainer. When it barks, it's a sign of dark events that are about to occur. Its bite is colder than death."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.NIBBLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,5),
                        new MoveLearnSetEntry(Move.HOWL,7),
                        new MoveLearnSetEntry(Move.PURSUIT,9),
                        new MoveLearnSetEntry(Move.TAUNT,10),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,16),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.ICY_WIND,23),
                        new MoveLearnSetEntry(Move.LICK,27),
                        new MoveLearnSetEntry(Move.ICE_FANG,32),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,37),
                        new MoveLearnSetEntry(Move.ICE_SHARD,42),
                        new MoveLearnSetEntry(Move.CRUNCH,46),
                        new MoveLearnSetEntry(Move.TORMENT,51),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,56),
                        new MoveLearnSetEntry(Move.BLIZZARD,60)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grimgarmr");

    }


}
