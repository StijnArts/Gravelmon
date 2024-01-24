package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Twintacle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Twintacle() {
        super("Twintacle",
                Type.FIGHTING,
                new Stats(45,
                        36,
                        56,
                        45,
                        62,
                        46),
                List.of(Ability.HYDRATION), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,1,0,1), 100,
                0.0,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Due to their lack of limbs, Twintacle use their powerful twin-tails in battle. Whipping them around, they can knock out opponents either with the twin-tails themselves or using its body as a flail."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Twintacle");

    }


}
