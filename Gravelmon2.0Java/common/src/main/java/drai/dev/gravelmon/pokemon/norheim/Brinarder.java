package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Brinarder extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brinarder() {
        super("Brinarder",
                Type.WATER,Type.FAIRY,
                new Stats(91,
                        111,
                        79,
                        88,
                        78,
                        88),
                List.of(Ability.TORRENT), Ability.HEALER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("A trainer's best friend; if you are bold enough. By chasing its wavy tail on the water surface, Brinarder creates waterspouts. It is said that looking directly into its eyes will scare about anyone off."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brinarder");

    }


}
