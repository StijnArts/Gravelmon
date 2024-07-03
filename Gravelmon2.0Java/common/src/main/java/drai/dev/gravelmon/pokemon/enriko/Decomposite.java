package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Decomposite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Decomposite() {
        super("Decomposite",
                Type.POISON, Type.DARK,
                new Stats(70,
                        115,
                        60,
                        60,
                        150,
                        75),
                List.of(Ability.REGENERATOR), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("Anything grabbed by its tentacles is instantly bended to its will. The husks of former hosts are arranged in its lair like trophies."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 43, 62, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Decomposite");

    }


}
