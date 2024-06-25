package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Vicera extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vicera() {
        super("Vicera",
                Type.WATER, Type.DARK,
                new Stats(72,
                        84,
                        70,
                        58,
                        52,
                        69),
                List.of(Ability.TORRENT), Ability.GUTS,
                14, 499,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Vicera are still as jolly as their previous evolution, but often times will be overtaken by a need to bite things, rather than having it be by accident. They still feel bad afterwards, however."),
                List.of(new EvolutionEntry("marawder", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(       new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.AQUASLAP,6),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,10),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,13),
                        new MoveLearnSetEntry(Move.ICE_FANG,17),
                        new MoveLearnSetEntry(Move.AQUA_JET,20),
                        new MoveLearnSetEntry(Move.FLIP_TURN,23),
                        new MoveLearnSetEntry(Move.CRUNCH,26),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,30),
                        new MoveLearnSetEntry(Move.LIQUIDATION,34),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,38),
                        new MoveLearnSetEntry(Move.THRASH,42),
                        new MoveLearnSetEntry(Move.GLARE,46),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,50),
                        new MoveLearnSetEntry(Move.AGILITY,55)                  ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Vicera");

    }


}
