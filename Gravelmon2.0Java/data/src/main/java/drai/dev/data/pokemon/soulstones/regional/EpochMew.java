package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochMew extends drai.dev.data.pokemon.Pokemon {
    public EpochMew(String name, Aspect aspect) {
        super(name, aspect, "EpochMew",
                Type.DRAGON,Type.NORMAL,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.TECHNICIAN,Ability.DAZZLING), Ability.MULTISCALE,
                4, 40,
                new Stats(3,0,0,0,0,0), 45,
                -1.0,
                300, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It is the first dragon Pokemon that ever existed and all Dragon Pokemon have descended from this creature. It was rumoured to be long since extinct."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPER_BEAM,64),
                        new MoveLearnSetEntry(Move.CALM_MIND,31),
                        new MoveLearnSetEntry(Move.ANCIENTGLARE,27),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,39),
                        new MoveLearnSetEntry(Move.DRAGONGALE,54),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,35),
                        new MoveLearnSetEntry(Move.GENESIS,59),
                        new MoveLearnSetEntry(Move.METRONOME,47),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,51),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,4),
                        new MoveLearnSetEntry(Move.CLONESURGE,1),
                        new MoveLearnSetEntry(Move.PULSE,19),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,23),
                        new MoveLearnSetEntry(Move.PRIMALWAVE,43),
                        new MoveLearnSetEntry(Move.ENDERSHOCK,11),
                        new MoveLearnSetEntry(Move.BATON_PASS,15),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm")),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mew");

    }


}
