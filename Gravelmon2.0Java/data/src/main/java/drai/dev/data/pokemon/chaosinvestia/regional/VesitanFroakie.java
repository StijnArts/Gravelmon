package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanFroakie extends drai.dev.data.pokemon.Pokemon {
    public VesitanFroakie(String name, Aspect aspect) {
        super(name, aspect, "VesitanFroakie",
                Type.FIRE,Type.POISON,
                new Stats(41,
                        56,
                        48,
                        71,
                        62,
                        48),
                List.of(Ability.BLAZE,Ability.PROTEAN), null,
                3, 70,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Wenn sich dieses Pokémon bedroht fühlt, sondert es ein Gift ab, was schmerzt wie tausend Grad heiße Flammen."),
                List.of(new EvolutionEntry("frogadier vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,18),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.ACID,10),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,29),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,35),
                        new MoveLearnSetEntry(Move.ROUND,21),
                        new MoveLearnSetEntry(Move.BOUNCE,39),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,43),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,48),
                        new MoveLearnSetEntry(Move.INCINERATE,14),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.SLUDGE,25),
                        new MoveLearnSetEntry(Move.BESTOW,"egg"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.MIND_READER,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 32, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Froakie");

    }


}
