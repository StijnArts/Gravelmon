package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Weeduck extends drai.dev.data.pokemon.Pokemon {
    public Weeduck() {
        super("Weeduck",
                Type.GRASS, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OVERGROW), Ability.OVERCOAT,
                11, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite having a beak, Weeduck is still able to whistle different tunes. The various melodies may cause a state of trance, even among its own and itself."),
                List.of(new EvolutionEntry("elegander", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHIRP,5),
                        new MoveLearnSetEntry(Move.SEEDSHOT,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,14),
                        new MoveLearnSetEntry(Move.BULLET_SEED,18),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,20),
                        new MoveLearnSetEntry(Move.WING_ATTACK,24),
                        new MoveLearnSetEntry(Move.BANANARANG,27),
                        new MoveLearnSetEntry(Move.WORRY_SEED,32),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,37),
                        new MoveLearnSetEntry(Move.TAILWIND,41),
                        new MoveLearnSetEntry(Move.AIR_SLASH,45),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,48),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,52),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,59)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
           setLangFileName("Weeduck");

    }


}
