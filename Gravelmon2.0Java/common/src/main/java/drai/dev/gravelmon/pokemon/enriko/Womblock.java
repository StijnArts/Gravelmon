package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Womblock extends drai.dev.gravelmon.pokemon.Pokemon {
    public Womblock() {
        super("Womblock",
                Type.NORMAL, Type.ROCK,
                new Stats(95,
                        90,
                        120,
                        65,
                        70,
                        45),
                List.of(Ability.STRONG_JAW,Ability.ROCK_HEAD,Ability.SAND_FORCE), Ability.SAND_FORCE,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They chew rocks into perfect cubes with their teeth and use the bricks to build shelter. It is believed they inspired the invention of bricks and mortar."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,10),
                        new MoveLearnSetEntry(Move.BITE,14),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,21),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,24),
                        new MoveLearnSetEntry(Move.HELPING_HAND,29),
                        new MoveLearnSetEntry(Move.HYPER_FANG,31),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,38),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,42),
                        new MoveLearnSetEntry(Move.BARRIER,49),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,55),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,60),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 42, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Womblock");

    }


}
