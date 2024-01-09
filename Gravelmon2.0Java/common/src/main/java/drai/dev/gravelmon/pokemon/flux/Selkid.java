package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Selkid extends Pokemon {
    public Selkid() {
        super("Selkid",
                Type.WATER, Type.FAIRY,
                new Stats(50,
                        35,
                        45,
                        70,
                        51,
                        54),
                List.of(Ability.CUTE_CHARM, Ability.SWIFT_SWIM), Ability.PIXILATE,
                4, 155,
                new Stats(0,0,0,1,0,0), 180,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.HUMAN_LIKE),
                List.of("They gather together on rocky shoals and sing together in harmony. Their human-like voices can be misleading because they sound like a child."),
                List.of(new EvolutionEntry("syrentide", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
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
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,57),
                        new MoveLearnSetEntry(Move.SOAK,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.CORAL_BREAK,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_BEACH))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
