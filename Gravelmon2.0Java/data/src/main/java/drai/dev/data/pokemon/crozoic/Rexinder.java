package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rexinder extends drai.dev.data.pokemon.Pokemon {
    public Rexinder() {
        super("Rexinder",
                Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FLAME_BODY,Ability.VITAL_SPIRIT), Ability.FIERYSPIRIT,
                11, 200,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("tarboraze", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.RAGING_FURY,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.BATTLEROAR,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS, Biome.IS_VOLCANIC, Biome.IS_LUSH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rexinder");

    }


}
