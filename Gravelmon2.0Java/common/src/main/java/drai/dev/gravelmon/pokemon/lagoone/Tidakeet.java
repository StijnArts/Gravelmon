package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tidakeet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tidakeet() {
        super("Tidakeet",
                Type.PSYCHIC, Type.WATER,
                new Stats(40,
                        35,
                        35,
                        80,
                        90,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 150,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(new EvolutionEntry("bumpnotic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.WRIGGLE,5),
                        new MoveLearnSetEntry(Move.YAWN,9),
                        new MoveLearnSetEntry(Move.PSYBEAM,13),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.AQUA_RING,23),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,27),
                        new MoveLearnSetEntry(Move.LIFE_DEW,31),
                        new MoveLearnSetEntry(Move.BEAK_BLAST,36),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,41),
                        new MoveLearnSetEntry(Move.EARTH_POWER,45),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,49),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,54),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,59)           ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tidakeet");

    }


}
