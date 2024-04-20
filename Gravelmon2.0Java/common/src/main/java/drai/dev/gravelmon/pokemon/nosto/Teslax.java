package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Teslax extends drai.dev.gravelmon.pokemon.Pokemon {
    public Teslax() {
        super("Teslax",
                Type.ELECTRIC, Type.DARK,
                new Stats(30,
                        20,
                        40,
                        70,
                        40,
                        45),
                List.of(Ability.LEVITATE), Ability.ILLUMINATE,
                6, 165,
                new Stats(0,0,0,1,0,0), 235,
                0.5,
                49, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("Their bodies are almost completely transparent, making them extremely hard to find in daylight. At night, however, their multicoloured lights flicker beautifully."),
                List.of(new EvolutionEntry("zexalax", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.FLASH,4),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,8),
                        new MoveLearnSetEntry(Move.SNARL,12),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,17),
                        new MoveLearnSetEntry(Move.CHARGE,22),
                        new MoveLearnSetEntry(Move.LOCKON,27),
                        new MoveLearnSetEntry(Move.PAYBACK,33),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,37),
                        new MoveLearnSetEntry(Move.DISCHARGE,42),
                        new MoveLearnSetEntry(Move.DARK_PULSE,47),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,52)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 13, 35, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
