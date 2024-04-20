package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Reptide extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reptide() {
        super("Reptide",
                Type.WATER, Type.PSYCHIC,
                new Stats(100,
                        80,
                        90,
                        100,
                        100,
                        100),
                List.of(Ability.TORRENT), Ability.MAGIC_BOUNCE,
                16, 165,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                224, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It is manipulative, commanding fish Pokemon to work as toadies for it. The pearls adorning its body focus its psychic energy into powerful beams."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,8),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,16),
                        new MoveLearnSetEntry(Move.PSYBEAM,19),
                        new MoveLearnSetEntry(Move.AQUA_RING,21),
                        new MoveLearnSetEntry(Move.CRUNCH,25),
                        new MoveLearnSetEntry(Move.CALM_MIND,28),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,46),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,50),
                        new MoveLearnSetEntry(Move.STORED_POWER,64),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,90)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
