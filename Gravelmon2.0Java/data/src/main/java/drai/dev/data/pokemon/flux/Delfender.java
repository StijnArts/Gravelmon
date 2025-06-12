package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Delfender extends Pokemon {
    public Delfender() {
        super("Delfender",
                Type.WATER,
                new Stats(69,
                        50,
                        43,
                        50,
                        43,
                        60),
                List.of(Ability.TORRENT), Ability.MOXIE,
                12, 396,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.MONSTER),
                List.of("The tanks on its shoulders can store water as well as air. This allows it to navigate many environments. It has a helpful and brave personality."),
                List.of(new EvolutionEntry("hydrocean", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.FLIP_TURN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,20),
                        new MoveLearnSetEntry(Move.FROST_BREATH,26),
                        new MoveLearnSetEntry(Move.LIQUIDATION,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,37),
                        new MoveLearnSetEntry(Move.SAFEGUARD,42),
                        new MoveLearnSetEntry(Move.SUPERPOWER,48),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
