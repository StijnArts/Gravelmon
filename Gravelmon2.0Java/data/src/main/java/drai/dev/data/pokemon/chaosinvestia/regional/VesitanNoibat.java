package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanNoibat extends drai.dev.data.pokemon.Pokemon {
    public VesitanNoibat(String name, Aspect aspect) {
        super(name, aspect, "VesitanNoibat",
                Type.FLYING,Type.FAIRY,
                new Stats(44,
                        40,
                        45,
                        60,
                        45,
                        40),
                List.of(Ability.FRISK,Ability.INFILTRATOR), null,
                5, 80,
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Selbst ein gestandener Ringer geht bei den 200 000 Hz hohen Ultraschallwellen dieses Pokémon unweigerlich in die Knie."),
                List.of(new EvolutionEntry("yveltal vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,18),
                        new MoveLearnSetEntry(Move.HURRICANE,58),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SUPER_FANG,47),
                        new MoveLearnSetEntry(Move.AIR_SLASH,50),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,31),
                        new MoveLearnSetEntry(Move.GUST,11),
                        new MoveLearnSetEntry(Move.WING_ATTACK,16),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,5),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,36),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,15),
                        new MoveLearnSetEntry(Move.WHIRLWIND,42),
                        new MoveLearnSetEntry(Move.TAILWIND,33),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.ROOST,27),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,40),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 11, 34, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Noibat");

    }


}
