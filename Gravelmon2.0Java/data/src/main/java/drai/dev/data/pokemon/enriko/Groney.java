package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Groney extends drai.dev.data.pokemon.Pokemon {
    public Groney() {
        super("Groney",
                Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STENCH,Ability.REGENERATOR,Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("(Hemo type.) It swims through pools of ground meat like an eel in water. Occasionally a segment of its body pinches and breaks off, happening about four times a day."),
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
           setLangFileName("Groney");

    }


}
