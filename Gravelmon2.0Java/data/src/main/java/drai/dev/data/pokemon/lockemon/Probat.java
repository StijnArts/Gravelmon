package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Probat extends Pokemon {
    public Probat() {
        super("Probat",
                Type.PSYCHIC, Type.FLYING,
                new Stats(85,
                        60,
                        75,
                        105,
                        80,
                        130),
                List.of(Ability.SURVEILLANCE, Ability.SOUNDPROOF), Ability.ECHOLOCATION,
                13, 1221,
                new Stats(0,0,0,0,0,3), 90,
                0.5,
                241, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.PSYCHIC,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.TOXIC,1),
                        new MoveLearnSetEntry(Move.POISON_FANG,15),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,20),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,27),
                        new MoveLearnSetEntry(Move.BITE,34),
                        new MoveLearnSetEntry(Move.HAZE,41),
                        new MoveLearnSetEntry(Move.PSYSHOCK,48),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,55),
                        new MoveLearnSetEntry(Move.AIR_SLASH,62),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,69),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.GUST,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST, Biome.IS_GRASSLAND, Biome.IS_HILLS, Biome.IS_JUNGLE, Biome.IS_SKY, Biome.IS_SWAMP)
    .setAntiBiomes(Biome.IS_SPOOKY, Biome.IS_FREEZING)
    .canSeeSky()
    .isNotRaining()
    .atNight()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanFly(true);
        addAdditionalEvolution("golbat", new EvolutionEntry("probat", EvolutionType.ITEM_INTERACT, false, List.of(new MoveLearnSetEntry(Move.PSYCHIC, "")),
                List.of(),List.of(),"gravelmon:amaze_drive"));
    }
}
