package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanCherubi extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanCherubi(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanCherubi",
                Type.GRASS,Type.POISON,
                new Stats(45,
                        35,
                        45,
                        35,
                        80,
                        53),
                List.of(Ability.CHLOROPHYLL), null,
                4, 33,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("La pequeña esfera, dulce y sabrosa, contiene los nutrientes necesarios para evolucionar."),
                List.of(new EvolutionEntry("cherrim africanusan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.ACID,10),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.VENOSHOCK,22),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,37),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,19),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.SLUDGE,31),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"egg"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"egg"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"egg")                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 31, 4.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cherubi");

    }


}
