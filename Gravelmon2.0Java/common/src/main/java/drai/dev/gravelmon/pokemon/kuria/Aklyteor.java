package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Aklyteor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aklyteor() {
        super("Aklyteor",
                Type.ROCK, Type.COSMIC,
                new Stats(90,
                        135,
                        115,
                        60,
                        90,
                        65),
                List.of(Ability.SOLID_ROCK,Ability.ENTERSPHERE), Ability.ROCK_HEAD,
                24, 2771,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                226, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(  new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,7),
                        new MoveLearnSetEntry(Move.BLOCK,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,15),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,33),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.COUNTER,47),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,55)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 45, 61, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END, Biome.IS_BADLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aklyteor");

    }


}
