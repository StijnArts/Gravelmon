package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorroanBeartic extends drai.dev.data.pokemon.Pokemon {
    public NodorroanBeartic(String name, Aspect aspect) {
        super(name, aspect, "NodorroanBeartic",
                Type.FIRE,
                new Stats(90,
                        100,
                        100,
                        80,
                        85,
                        50),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Scratch Normal - EmberSTAB Fire - Roar Normal - Growl Normal - Charm Fairy 12 Bite Dark 15 Burning SneezeSTAB Fire 19 Fire FangSTAB Fire 22 Crunch Dark 23 Detect Fighting 26 Roar Normal 31 Slash Normal 35 Work Up Normal 38 Hyper Fang Normal 43 IncinerateSTAB Fire 47 Superpower Fighting 50 Firewall Fire 60 Flare BlitzSTAB Fire"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.BURNINGSNEEZE,15),
                        new MoveLearnSetEntry(Move.FIRE_FANG,19),
                        new MoveLearnSetEntry(Move.CRUNCH,22),
                        new MoveLearnSetEntry(Move.DETECT,23),
                        new MoveLearnSetEntry(Move.ROAR,26),
                        new MoveLearnSetEntry(Move.SLASH,31),
                        new MoveLearnSetEntry(Move.WORK_UP,35),
                        new MoveLearnSetEntry(Move.HYPER_FANG,38),
                        new MoveLearnSetEntry(Move.INCINERATE,43),
                        new MoveLearnSetEntry(Move.SUPERPOWER,47),
                        new MoveLearnSetEntry(Move.FIREWALL,50),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,60)),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Beartic");

    }


}
