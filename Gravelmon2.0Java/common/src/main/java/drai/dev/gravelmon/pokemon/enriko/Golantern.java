package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Golantern extends drai.dev.gravelmon.pokemon.Pokemon {
    public Golantern() {
        super("Golantern",
                Type.GHOST,
                new Stats(10,
                        10,
                        95,
                        95,
                        95,
                        45),
                List.of(Ability.STAKEOUT), Ability.ILLUMINATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is formed from the souls of people who died lost in forests or deserts. The lantern they carry at all times tends to create eerie lights known as will o' wisps."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,5),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,12),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,20),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,22),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,24),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,34),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,36),
                        new MoveLearnSetEntry(Move.PERISH_SONG,40),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Golantern");

    }


}
