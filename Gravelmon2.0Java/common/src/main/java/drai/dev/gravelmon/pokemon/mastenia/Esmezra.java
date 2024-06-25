package drai.dev.gravelmon.pokemon.mastenia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Esmezra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Esmezra() {
        super("Esmezra",
                Type.DARK, Type.PSYCHIC,
                new Stats(75,
                        76,
                        55,
                        109,
                        109,
                        77),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- PsyshockSTAB Psychic - Beak Blast Flying - Trick Room Psychic - Cosmic Power Psychic - ConfusionSTAB Psychic - Confuse Ray Ghost - Mean Look Normal - Scary Face Normal - Tri Attack Normal - Clear Smog Poison - Feint AttackSTAB Dark - PursuitSTAB Dark - Dark PulseSTAB Dark - Drill Peck Flying - Agility Psychic - Double Hit Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.DARK_PULSE,1),
                        new MoveLearnSetEntry(Move.PSYSHOCK,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.BEAK_BLAST,1),
                        new MoveLearnSetEntry(Move.DRILL_PECK,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Esmezra");

    }


}
