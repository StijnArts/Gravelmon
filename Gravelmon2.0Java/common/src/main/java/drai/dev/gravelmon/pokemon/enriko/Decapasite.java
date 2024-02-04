package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Decapasite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Decapasite() {
        super("Decapasite",
                Type.BUG,Type.GHOST,
                new Stats(90,
                        50,
                        110,
                        80,
                        90,
                        80),
                List.of(Ability.UNNERVE,Ability.LEVITATE), Ability.POWERLEECH,
                14, 165,
                new Stats(0,0,0,0,0,0), 65,
                0.5,
                160, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.BUG),
                List.of("Decapasite's venom is sterile, which prevents the head it lives in from rotting. They lure in prey with odd signals before injecting eggs into them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.INFESTATION,28),
                        new MoveLearnSetEntry(Move.PROTECT,32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,44),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,56),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 42, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
