package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fungusite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fungusite() {
        super("Fungusite",
                Type.POISON,
                new Stats(50,
                        50,
                        40,
                        40,
                        90,
                        50),
                List.of(Ability.REGENERATOR), Ability.POISON_TOUCH,
                4, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("This Pokémon controls its host's every move. It uses its disguise to enter its host's habitat unnoticed and spread itself to other Pokémon."),
                List.of(new EvolutionEntry("controll", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ACID,4),
                        new MoveLearnSetEntry(Move.HYPNOSIS,8),
                        new MoveLearnSetEntry(Move.LEECH_SEED,11),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.SLUDGE,18),
                        new MoveLearnSetEntry(Move.TAUNT,22),
                        new MoveLearnSetEntry(Move.BEAT_UP,25),
                        new MoveLearnSetEntry(Move.SCARY_FACE,29),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,36),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,39),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,43),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,46),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fungusite");

    }


}
