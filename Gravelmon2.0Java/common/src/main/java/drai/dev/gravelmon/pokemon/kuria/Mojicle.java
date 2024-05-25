package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Mojicle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mojicle() {
        super("Mojicle",
                Type.WATER, Type.FAIRY,
                new Stats(55,
                        40,
                        50,
                        80,
                        86,
                        40),
                List.of(Ability.MADNESS,Ability.SWIFT_SWIM), Ability.TRACE,
                5, 85,
                new Stats(0,0,0,1,0,0), 190,
                0.25,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Mojicle like to show off their strange abilities in front of the whole ocean. The stripe on their head changes to suite their mood."),
                List.of(new EvolutionEntry("evercle", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,8),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,15),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,20),
                        new MoveLearnSetEntry(Move.CHARM,22),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,27),
                        new MoveLearnSetEntry(Move.LIFE_DEW,29),
                        new MoveLearnSetEntry(Move.BRINE,34),
                        new MoveLearnSetEntry(Move.CALM_MIND,36),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,41),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA,43),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,50),
                        new MoveLearnSetEntry(Move.PERISH_SONG,55),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,57)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 8, 27, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Mojicle");

    }


}
