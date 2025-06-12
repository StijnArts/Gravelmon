package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nyaqua extends drai.dev.data.pokemon.Pokemon {
    public Nyaqua() {
        super("Nyaqua",
                Type.WATER,
                new Stats(48,
                        25,
                        25,
                        65,
                        55,
                        65),
                List.of(Ability.DAMP,Ability.HYDRATION), Ability.SWIFT_SWIM,
                3, 71,
                new Stats(1,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("whiskereef", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(       new MoveLearnSetEntry(Move.FLIP_TURN,1),
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
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52)                 ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Nyaqua");

    }


}
