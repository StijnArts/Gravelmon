package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Baufire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Baufire() {
        super("Baufire",
                Type.FIRE,
                new Stats(65,
                        60,
                        80,
                        65,
                        70,
                        60),
                List.of(Ability.BLAZE), Ability.FLAME_BODY,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("This Pokemon is said to be the origin of the beliefs of demons, because of their blood red fur and its two horns. However in battle this Pokemon is as strong as a bulldozer and can take down the toughest of foes."),
                List.of(new EvolutionEntry("chloradise", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,17),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,20),
                        new MoveLearnSetEntry(Move.ENDURE,27),
                        new MoveLearnSetEntry(Move.INCINERATE,31),
                        new MoveLearnSetEntry(Move.BULLDOZE,38),
                        new MoveLearnSetEntry(Move.FIRE_FANG,42),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,49),
                        new MoveLearnSetEntry(Move.EARTH_POWER,53),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,60),
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_NETHER_BASALT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Baufire");

    }


}
