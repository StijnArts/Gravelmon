package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Douseidon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Douseidon() {
        super("Douseidon",
                Type.WATER, Type.PSYCHIC,
                new Stats(81,
                        71,
                        80,
                        109,
                        100,
                        89),
                List.of(Ability.TORRENT), Ability.TRACE,
                16, 430,
                new Stats(0,0,0,2,1,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("A sonar wave can be beamed from its crest stopping and paralysing its opponents. They are very distrustful of others making very difficult to get along with."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.SUPERSONIC,9),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.PSYWAVE,15),
                        new MoveLearnSetEntry(Move.SWIFT,19),
                        new MoveLearnSetEntry(Move.WATER_PULSE,24),
                        new MoveLearnSetEntry(Move.PSYBEAM,28),
                        new MoveLearnSetEntry(Move.AQUA_RING,31),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,35),
                        new MoveLearnSetEntry(Move.AGILITY,39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,44),
                        new MoveLearnSetEntry(Move.STARSTREAM,48),
                        new MoveLearnSetEntry(Move.SOAK,52),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,58)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Douseidon");

    }


}
