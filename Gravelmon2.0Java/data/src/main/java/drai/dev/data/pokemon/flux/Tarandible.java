package drai.dev.data.pokemon.flux;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class Tarandible extends Pokemon {
    public Tarandible() {
        super("Tarandible",
                Type.BUG, Type.DARK,
                new Stats(67,
                        95,
                        117,
                        53,
                        77,
                        71),
                List.of(Ability.INTIMIDATE, Ability.BATTLE_ARMOR), Ability.SAND_RUSH,
                10, 450,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It lies still during the day, disguised as a Pokemon's skull. As it prowls at night, it makes an eerie noise that sounds like rattling bones."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BONE_RUSH,1),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,1),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.PROTECT,17),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,21),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,25),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,30),
                        new MoveLearnSetEntry(Move.DIG,34),
                        new MoveLearnSetEntry(Move.SCARY_FACE,38),
                        new MoveLearnSetEntry(Move.LUNGE,43),
                        new MoveLearnSetEntry(Move.CRUNCH,47),
                        new MoveLearnSetEntry(Move.STICKY_WEB,51),
                        new MoveLearnSetEntry(Move.MEGAHORN,56)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 28, 48, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
