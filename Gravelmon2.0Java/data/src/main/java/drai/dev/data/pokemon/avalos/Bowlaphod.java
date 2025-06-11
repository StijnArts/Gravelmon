package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bowlaphod extends drai.dev.data.pokemon.Pokemon {
    public Bowlaphod() {
        super("Bowlaphod",
                Type.GROUND, Type.BUG,
                new Stats(80,
                        75,
                        100,
                        70,
                        75,
                        80),
                List.of(Ability.HEATPROOF,Ability.SAND_RUSH), Ability.EARTH_EATER,
                10, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of("Bowlaphods are used to the high temperature in Fliga, and have adapted to make sure they don't roast in the intense heat. They roll wet balls of mud and dung and bury the ball for their young."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
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
                        new MoveLearnSetEntry(Move.FISSURE,60)                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bowlaphod");

    }


}
