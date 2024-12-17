package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kilokatta extends drai.dev.data.pokemon.Pokemon {
    public Kilokatta() {
        super("Kilokatta",
                Type.ELECTRIC, Type.DARK,
                new Stats(65,
                        96,
                        50,
                        112,
                        65,
                        100),
                List.of(Ability.GALVANIZE,Ability.LIGHTNING_ROD), Ability.ELECTRIC_SURGE,
                13, 0,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Theorized to have migrated from a faraway region, Kilokatta's body is like a lightning rod. They gather around the entrance of their dens to bask and gather electricity. During rainy seasons, they must be avoided at all cost."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.SCARY_FACE,10),
                        new MoveLearnSetEntry(Move.SHOVEOFF,14),
                        new MoveLearnSetEntry(Move.SWIFT,19),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,24),
                        new MoveLearnSetEntry(Move.DETECT,28),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,30),
                        new MoveLearnSetEntry(Move.TEAMUP,32),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,36),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,40),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,45),
                        new MoveLearnSetEntry(Move.SANDSHOT,49),
                        new MoveLearnSetEntry(Move.THUNDER,52),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.ASSIST,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,"tm"),
                        new MoveLearnSetEntry(Move.ZING_ZAP,"tm")                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 29, 45, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kilokatta");

    }


}
