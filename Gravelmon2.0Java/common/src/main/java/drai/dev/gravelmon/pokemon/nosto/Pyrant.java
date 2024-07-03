package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Pyrant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pyrant() {
        super("Pyrant",
                Type.BUG, Type.FIRE,
                new Stats(35,
                        45,
                        38,
                        38,
                        42,
                        42),
                List.of(Ability.SWARM), Ability.FLASH_FIRE,
                5, 165,
                new Stats(0,1,0,0,0,0), 235,
                0.5,
                48, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                 new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.WRAP,5),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,15),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.COIL,25),
                        new MoveLearnSetEntry(Move.SLAM,30),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,35),
                        new MoveLearnSetEntry(Move.CRUNCH,40),
                        new MoveLearnSetEntry(Move.FIRE_LASH,45),
                        new MoveLearnSetEntry(Move.LUNGE,50),
                        new MoveLearnSetEntry(Move.BURN_UP,55)       ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyrant");

    }


}
