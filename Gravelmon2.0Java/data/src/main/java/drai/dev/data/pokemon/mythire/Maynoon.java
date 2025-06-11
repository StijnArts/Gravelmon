package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Maynoon extends drai.dev.data.pokemon.Pokemon {
    public Maynoon() {
        super("Maynoon",
                Type.BUG, Type.FLYING,
                new Stats(70,
                        70,
                        50,
                        85,
                        50,
                        125),
                List.of(Ability.GALE_WINGS,Ability.CLOUD_NINE,Ability.SWIFTDODGE), Ability.SWIFTDODGE,
                12, 165,
                new Stats(0,0,0,0,0,2), 80,
                0.5,
                158, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It has the shortest period before evolution of any Pokemon. After congregating with others of its kind above the lake it was born in, it becomes dormant and falls into the water, all in the span of an hour."),
                List.of(new EvolutionEntry("nymphemeral", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(                 new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SOAK,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.GUST,17),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,22),
                        new MoveLearnSetEntry(Move.SCARY_FACE,22),
                        new MoveLearnSetEntry(Move.STUN_SPORE,26),
                        new MoveLearnSetEntry(Move.AIR_SLASH,32),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,38),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,44),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,52)),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_RIVER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setCanFly(true);

    }


}
