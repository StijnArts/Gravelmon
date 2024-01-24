package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Popondot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Popondot() {
        super("Popondot",
                Type.PSYCHIC,Type.FAIRY,
                new Stats(101,
                        92,
                        37,
                        105,
                        56,
                        107),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- High Jump Kick Fighting - Mirror CoatSTAB Psychic - Clear Smog Poison - Venoshock Poison - Play RoughSTAB Fairy - Dazzling GleamSTAB Fairy - Misty ExplosionSTAB Fairy - Sweet Kiss Fairy - Belly Drum Normal - Perish Song Normal - Bounce Flying - Belch Poison - Toxic Poison - Light Screen Psychic - Power Gem Rock - Reflect Psychic - Feint Attack Dark"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Popondot");

    }


}
