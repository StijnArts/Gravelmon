package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Tuncanny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tuncanny() {
        super("Tuncanny",
                Type.STEEL,
                new Stats(45,
                        60,
                        120,
                        60,
                        90,
                        50),
                List.of(Ability.BATTLE_ARMOR), Ability.INNARDS_OUT,
                5, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.75,
                100, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("During the day, they bury themselves in sand so their amorphous bodies don't dry up. If its steel shell breaks, it'll replace it with any junk it can find."),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,8),
                        new MoveLearnSetEntry(Move.HEADBUTT,16),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,24),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,32),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,40)),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 34, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Tuncanny");

    }


}
