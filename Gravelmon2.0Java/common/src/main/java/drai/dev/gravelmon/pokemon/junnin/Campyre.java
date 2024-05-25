package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Campyre extends drai.dev.gravelmon.pokemon.Pokemon {
    public Campyre() {
        super("Campyre",
                Type.FIRE,
                new Stats(41,
                        56,
                        65,
                        87,
                        65,
                        41),
                List.of(Ability.FLAME_BODY), Ability.FLASH_FIRE,
                8, 165,
                new Stats(0,0,0,1,0,0), 222,
                0.5,
                67, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("will burn ur butt"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOLD_HANDS,1)                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Campyre");

    }


}
