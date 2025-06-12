package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Atroceros extends drai.dev.data.pokemon.Pokemon {
    public Atroceros() {
        super("Atroceros",
                Type.GROUND, Type.BUG,
                new Stats(120,
                        150,
                        120,
                        50,
                        50,
                        50),
                List.of(Ability.BATTLE_ARMOR,Ability.ROCK_HEAD), Ability.GUTS,
                17, 2148,
                new Stats(1,1,0,0,0,0), 45,
                0.5,
                210, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.BUG),
                List.of("Eating lots of minerals has caused Atroceros's skin to harden almost as hard as its shell. It can withstand powerful physical attacks and retaliate twice as hard."),
                List.of(),
                List.of(  new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,3),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.DIG,16),
                        new MoveLearnSetEntry(Move.SPIKES,20),
                        new MoveLearnSetEntry(Move.MAGNITUDE,23),
                        new MoveLearnSetEntry(Move.STICKY_WEB,24),
                        new MoveLearnSetEntry(Move.MUD_BOMB,27),
                        new MoveLearnSetEntry(Move.XSCISSOR,34),
                        new MoveLearnSetEntry(Move.WHIRLWIND,38),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,46),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,48),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,53),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,57),
                        new MoveLearnSetEntry(Move.FISSURE,60)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Atroceros");

    }


}
