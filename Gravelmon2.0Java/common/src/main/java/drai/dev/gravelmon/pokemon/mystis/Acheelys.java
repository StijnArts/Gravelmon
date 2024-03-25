package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Acheelys extends drai.dev.gravelmon.pokemon.Pokemon {
    public Acheelys() {
        super("Acheelys",
                Type.FIGHTING,Type.FLYING,
                new Stats(85,
                        90,
                        60,
                        50,
                        60,
                        115),
                List.of(Ability.BATTLE_ARMOR), Ability.DEFIANT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This Mon has been spotted mostly around ancient ruins. Initially believed to be the spirits of an ancient civilisation, Acheelys are in fact regular Mons that happened to be worshipped as a symbol of speed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEATHERSLASH,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.SOLIDKICK,1),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,1),
                        new MoveLearnSetEntry(Move.SUPERPOWER,1),
                        new MoveLearnSetEntry(Move.ACROBATICS,1),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,1),
                        new MoveLearnSetEntry(Move.TRIPLE_KICK,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DIVE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Acheelys");

    }


}
