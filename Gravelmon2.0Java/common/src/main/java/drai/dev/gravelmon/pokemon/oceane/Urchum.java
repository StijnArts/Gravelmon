package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Urchum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Urchum() {
        super("Urchum",
                Type.POISON,
                new Stats(34,
                        44,
                        76,
                        24,
                        64,
                        43),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                100, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Venomous spines line its body. It is only vulnerable if all its spines break, although they grow back."),
                List.of(new EvolutionEntry("urtichum", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 2, 23, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
