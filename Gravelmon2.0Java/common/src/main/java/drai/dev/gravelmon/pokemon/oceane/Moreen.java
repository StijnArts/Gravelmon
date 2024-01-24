package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Moreen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moreen() {
        super("Moreen",
                Type.DARK,
                new Stats(64,
                        93,
                        62,
                        94,
                        68,
                        84),
                List.of(Ability.DEFIANT), Ability.MARVEL_SCALE,
                8, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.0,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Moreen are always competing for who has the biggest front and back fins - the bigger they are the more beautiful they consider them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLATTER,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Moreen");

    }


}
