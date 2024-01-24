package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Vicoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vicoon() {
        super("Vicoon",
                Type.BUG,
                new Stats(50,
                        50,
                        130,
                        35,
                        50,
                        20),
                List.of(Ability.BATTLE_ARMOR), Ability.MULTISCALE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Vicoon enjoy hanging on high tree branches to purposely fall on trainers or Pokemon. Their main objective is to protect the sleeping larvae on its back. evolve: protect"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENDURE,18),
                        new MoveLearnSetEntry(Move.BIDE,20)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vicoon");

    }


}
