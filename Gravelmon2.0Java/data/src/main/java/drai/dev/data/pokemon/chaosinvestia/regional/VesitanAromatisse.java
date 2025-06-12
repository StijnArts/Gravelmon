package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanAromatisse extends drai.dev.data.pokemon.Pokemon {
    public VesitanAromatisse(String name, Aspect aspect) {
        super(name, aspect, "VesitanAromatisse",
                Type.FAIRY,Type.PSYCHIC,
                new Stats(101,
                        32,
                        72,
                        90,
                        99,
                        85),
                List.of(Ability.HEALER,Ability.AROMA_VEIL), null,
                8, 155,
                new Stats(2,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Wie Pilzsporen breitet sich der vor ihm versprühte Duft im Körper des Gegners aus. Wenige Sekunden später werden sie zu willenlosen Sklaven."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,1),
                        new MoveLearnSetEntry(Move.FLAIL,38),
                        new MoveLearnSetEntry(Move.CALM_MIND,17),
                        new MoveLearnSetEntry(Move.DREAM_EATER,42),
                        new MoveLearnSetEntry(Move.REFLECT,57),
                        new MoveLearnSetEntry(Move.MOONBLAST,31),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,21),
                        new MoveLearnSetEntry(Move.SWEET_KISS,6),
                        new MoveLearnSetEntry(Move.PSYCH_UP,64),
                        new MoveLearnSetEntry(Move.HYPNOSIS,35),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,53),
                        new MoveLearnSetEntry(Move.PSYCHIC,48),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,8),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,44),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.ATTRACT,29),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,1),
                        new MoveLearnSetEntry(Move.CONFUSION,13),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,25),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 25, 43, 0.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aromatisse");

    }


}
