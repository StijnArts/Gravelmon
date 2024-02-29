package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Spectrance extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spectrance() {
        super("Spectrance",
                Type.PSYCHIC,Type.DARK,
                new Stats(52,
                        86,
                        65,
                        115,
                        92,
                        95),
                List.of(Ability.SYMBIOSIS,Ability.PERPLEXING,Ability.CONTRARY), Ability.CONTRARY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                227, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("By rapidly shifting colours, this Pokemon over-stimulates opponents until they're incapacitated. In its time, Spectrance kept hypnotised victims in strategic locations around its den, allowing them to move only to fend off invaders in its place."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DARK_PULSE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spectrance");

    }


}
