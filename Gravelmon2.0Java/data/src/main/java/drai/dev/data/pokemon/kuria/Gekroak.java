package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gekroak extends drai.dev.data.pokemon.Pokemon {
    public Gekroak() {
        super("Gekroak",
                Type.WATER, Type.SOUND,
                new Stats(64,
                        62,
                        72,
                        91,
                        62,
                        64),
                List.of(Ability.TORRENT), Ability.REVERB,
                10, 205,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                155, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("While sometimes found to be mischievous, Gekroak are typically seen as guards of their territory. Each section of the swamp sounds slightly different, this is how you tell which Gekroak own what territory."),
                List.of(new EvolutionEntry("sennitoad", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,16),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,19),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,28),
                        new MoveLearnSetEntry(Move.SKULL_BASH,33),
                        new MoveLearnSetEntry(Move.IRON_HEAD,36),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,40),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,44)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Gekroak");

    }


}
