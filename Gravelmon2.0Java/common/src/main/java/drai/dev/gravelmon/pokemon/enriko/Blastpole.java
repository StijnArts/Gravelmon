package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Blastpole extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blastpole() {
        super("Blastpole",
                Type.FIRE,
                new Stats(70,
                        60,
                        65,
                        40,
                        55,
                        50),
                List.of(Ability.BLAZE), Ability.INTIMIDATE,
                3, 165,
                new Stats(0,0,1,0,0,0), 80,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It can blow fire out of a pore in its backside, propelling it through the air. The fire is fueled by toxins inside its body."),
                List.of(new EvolutionEntry("wogfire", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,8),
                        new MoveLearnSetEntry(Move.GLARE,16),
                        new MoveLearnSetEntry(Move.CROSS_POISON,20),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,25),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,31),
                        new MoveLearnSetEntry(Move.CURSE,37),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,40),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,47),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_NETHER_BASALT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Blastpole");

    }


}
