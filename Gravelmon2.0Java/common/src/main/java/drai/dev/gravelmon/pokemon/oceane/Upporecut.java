package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Upporecut extends drai.dev.gravelmon.pokemon.Pokemon {
    public Upporecut() {
        super("Upporecut",
                Type.FIGHTING,
                new Stats(90,
                        92,
                        84,
                        52,
                        83,
                        88),
                List.of(Ability.WATER_ABSORB), Ability.REFLEXSTRIKE,
                8, 165,
                new Stats(1,2,0,0,0,0), 60,
                1.0,
                171, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Upporecut's body has hardened in areas due to rigorous training and battle experience, but it still can absorb water. It's punches cause far more damage, with enough power to cause bruising on contact."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULK_UP,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Upporecut");

    }


}
