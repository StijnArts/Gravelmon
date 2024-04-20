package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Crocoxic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crocoxic() {
        super("Crocoxic",
                Type.POISON, Type.WATER,
                new Stats(75,
                        91,
                        65,
                        88,
                        80,
                        91),
                List.of(Ability.STRONG_JAW), Ability.STRONG_JAW,
                17, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Its skin spills a toxin that causes a terrible burning sensation. It enjoys murky and poluted waters, where its the only creature capable of surviving."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.BITE,3),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,9),
                        new MoveLearnSetEntry(Move.WATER_GUN,12),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.DIVE,25),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,33),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.AQUA_JET,43),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,55),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,59),
                        new MoveLearnSetEntry(Move.TOXIC,68)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 37, 56, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
