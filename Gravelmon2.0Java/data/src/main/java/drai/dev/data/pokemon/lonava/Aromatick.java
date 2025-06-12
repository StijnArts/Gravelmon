package drai.dev.data.pokemon.lonava;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aromatick extends drai.dev.data.pokemon.Pokemon {
    public Aromatick() {
        super("Aromatick",
                Type.POISON,Type.BUG,
                new Stats(50,
                        55,
                        60,
                        40,
                        55,
                        45),
                List.of(Ability.POWERLEECH,Ability.POISON_TOUCH), Ability.SWARM,
                4, 2,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                50, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Disguising itself as a flower, Aromatick emits a sweet fragrance to lure in unsuspecting prey. Several diseases have been attributed to this Pokémon. As a result, many Lonavans refuse to wear shorts when walking through grass, even in Summer."),
                List.of(new EvolutionEntry("fragrantick", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.ABSORB,3),
                        new MoveLearnSetEntry(Move.POISON_STING,6),
                        new MoveLearnSetEntry(Move.STICKY_WEB,9),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,15),
                        new MoveLearnSetEntry(Move.INFESTATION,18),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,21),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,24),
                        new MoveLearnSetEntry(Move.BUG_BITE,27),
                        new MoveLearnSetEntry(Move.TOXIC,30),
                        new MoveLearnSetEntry(Move.HEMODRAIN,33),
                        new MoveLearnSetEntry(Move.POISON_JAB,36),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,39),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,42),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,48),
                        new MoveLearnSetEntry(Move.LUNGE,54),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.CROSS_POISON,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FEINT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIVEBITE,"tm"),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,"tm"),
                        new MoveLearnSetEntry(Move.GROWTH,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.TWINEEDLE,"tm")                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Aromatick");

    }


}
