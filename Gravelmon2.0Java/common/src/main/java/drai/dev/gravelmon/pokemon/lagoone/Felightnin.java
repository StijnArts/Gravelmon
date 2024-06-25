package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Felightnin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Felightnin() {
        super("Felightnin",
                Type.DARK, Type.ELECTRIC,
                new Stats(55,
                        70,
                        60,
                        95,
                        50,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 310,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                144, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("zenithera", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"58")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.HELPING_HAND,11),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,14),
                        new MoveLearnSetEntry(Move.HYPER_FANG,18),
                        new MoveLearnSetEntry(Move.THIEF,21),
                        new MoveLearnSetEntry(Move.SUPER_FANG,26),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.TAUNT,34),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,39),
                        new MoveLearnSetEntry(Move.SWITCHEROO,43),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,48),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,53),
                        new MoveLearnSetEntry(Move.THUNDER,59)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Felightnin");

    }


}
