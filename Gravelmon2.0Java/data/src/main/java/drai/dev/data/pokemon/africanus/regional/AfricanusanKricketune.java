package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanKricketune extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanKricketune(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanKricketune",
                Type.BUG,Type.FIGHTING,
                new Stats(87,
                        90,
                        65,
                        70,
                        60,
                        105),
                List.of(Ability.SWARM), null,
                10, 255,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Tras siglos de convivencia con los galos, Kricketune es capaz de luchar cómo un galo más."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.KARATE_CHOP,18),
                        new MoveLearnSetEntry(Move.ARM_THRUST,34),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,42),
                        new MoveLearnSetEntry(Move.BUG_BITE,32),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,1),
                        new MoveLearnSetEntry(Move.FORCE_PALM,20),
                        new MoveLearnSetEntry(Move.BOT,25),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,10),
                        new MoveLearnSetEntry(Move.SLASH,26),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,46),
                        new MoveLearnSetEntry(Move.XSCISSOR,30),
                        new MoveLearnSetEntry(Move.REVERSAL,22),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,50),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,14),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,33),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,38)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kricketune");

    }


}
