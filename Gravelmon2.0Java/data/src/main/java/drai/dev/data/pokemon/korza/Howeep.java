package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Howeep extends drai.dev.data.pokemon.Pokemon {
    public Howeep() {
        super("Howeep",
                Type.FAIRY,Type.FLYING,
                new Stats(45,
                        30,
                        30,
                        58,
                        40,
                        72),
                List.of(Ability.CUTE_CHARM,Ability.ANTICIPATION), Ability.SHIELD_DUST,
                4, 45,
                new Stats(0,0,0,0,0,1), 235,
                0.5,
                55, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Whether in a cave entrance or an attic, Howeep will keep its livingspace very clean and tidy. It has incredible hearing, but poor eyesight, so it relies on echolocation."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,7),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,11),
                        new MoveLearnSetEntry(Move.CHARM,14),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,17),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,21),
                        new MoveLearnSetEntry(Move.WHIRLWIND,24),
                        new MoveLearnSetEntry(Move.SAFEGUARD,27),
                        new MoveLearnSetEntry(Move.AIR_SLASH,32),
                        new MoveLearnSetEntry(Move.DEFOG,37),
                        new MoveLearnSetEntry(Move.MOONBLAST,41),
                        new MoveLearnSetEntry(Move.HEAL_BELL,47),
                        new MoveLearnSetEntry(Move.ENDEAVOR,52),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Howeep");

    }


}
