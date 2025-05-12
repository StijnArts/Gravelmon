package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianPanchamOne extends drai.dev.data.pokemon.Pokemon {
    public AyreianPanchamOne(String name, Aspect aspect) {
        super(name, aspect, "AyreianPanchamOne",
                Type.FIRE,
                new Stats(67,
                        82,
                        62,
                        43,
                        46,
                        48),
                List.of(Ability.IRON_FIST,Ability.BLAZE), null,
                6, 80,
                new Stats(0,1,0,0,0,0), 128,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("It does its level best to glare and pull a scary face, but it can't help grinning if anyone pats its head."),
                List.of(new EvolutionEntry("ayreianpangoro", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,28),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SLASH,24),
                        new MoveLearnSetEntry(Move.CRUNCH,33),
                        new MoveLearnSetEntry(Move.TAUNT,8),
                        new MoveLearnSetEntry(Move.PURSUIT,16),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,44),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,12),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,40),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.BODY_SLAM,36),
                        new MoveLearnSetEntry(Move.WORK_UP,20),
                        new MoveLearnSetEntry(Move.QUASH,"egg"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"egg"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.STORM_THROW,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"egg"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"egg")),
                List.of(Label.VANGUARD),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pancham");

    }


}
