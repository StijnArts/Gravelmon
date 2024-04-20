package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Fantasmaug extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fantasmaug() {
        super("Fantasmaug",
                Type.DRAGON, Type.POISON,
                new Stats(77,
                        66,
                        77,
                        145,
                        95,
                        88),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,11),
                        new MoveLearnSetEntry(Move.BITE,14),
                        new MoveLearnSetEntry(Move.POISON_GAS,16),
                        new MoveLearnSetEntry(Move.DRAGONFANG,20),
                        new MoveLearnSetEntry(Move.ROAR,22),
                        new MoveLearnSetEntry(Move.POISON_FANG,25),
                        new MoveLearnSetEntry(Move.TOXIC,28),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,32),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,35),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,37),
                        new MoveLearnSetEntry(Move.TOXICFUMES,41),
                        new MoveLearnSetEntry(Move.CRUNCH,46),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,49),
                        new MoveLearnSetEntry(Move.OUTRAGE,54),
                        new MoveLearnSetEntry(Move.BELCH,60)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fantasmaug");

    }


}
