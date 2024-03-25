package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

public class Pincess extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pincess() {
        super("Pincess",
                Type.BUG,Type.GROUND,
                new Stats(44,
                        44,
                        44,
                        44,
                        44,
                        22),
                List.of(Ability.COMPOUND_EYES,Ability.COMPETITIVE), Ability.STURDY,
                1, 14,
                new Stats(0,0,0,0,1,0), 0,
                0.0,
                78, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of("- String Shot Bug 3 Leech LifeSTAB Bug 8 DigSTAB Ground 12 Sleep Powder Grass 16 Confusion Psychic 20 Poison Powder Poison 24 Fury CutterSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,3),
                        new MoveLearnSetEntry(Move.DIG,8),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,12),
                        new MoveLearnSetEntry(Move.CONFUSION,16),
                        new MoveLearnSetEntry(Move.POISON_POWDER,20),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,24)                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pincess");

    }


}
