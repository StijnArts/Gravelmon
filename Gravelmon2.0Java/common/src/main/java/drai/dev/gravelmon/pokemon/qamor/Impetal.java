package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Impetal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Impetal() {
        super("Impetal",
                Type.FAIRY, Type.GHOST,
                new Stats(95,
                        98,
                        80,
                        70,
                        72,
                        65),
                List.of(Ability.CURSED_BODY), Ability.CURSED_BODY,
                19, 165,
                new Stats(0,0,0,2,1,0), 45,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("Impetal has an insatiable craving to consume and cannibalize other fairy type Pokemon. It traps fairy type Pokemon using its cunning skills to lead them to their doom."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,8),
                        new MoveLearnSetEntry(Move.SPITE,12),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,15),
                        new MoveLearnSetEntry(Move.CURSE,19),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,22),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,34),
                        new MoveLearnSetEntry(Move.SEED_BOMB,40),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,46),
                        new MoveLearnSetEntry(Move.GRUDGE,51),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,57),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,65)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 44, 61, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Impetal");

    }


}
