package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Varantox extends drai.dev.data.pokemon.Pokemon {
    public Varantox() {
        super("Varantox",
                Type.POISON, Type.COSMIC,
                new Stats(80,
                        68,
                        110,
                        120,
                        90,
                        54),
                List.of(Ability.WONDER_SKIN,Ability.ANTICIPATION), Ability.MAGIC_GUARD,
                15, 205,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                201, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
                List.of("Varantox hunts prey by putting webs coated in a powerful poison which can distort the reality around it. They use this to disorient those they trap."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.ACID,11),
                        new MoveLearnSetEntry(Move.PURSUIT,14),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.SLAM,22),
                        new MoveLearnSetEntry(Move.GLARE,25),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,35),
                        new MoveLearnSetEntry(Move.COIL,41),
                        new MoveLearnSetEntry(Move.TOXIC,46),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,51),
                        new MoveLearnSetEntry(Move.MOONLIGHT,55),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,60)                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 40, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Varantox");

    }


}
