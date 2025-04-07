package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Felectroar extends drai.dev.data.pokemon.Pokemon {
    public Felectroar() {
        super("Felectroar",
                Type.FIRE, Type.ELECTRIC,
                new Stats(70,
                        104,
                        60,
                        70,
                        90,
                        112),
                List.of(Ability.INTIMIDATE,Ability.RIVALRY), Ability.MOXIE,
                15, 410,
                new Stats(0,2,0,1,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Feliroar battle eachtother to show their power over the pack. In addition to their fire tail their teeth gained the ability to charge up electricity, wich they can let go when they bite."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,5),
                        new MoveLearnSetEntry(Move.SWIFT,10),
                        new MoveLearnSetEntry(Move.FLAME_BURST,14),
                        new MoveLearnSetEntry(Move.CRUNCH,23),
                        new MoveLearnSetEntry(Move.ROAR,28),
                        new MoveLearnSetEntry(Move.BURN_UP,31),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,35),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,40),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,43),
                        new MoveLearnSetEntry(Move.THUNDER,49),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,55),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,60),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Felectroar");

    }


}
