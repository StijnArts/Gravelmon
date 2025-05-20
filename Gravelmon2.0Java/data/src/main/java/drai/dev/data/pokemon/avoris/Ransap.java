package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ransap extends drai.dev.data.pokemon.Pokemon {
    public Ransap() {
        super("Ransap",
                Type.DARK, Type.NORMAL,
                new Stats(94,
                        100,
                        65,
                        60,
                        75,
                        76),
                List.of(Ability.STICKY_HOLD,Ability.HONEY_GATHER,Ability.INSOMNIA), Ability.INSOMNIA,
                17, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ransap have a rivalry with Ursaring, as they prevent Ransap from eating their favorite treat: the sweet sap of Grample. They grow feral if deprived of the sap for too long. Eating the sap will cause them to go into a frenzy."),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.HOWL,4),
                        new MoveLearnSetEntry(Move.SUDDEN_STRIKE,7),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,10),
                        new MoveLearnSetEntry(Move.SNARL,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.ROAR,19),
                        new MoveLearnSetEntry(Move.FACADE,22),
                        new MoveLearnSetEntry(Move.SCARY_FACE,25),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,31),
                        new MoveLearnSetEntry(Move.SWAGGER,34),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,37)            ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 49, 1.7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.HONEY_TREE),
                0.28, 0.3,
                List.of());
           setLangFileName("Ransap");

    }


}
