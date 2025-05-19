package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Garrish extends drai.dev.data.pokemon.Pokemon {
    public Garrish() {
        super("Garrish",
                Type.GHOST,Type.POISON,
                new Stats(40,
                        120,
                        50,
                        115,
                        65,
                        105),
                List.of(Ability.ANTICIPATION), Ability.LEVITATE,
                13, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.WATER_1),
                List.of("With a presence preceded by heavy fog, Garrish effortlessly glide through the air, concealed. The spots on its fins shine brightly through the fog."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.AQUASLAP,4),
                        new MoveLearnSetEntry(Move.POISON_TAIL,8),
                        new MoveLearnSetEntry(Move.LICK,13),
                        new MoveLearnSetEntry(Move.DIVE,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,22),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,26),
                        new MoveLearnSetEntry(Move.SCALD,31),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,35),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,39),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,43),
                        new MoveLearnSetEntry(Move.TORPEDODASH,48),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,53),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,58)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Garrish");

    }


}
