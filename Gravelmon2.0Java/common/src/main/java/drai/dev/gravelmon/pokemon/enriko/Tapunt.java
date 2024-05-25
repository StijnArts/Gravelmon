package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tapunt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tapunt() {
        super("Tapunt",
                Type.FAIRY, Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its fur is laced with chemicals that can induce drowsiness. This paired with its impressive punch lets it knock its predators unconscious."),
                List.of(new EvolutionEntry("somniarch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(          new MoveLearnSetEntry(Move.TWINBLADE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,1),
                        new MoveLearnSetEntry(Move.HEALING_WISH,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,4),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,6),
                        new MoveLearnSetEntry(Move.TELEPORT,9),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,11),
                        new MoveLearnSetEntry(Move.WISH,14),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,17),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,19),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,26),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,31),
                        new MoveLearnSetEntry(Move.COACHING,35),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,44),
                        new MoveLearnSetEntry(Move.HYPNOSIS,49),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,53),
                        new MoveLearnSetEntry(Move.VICTORY_DANCE,58),
                        new MoveLearnSetEntry(Move.MOONBLAST,62)              ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 6, 28, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_WINTER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tapunt");

    }


}
