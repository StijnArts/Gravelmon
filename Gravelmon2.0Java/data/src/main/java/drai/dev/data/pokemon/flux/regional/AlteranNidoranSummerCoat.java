package drai.dev.data.pokemon.flux.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AlteranNidoranSummerCoat extends Pokemon {
    public AlteranNidoranSummerCoat(String name, Aspect aspect) {
        super(name, aspect,"AlteranNidoranSummerCoat",
                Type.GROUND,
                new Stats(46, 52,42,40,40,55),
                List.of(Ability.SAND_VEIL, Ability.SAND_RUSH), Ability.ADAPTABILITY,
                5, 90,
                new Stats(1,0,0,0,0,1), 200,
                1,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                List.of("An old lineage of NIDORAN. The males and females look alike, but come in two distinct coats. Its dark coat blends in with dry, rugged terrain."),
                List.of(new EvolutionEntry("nidorimesummercoat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")), List.of(Aspect.SUMMER))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DUST_KICK,5),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,10),
                        new MoveLearnSetEntry(Move.MUD_SHOT,15),
                        new MoveLearnSetEntry(Move.SANDSTORM,20),
                        new MoveLearnSetEntry(Move.BULLDOZE,25),
                        new MoveLearnSetEntry(Move.DRILL_RUN,30),
                        new MoveLearnSetEntry(Move.QUASH,35),
                        new MoveLearnSetEntry(Move.SPIKES,40),
                        new MoveLearnSetEntry(Move.SWAGGER,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,50),
                        new MoveLearnSetEntry(Move.FISSURE,55),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"egg")
                ),
                List.of(Label.GEN1,Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Nidoran");
    }
}
