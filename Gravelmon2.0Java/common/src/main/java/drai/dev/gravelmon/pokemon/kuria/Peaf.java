package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Peaf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Peaf() {
        super("Peaf",
                Type.GRASS, Type.FLYING,
                new Stats(40,
                        72,
                        71,
                        81,
                        67,
                        59),
                List.of(Ability.BERRYPLUMAGE), Ability.BERRYPLUMAGE,
                4, 40,
                new Stats(0,0,0,1,0,0), 45,
                0.125,
                86, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("pearry", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(              new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TYPHOON,1),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.GUST,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.GROWTH,16),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,20),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,24),
                        new MoveLearnSetEntry(Move.WHIRLWIND,28),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,32),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,36),
                        new MoveLearnSetEntry(Move.BOUNCE,39),
                        new MoveLearnSetEntry(Move.SYNTHESIS,46),
                        new MoveLearnSetEntry(Move.WILD_GROWTH,53),
                        new MoveLearnSetEntry(Move.AGILITY,60)          ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Peaf");

    }


}
