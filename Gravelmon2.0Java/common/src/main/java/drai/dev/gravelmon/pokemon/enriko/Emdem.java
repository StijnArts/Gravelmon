package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Emdem extends drai.dev.gravelmon.pokemon.Pokemon {
    public Emdem() {
        super("Emdem",
                Type.FLYING,
                new Stats(60,
                        60,
                        70,
                        20,
                        70,
                        70),
                List.of(Ability.STENCH,Ability.REGENERATOR,Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                8, 165,
                new Stats(0,0,1,0,0,0), 230,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("(Hemo type.) Its amorphous body contains DNA from several unrelated Pokemon. It is able to regenerate missing parts of its edible body, making it a potential unlimited food source."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Emdem");

    }


}
