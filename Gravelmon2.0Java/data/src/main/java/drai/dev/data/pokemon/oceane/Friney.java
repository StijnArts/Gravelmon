package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Friney extends drai.dev.data.pokemon.Pokemon {
    public Friney() {
        super("Friney",
                Type.STEEL,
                new Stats(50,
                        60,
                        35,
                        50,
                        50,
                        60),
                List.of(Ability.TEMPER), Ability.STEADFAST,
                4, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Friney's tapered, aerodynamic body makes it an excellent swimmer. They love to challenge other Pokemon to races, effortlessly taking advantage of the ocean currents to gain the upper hand."),
                List.of(new EvolutionEntry("ripplier", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
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
                ), new PokemonSpawnDataBuilder(1)
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
