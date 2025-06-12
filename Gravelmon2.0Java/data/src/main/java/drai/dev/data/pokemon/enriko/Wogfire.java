package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wogfire extends drai.dev.data.pokemon.Pokemon {
    public Wogfire() {
        super("Wogfire",
                Type.FIRE, Type.POISON,
                new Stats(90,
                        85,
                        90,
                        60,
                        80,
                        55),
                List.of(Ability.BLAZE), Ability.INTIMIDATE,
                7, 165,
                new Stats(0,0,2,0,0,0), 70,
                0.5,
                120, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("The pores in its back lead to a sac of flammable, corrosive liquid. When Wogfire takes a blow, the liquid is forced out."),
                List.of(new EvolutionEntry("pyroad", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))
                ),
                List.of(         new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,8),
                        new MoveLearnSetEntry(Move.GLARE,16),
                        new MoveLearnSetEntry(Move.CROSS_POISON,20),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,25),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,31),
                        new MoveLearnSetEntry(Move.CURSE,37),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,40),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,47),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,54)               ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 40, 3.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_VOLCANIC)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wogfire");

    }


}
