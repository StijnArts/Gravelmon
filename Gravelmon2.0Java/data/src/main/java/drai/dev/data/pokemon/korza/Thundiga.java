package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Thundiga extends drai.dev.data.pokemon.Pokemon {
    public Thundiga() {
        super("Thundiga",
                Type.ELECTRIC,Type.DARK,
                new Stats(60,
                        73,
                        56,
                        96,
                        91,
                        104),
                List.of(Ability.PRANKSTER,Ability.JUSTIFIED), Ability.MOXIE,
                14, 420,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Normally nocturnal, Thundiga can engulf themselves in dark fog to hunt in lighter conditions. When it roars, heavy thunderstorms are summoned."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,14),
                        new MoveLearnSetEntry(Move.CHARGE,17),
                        new MoveLearnSetEntry(Move.SPARK,22),
                        new MoveLearnSetEntry(Move.TAUNT,25),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,32),
                        new MoveLearnSetEntry(Move.SLASH,37),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,44),
                        new MoveLearnSetEntry(Move.DISCHARGE,49),
                        new MoveLearnSetEntry(Move.SWAGGER,56),
                        new MoveLearnSetEntry(Move.THUNDER,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Thundiga");

    }


}
