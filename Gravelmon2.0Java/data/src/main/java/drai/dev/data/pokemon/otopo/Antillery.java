package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Antillery extends drai.dev.data.pokemon.Pokemon {
    public Antillery() {
        super("Antillery",
                Type.ROCK, Type.NORMAL,
                new Stats(60,
                        60,
                        60,
                        40,
                        40,
                        60),
                List.of(Ability.SKILL_LINK,Ability.SNIPER), Ability.SAND_SPIT,
                10, 900,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                45, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("To find nourishment, Antillery must break through rocks. It can suck up shattered chunks of rock and fire them at great speeds from its snout if it feels threatened."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.MUD_SHOT,7),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,9),
                        new MoveLearnSetEntry(Move.SANDSHOT,11),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,14),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,15),
                        new MoveLearnSetEntry(Move.MUD_BOMB,17),
                        new MoveLearnSetEntry(Move.BARRAGE,20)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Antillery");

    }


}
