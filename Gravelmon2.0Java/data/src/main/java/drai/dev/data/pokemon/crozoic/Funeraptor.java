package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Funeraptor extends drai.dev.data.pokemon.Pokemon {
    public Funeraptor(Stats stats) {
        super("Funeraptor",
                Type.GHOST, Type.FIRE,
                stats,
                List.of(Ability.MAGIC_GUARD), Ability.FLAME_BODY,
                15, 803,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FLYING),
                List.of("Once considered a bad omen by parents, it is actually a fierce protector of eggs and children. Should it find an egg that's failed to hatch, it will brood it in its fire, causing it to hatch into an Ovimourn."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOKE,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.LAST_RESPECTS,1),
                        new MoveLearnSetEntry(Move.EGG_BOMB,1),
                        new MoveLearnSetEntry(Move.SHADOWDANCE,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.WISH,1),
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,1),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,1),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.GRUDGE,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY, Biome.IS_LUSH)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Funeraptor");

    }


}
