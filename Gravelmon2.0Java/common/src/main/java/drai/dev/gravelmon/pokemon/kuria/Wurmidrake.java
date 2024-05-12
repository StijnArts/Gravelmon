package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Wurmidrake extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wurmidrake() {
        super("Wurmidrake",
                Type.BUG, Type.DRAGON,
                new Stats(47,
                        60,
                        46,
                        50,
                        46,
                        51),
                List.of(Ability.INTIMIDATE,Ability.OVERCOAT), Ability.WEAK_ARMOR,
                5, 56,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It silently feeds on leaves seemingly without end. Though small and weak, it somehow projects a rather menacing aura."),
                List.of(new EvolutionEntry("visacoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(             new MoveLearnSetEntry(Move.GILDEDSPEAR,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,7),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,11),
                        new MoveLearnSetEntry(Move.UPROAR,16),
                        new MoveLearnSetEntry(Move.SILVER_WIND,22),
                        new MoveLearnSetEntry(Move.STOMP,24),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,30),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,38),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,42),
                        new MoveLearnSetEntry(Move.MEGAHORN,50),
                        new MoveLearnSetEntry(Move.IRON_HEAD,58),
                        new MoveLearnSetEntry(Move.EARTH_POWER,66),
                        new MoveLearnSetEntry(Move.STONE_EDGE,72),
                        new MoveLearnSetEntry(Move.GILDEDSPEAR,85)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wurmidrake");

    }


}
