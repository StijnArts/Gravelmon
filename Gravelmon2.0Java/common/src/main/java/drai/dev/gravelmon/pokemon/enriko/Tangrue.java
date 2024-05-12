package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tangrue extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tangrue() {
        super("Tangrue",
                Type.GRASS,
                new Stats(35,
                        60,
                        20,
                        30,
                        80,
                        50),
                List.of(Ability.CHLOROPHYLL,Ability.LONG_REACH,Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                70, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Its tail has sharp spikes on the backside, which it curls into a leg-sized snare. It clamps shut as soon as its prey steps on it, allowing it to feed with ease."),
                List.of(new EvolutionEntry("hangrove", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,5),
                        new MoveLearnSetEntry(Move.VINE_WHIP,8),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.STUN_SPORE,15),
                        new MoveLearnSetEntry(Move.GROWTH,17),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,22),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,25)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 6, 26, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tangrue");

    }


}
