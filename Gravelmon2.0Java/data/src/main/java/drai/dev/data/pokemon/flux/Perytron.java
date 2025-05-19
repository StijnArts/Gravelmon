package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Perytron extends drai.dev.data.pokemon.Pokemon {
    public Perytron() {
        super("Perytron",
                Type.ELECTRIC,
                new Stats(80,
                        40,
                        40,
                        95,
                        130,
                        105),
                List.of(Ability.PRANKSTER,Ability.BATTERY), Ability.LEVITATE,
                3, 1,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                172, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It travels the air in the form of an electrical signal. In reality, some technical malfunctions attributed to Rotom are actually its doing."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,5),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,10),
                        new MoveLearnSetEntry(Move.SWIFT,15),
                        new MoveLearnSetEntry(Move.METAL_SOUND,20),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,25),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,30),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,35),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,40),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,45),
                        new MoveLearnSetEntry(Move.THUNDER,50),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,55),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Perytron");

    }


}
