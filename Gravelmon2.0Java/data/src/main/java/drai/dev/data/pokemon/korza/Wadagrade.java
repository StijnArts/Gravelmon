package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wadagrade extends drai.dev.data.pokemon.Pokemon {
    public Wadagrade() {
        super("Wadagrade",
                Type.NORMAL,
                new Stats(80,
                        40,
                        160,
                        30,
                        160,
                        15),
                List.of(Ability.PICKUP), Ability.STURDY,
                22, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite a reputation for surviving extremes of temperature, pressure, radiation, and even the vacuum of space, this mon is content simply foraging for leaves and berries in comfort."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOLD_BACK,5),
                        new MoveLearnSetEntry(Move.RECYCLE,11),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,16),
                        new MoveLearnSetEntry(Move.PESTER,20),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,25),
                        new MoveLearnSetEntry(Move.MINIMIZE,29),
                        new MoveLearnSetEntry(Move.BODY_SLAM,34),
                        new MoveLearnSetEntry(Move.RECOVER,38),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,47),
                        new MoveLearnSetEntry(Move.STOCKPILE,51),
                        new MoveLearnSetEntry(Move.SWALLOW,51),
                        new MoveLearnSetEntry(Move.SPIT_UP,51)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wadagrade");

    }


}
