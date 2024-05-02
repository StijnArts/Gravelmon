package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chemecko extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chemecko() {
        super("Chemecko",
                Type.FIRE,
                new Stats(34,
                        54,
                        52,
                        69,
                        41,
                        80),
                List.of(Ability.FRISK,Ability.FOREWARN,Ability.DRY_SKIN), Ability.DRY_SKIN,
                4, 165,
                new Stats(0,0,0,0,0,1), 80,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("There are certain chemicals stored in its tail. When in fear, it drops its tail behind which will later explode to harm or distract its enemies."),
                List.of(new EvolutionEntry("molozard", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.THIEF,5),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,12),
                        new MoveLearnSetEntry(Move.ENDURE,16),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,19),
                        new MoveLearnSetEntry(Move.TORMENT,22),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,25),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,28),
                        new MoveLearnSetEntry(Move.FLAME_BURST,32),
                        new MoveLearnSetEntry(Move.SNARL,37),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,40),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,46),
                        new MoveLearnSetEntry(Move.BEAT_UP,50),
                        new MoveLearnSetEntry(Move.SPITE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 26, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chemecko");

    }


}
