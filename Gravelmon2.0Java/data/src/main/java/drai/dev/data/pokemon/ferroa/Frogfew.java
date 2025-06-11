package drai.dev.data.pokemon.ferroa;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Frogfew extends drai.dev.data.pokemon.Pokemon {
    public Frogfew() {
        super("Frogfew",
                Type.WATER, Type.GRASS,
                new Stats(65,
                        75,
                        40,
                        70,
                        40,
                        50),
                List.of(Ability.STICKY_HOLD,Ability.HYDRATION), Ability.ADHESIVE,
                12, 165,
                new Stats(0,1,0,0,0,0), 225,
                0.5,
                68, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.WATER_2),
                List.of("Frogfew lays flat on the ground in swampy riverbanks, covered in mud and leaf litter except for its sweet-smelling lure. Its sticky body is sometimes stepped upon by unwary creatures too big to be prey, and so it ends up tracked along and somewhat irritated by the whole experience."),
                List.of(new EvolutionEntry("sundangler", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.ENDURE,8),
                        new MoveLearnSetEntry(Move.SNAP_TRAP,12),
                        new MoveLearnSetEntry(Move.POISON_POWDER,15),
                        new MoveLearnSetEntry(Move.MUD_SHOT,18),
                        new MoveLearnSetEntry(Move.FACEPLANT,21),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,24),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,27),
                        new MoveLearnSetEntry(Move.FLYTRAPFANG,31),
                        new MoveLearnSetEntry(Move.SCARY_FACE,35),
                        new MoveLearnSetEntry(Move.CRUNCH,39),
                        new MoveLearnSetEntry(Move.NATURESCALL,43),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,48),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,52),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,58),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
           setLangFileName("Frogfew");

    }


}
