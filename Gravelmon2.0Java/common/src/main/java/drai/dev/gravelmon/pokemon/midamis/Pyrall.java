package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pyrall extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pyrall() {
        super("Pyrall",
                Type.FIRE,
                new Stats(45,
                        50,
                        50,
                        45,
                        50,
                        40),
                List.of(Ability.BLAZE), Ability.FLAME_BODY,
                4, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Basically a burning ball of fluff, Pyrall are fearsome battlers that always put 110% into their battles. They rarely befriend people, but if they do that person is a friend for life; Pyrall will fight for them no matter what."),
                List.of(new EvolutionEntry("baufire", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.MUD_SPORT,17),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,23),
                        new MoveLearnSetEntry(Move.ENDURE,26),
                        new MoveLearnSetEntry(Move.BULLDOZE,32),
                        new MoveLearnSetEntry(Move.FIRE_FANG,35),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,41),
                        new MoveLearnSetEntry(Move.EARTH_POWER,44),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,50),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tm"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT, Biome.IS_NETHER_BASALT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyrall");

    }


}
