package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tictoc extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tictoc() {
        super("Tictoc",
                Type.ELECTRIC,Type.PSYCHIC,
                new Stats(35,
                        20,
                        85,
                        85,
                        85,
                        30),
                List.of(Ability.ANTICIPATION,Ability.FOREWARN,Ability.CLEAR_BODY), Ability.CLEAR_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                1.0,
                85, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("An ancient Pokemon with impeccable foresight. It is impossible to get the upper hand on it, as it can read the future almost perfectly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.PROTECT,5),
                        new MoveLearnSetEntry(Move.CONFUSION,8),
                        new MoveLearnSetEntry(Move.HYPNOSIS,12),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,16),
                        new MoveLearnSetEntry(Move.SCREECH,18),
                        new MoveLearnSetEntry(Move.PSYBEAM,20),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,24),
                        new MoveLearnSetEntry(Move.METAL_BURST,28),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,32),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,36),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,40),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,44),
                        new MoveLearnSetEntry(Move.CALM_MIND,50),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,56),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tictoc");

    }


}
