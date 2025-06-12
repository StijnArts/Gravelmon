package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanInkay extends drai.dev.data.pokemon.Pokemon {
    public VesitanInkay(String name, Aspect aspect) {
        super(name, aspect, "VesitanInkay",
                Type.DARK,Type.FAIRY,
                new Stats(45,
                        53,
                        56,
                        55,
                        60,
                        47),
                List.of(Ability.CONTRARY,Ability.SUCTION_CUPS), null,
                4, 35,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Mit den blinkenden Punkten auf seinem Körper raubt es Gegnern den Kampfeswillen. Es nutzt diese Gelegenheit, um sich zu verstecken."),
                List.of(new EvolutionEntry("malamar vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,46),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SUPERPOWER,48),
                        new MoveLearnSetEntry(Move.REFLECT,4),
                        new MoveLearnSetEntry(Move.SLASH,43),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,21),
                        new MoveLearnSetEntry(Move.PLUCK,35),
                        new MoveLearnSetEntry(Move.PAYBACK,27),
                        new MoveLearnSetEntry(Move.HYPNOSIS,18),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,8),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,13),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,15),
                        new MoveLearnSetEntry(Move.SWAGGER,12),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,37),
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,23),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,31),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"egg"),
                        new MoveLearnSetEntry(Move.FLATTER,"egg"),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,"egg"),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Inkay");

    }


}
