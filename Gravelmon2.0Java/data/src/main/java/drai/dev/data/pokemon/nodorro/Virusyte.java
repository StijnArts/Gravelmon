package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Virusyte extends drai.dev.data.pokemon.Pokemon {
    public Virusyte() {
        super("Virusyte",
                Type.STEEL, Type.ELECTRIC,
                new Stats(54,
                        66,
                        62,
                        124,
                        102,
                        104),
                List.of(Ability.INFESTEDDRIVE), Ability.INFESTEDDRIVE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Charge Electric - Ion Deluge Electric - Thunder ShockSTAB Electric - Flash Normal 5 ElectrowebSTAB Electric 14 Metal Sound Steel 16 Metal ClawSTAB Steel 22 Magnet BombSTAB Steel 24 Magnetic Flux Electric 25 Magnet Rise Electric 29 Volt SwitchSTAB Electric 33 Flash CannonSTAB Steel 34 ThunderboltSTAB Electric 36 Metal BurstSTAB Steel 46 ThunderSTAB Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.ION_DELUGE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.ELECTROWEB,5),
                        new MoveLearnSetEntry(Move.METAL_SOUND,14),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,22),
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,24),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,25),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,29),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,33),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,34),
                        new MoveLearnSetEntry(Move.METAL_BURST,36),
                        new MoveLearnSetEntry(Move.THUNDER,46)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Virusyte");

    }


}
