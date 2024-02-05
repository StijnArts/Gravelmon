package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tropiary extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tropiary() {
        super("Tropiary",
                Type.GRASS,Type.STEEL,
                new Stats(77,
                        100,
                        121,
                        50,
                        70,
                        52),
                List.of(Ability.HYPER_CUTTER), Ability.CHLOROPHYLL,
                13, 165,
                new Stats(0,1,1,0,0,0), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("The bush on its back is shapped like its body to confuse its foes in combat. It spends most of its day sunbathing."),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,5),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,10),
                        new MoveLearnSetEntry(Move.INGRAIN,15),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,20),
                        new MoveLearnSetEntry(Move.IRON_HEAD,25),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.CURSE,41),
                        new MoveLearnSetEntry(Move.GYRO_BALL,45),
                        new MoveLearnSetEntry(Move.EXPLOSION,50)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 55, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPRING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN, SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Tropiary");

    }


}
