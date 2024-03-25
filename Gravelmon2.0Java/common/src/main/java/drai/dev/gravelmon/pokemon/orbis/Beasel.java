package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Beasel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beasel() {
        super("Beasel",
                Type.BUG,
                new Stats(65,
                        60,
                        95,
                        80,
                        95,
                        60),
                List.of(Ability.INTIMIDATE), Ability.INTIMIDATE,
                9, 120,
                new Stats(0,0,1,0,1,0), 80,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Beasel use their antennas and hands to paint pictures on each others backs. Art students commonly own Beasel to use as a working canvas."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCARY_FACE,5),
                        new MoveLearnSetEntry(Move.DOODLE,16),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,23),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,27),
                        new MoveLearnSetEntry(Move.CAPTIVATE,35)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beasel");

    }


}
