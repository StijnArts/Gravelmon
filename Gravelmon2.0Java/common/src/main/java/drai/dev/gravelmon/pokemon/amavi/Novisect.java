package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Novisect extends drai.dev.gravelmon.pokemon.Pokemon {
    public Novisect() {
        super("Novisect",
                Type.FIGHTING, Type.BUG,
                new Stats(59,
                        69,
                        59,
                        49,
                        59,
                        59),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("insensei", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(           new MoveLearnSetEntry(Move.ARM_THRUST,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,5),
                        new MoveLearnSetEntry(Move.ENDURE,10),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,20),
                        new MoveLearnSetEntry(Move.COUNTER,25),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,30),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,35),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,40),
                        new MoveLearnSetEntry(Move.THRASH,45),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,50),
                        new MoveLearnSetEntry(Move.MEGAHORN,55),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,60)             ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 26, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Novisect");

    }


}
