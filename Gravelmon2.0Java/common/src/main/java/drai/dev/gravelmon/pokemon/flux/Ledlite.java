package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Ledlite extends Pokemon {
    public Ledlite() {
        super("Ledlite",
                Type.ELECTRIC,
                new Stats(45,
                        36,
                        45,
                        36,
                        72,
                        27),
                List.of(Ability.ILLUMINATE, Ability.PLUS), Ability.VOLT_ABSORB,
                4, 30,
                new Stats(0,0,0,0,1,0), 200,
                -1,
                53, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("When it draws in electric current through its tail, its head starts glowing. It can stay lit for a whole month on an hour's worth of charge."),
                List.of(new EvolutionEntry("insulatex", EvolutionType.LEVEL_UP, false, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "26")))),
                List.of(
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 3, 22, 20, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
