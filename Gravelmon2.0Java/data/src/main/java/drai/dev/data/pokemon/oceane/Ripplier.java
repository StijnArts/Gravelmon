package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ripplier extends drai.dev.data.pokemon.Pokemon {
    public Ripplier() {
        super("Ripplier",
                Type.STEEL,
                new Stats(60,
                        90,
                        51,
                        60,
                        65,
                        79),
                List.of(Ability.TEMPER), Ability.STEADFAST,
                9, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                141, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(new EvolutionEntry("swordier", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(          new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,15),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.AQUA_JET,25),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,30),
                        new MoveLearnSetEntry(Move.IRON_HEAD,35),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,40),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,45),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,50),
                        new MoveLearnSetEntry(Move.IRON_TAIL,55),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,60),
                        new MoveLearnSetEntry(Move.PAYBACK,65)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .setAntiBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
