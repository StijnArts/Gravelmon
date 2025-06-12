package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianLuvdisc extends drai.dev.data.pokemon.Pokemon {
    public HizianLuvdisc(String name, Aspect aspect) {
        super(name, aspect, "Luvdisc",
                Type.GHOST, Type.WATER,
                new Stats(43,
                        30,
                        45,
                        50,
                        65,
                        97),
                List.of(Ability.HYDRATION), Ability.HUSTLE,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                60, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its said to appear to those who lost their loved ones. Its sight was dreaded by sailors with family at home."),
                List.of(new EvolutionEntry("luvanguish", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,4),
                        new MoveLearnSetEntry(Move.AGILITY,7),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,9),
                        new MoveLearnSetEntry(Move.SPITE,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.SING,20),
                        new MoveLearnSetEntry(Move.NIGHTMARE,21),
                        new MoveLearnSetEntry(Move.HEART_STAMP,22),
                        new MoveLearnSetEntry(Move.FLAIL,26),
                        new MoveLearnSetEntry(Move.GRUDGE,31),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,34),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,37),
                        new MoveLearnSetEntry(Move.AQUA_RING,40),
                        new MoveLearnSetEntry(Move.SOAK,42),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,49)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SPOOKY)
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Luvdisc");
            setCanBreathUnderwater(true);
            setAvoidsLand(true);
            setCanSwim(true);
    }


}
