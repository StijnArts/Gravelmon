package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Phoeuck extends drai.dev.gravelmon.pokemon.Pokemon {
    public Phoeuck() {
        super("Phoeuck",
                Type.FIRE, Type.GHOST,
                new Stats(90,
                        170,
                        70,
                        140,
                        80,
                        130),
                List.of(Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                24, 165,
                new Stats(0,0,0,0,0,0), 25,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,8),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,12),
                        new MoveLearnSetEntry(Move.WILLOWISP,16),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,20),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,24),
                        new MoveLearnSetEntry(Move.INCINERATE,28),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,32),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,37),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,42),
                        new MoveLearnSetEntry(Move.BITTER_BLADE,48),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,56),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,62)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Phoeuck");

    }


}
