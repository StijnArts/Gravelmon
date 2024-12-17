package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanSwirlix extends drai.dev.data.pokemon.Pokemon {
    public VesitanSwirlix(String name, Aspect aspect) {
        super(name, aspect, "VesitanSwirlix",
                Type.FAIRY,Type.NORMAL,
                new Stats(62,
                        58,
                        66,
                        51,
                        59,
                        54),
                List.of(Ability.SWEET_VEIL,Ability.UNBURDEN), null,
                4, 35,
                new Stats(0,0,1,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Es stößt weiße Fäden aus, die so süß und klebrig wie Zuckerwatte sind, sich jedoch in Sekunden entzünden lassen."),
                List.of(new EvolutionEntry("slurpuff vesitan", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_SPIN,10),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,17),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,36),
                        new MoveLearnSetEntry(Move.ROUND,13),
                        new MoveLearnSetEntry(Move.SAFEGUARD,67),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,41),
                        new MoveLearnSetEntry(Move.ENDEAVOR,21),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,31),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,58),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,24),
                        new MoveLearnSetEntry(Move.WISH,45),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,26),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.PLAY_NICE,8),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,49),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"egg"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                        new MoveLearnSetEntry(Move.COPYCAT,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 24, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Swirlix");

    }


}
