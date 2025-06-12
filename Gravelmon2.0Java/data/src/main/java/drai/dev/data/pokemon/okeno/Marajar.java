package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marajar extends drai.dev.data.pokemon.Pokemon {
    public Marajar() {
        super("Marajar",
                Type.GROUND,Type.GHOST,
                new Stats(48,
                        48,
                        125,
                        93,
                        125,
                        41),
                List.of(Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                15, 0,
                new Stats(0,0,0,0,2,0), 80,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.DRAGON),
                List.of("- Confusion Psychic - Psychic Psychic - Teleport Psychic - Night ShadeSTAB Ghost - Confuse Ray Ghost - Curse  Ghost - Destiny Bond  Ghost - Endure  Normal - Psych Up Normal - Ancient Power Rock - Imprison  Psychic - Heal Block  Psychic - Earth PowerSTAB Ground - Stored Power Psychic - Relic Pillar  Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IMPRISON,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.PSYCH_UP,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.STORED_POWER,1),
                        new MoveLearnSetEntry(Move.PSYCHIC,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.RELICPILLAR,1),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 33, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Marajar");

    }


}
