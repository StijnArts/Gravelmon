package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianRhydon extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianRhydon() {
        super("Rhydon",
                Type.ICE,Type.FIGHTING,
                new Stats(105,
                        130,
                        120,
                        45,
                        45,
                        40),
                List.of(Ability.MOUNTAINEER), Ability.THICK_FAT,
                8, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("It goes through rigorous training in the montains to keep its body warm and grow stronger. Whenever it finds other Pokémon lost in its mountains it tries to guide them back to safety."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rhydon");

    }


}
