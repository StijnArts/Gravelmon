package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Fulgoryu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fulgoryu() {
        super("Fulgoryu",
                Type.BUG,Type.DRAGON,
                new Stats(85,
                        50,
                        70,
                        95,
                        85,
                        65),
                List.of(Ability.WONDER_SKIN), Ability.WONDER_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They have large heads with a set of fake teeth to intimidate foes. A strange draconic power burns deep within their bodies, causing their heads, wings and underside to occasionally glow vibrantly"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,9),
                        new MoveLearnSetEntry(Move.WING_ATTACK,21),
                        new MoveLearnSetEntry(Move.SCARY_FACE,23),
                        new MoveLearnSetEntry(Move.TWISTER,25),
                        new MoveLearnSetEntry(Move.SILVER_WIND,31),
                        new MoveLearnSetEntry(Move.TAILWIND,33),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,37),
                        new MoveLearnSetEntry(Move.FLY,40),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,44),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,48),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,51),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,57)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fulgoryu");

    }


}