package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Adhesnail extends drai.dev.data.pokemon.Pokemon {
    public Adhesnail() {
        super("Adhesnail",
                Type.POISON, Type.STEEL,
                new Stats(100,
                        70,
                        110,
                        80,
                        100,
                        40),
                List.of(Ability.STICKY_HOLD,Ability.GOOEY), Ability.ADHESIVE,
                6, 600,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Metal BurstSTAB Steel - AcidSTAB Poison 4 Acid SpraySTAB Poison 7 Poison Gas Poison 11 Clear SmogSTAB Poison 15 SludgeSTAB Poison 26 Mirror ShotSTAB Steel 27 Gastro Acid Poison 32 Sludge BombSTAB Poison 34 Iron Defense Steel 36 Gyro BallSTAB Steel 37 Venom Drench Poison 39 Flash CannonSTAB Steel 43 Shell Smash Normal 46 Sludge WaveSTAB Poison 50 Recover Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.METAL_BURST,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,4),
                        new MoveLearnSetEntry(Move.POISON_GAS,7),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,11),
                        new MoveLearnSetEntry(Move.SLUDGE,15),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,26),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,27),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,34),
                        new MoveLearnSetEntry(Move.GYRO_BALL,36),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,37),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,39),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,43),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,46),
                        new MoveLearnSetEntry(Move.RECOVER,50),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Adhesnail");

    }


}
