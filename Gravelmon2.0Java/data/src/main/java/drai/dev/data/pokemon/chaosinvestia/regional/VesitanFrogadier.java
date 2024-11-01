package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanFrogadier extends drai.dev.data.pokemon.Pokemon {
    public VesitanFrogadier(String name, Aspect aspect) {
        super(name, aspect, "VesitanFrogadier",
                Type.FIRE,Type.POISON,
                new Stats(54,
                        63,
                        59,
                        97,
                        83,
                        61),
                List.of(Ability.BLAZE,Ability.PROTEAN), null,
                6, 109,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Es ist unglaublich agil und schnell. Bei seiner Jagd auf Gegner spuckt es kleine Feuerbälle auf sie, für einen gerösteten Snack."),
                List.of(new EvolutionEntry("greninja vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,38),
                        new MoveLearnSetEntry(Move.POISON_JAB,36),
                        new MoveLearnSetEntry(Move.LICK,10),
                        new MoveLearnSetEntry(Move.ROUND,24),
                        new MoveLearnSetEntry(Move.BOUNCE,44),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,48),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,55),
                        new MoveLearnSetEntry(Move.INCINERATE,14),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,20),
                        new MoveLearnSetEntry(Move.SLUDGE,29)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 40, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Frogadier");

    }


}
