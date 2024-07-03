package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Alpacurrent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Alpacurrent() {
        super("Alpacurrent",
                Type.ELECTRIC, Type.NORMAL,
                new Stats(60,
                        110,
                        50,
                        85,
                        95,
                        90),
                List.of(Ability.LIGHTNING_ROD), Ability.FLUFFY,
                19, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("These intelligent Pokemon travel predominantly in herds, and are revered for their luxurious wool. Its high conductivity means that Alpacurrent attract lightning more than most Electric type Pokemon. As a consequence, it can't be kept in a barn."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,17),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,21),
                        new MoveLearnSetEntry(Move.STOMP,25),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,29),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,33),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.SPIT_UP,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,45),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,52),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,58)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_PLATEAU)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Alpacurrent");

    }


}
