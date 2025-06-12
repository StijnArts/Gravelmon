package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Wasplode extends drai.dev.data.pokemon.Pokemon {
    public Wasplode() {
        super("Wasplode",
                Type.BUG, Type.FIRE,
                new Stats(65,
                        110,
                        65,
                        95,
                        65,
                        110),
                List.of(Ability.INFILTRATOR), Ability.FLASH_FIRE,
                10, 165,
                new Stats(0,0,0,0,0,2), 60,
                0.5,
                175, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Wasplode fiercely defend their nests, which they build with mud. If necessary, a Wasplode will detonate a fiery explosion to save its sisters."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.PURSUIT,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,11),
                        new MoveLearnSetEntry(Move.TWINEEDLE,16),
                        new MoveLearnSetEntry(Move.BEAT_UP,19),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,22),
                        new MoveLearnSetEntry(Move.FLAME_BURST,25),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,29),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.UTURN,37),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,41),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,46),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,51),
                        new MoveLearnSetEntry(Move.FELL_STINGER,56),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,62),
                        new MoveLearnSetEntry(Move.OVERHEAT,68),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,"tm"),
                        new MoveLearnSetEntry(Move.BURN_UP,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 32, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wasplode");

    }


}
