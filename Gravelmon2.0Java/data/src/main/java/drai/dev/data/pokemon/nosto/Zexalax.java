package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Zexalax extends drai.dev.data.pokemon.Pokemon {
    public Zexalax() {
        super("Zexalax",
                Type.ELECTRIC, Type.DARK,
                new Stats(75,
                        60,
                        100,
                        120,
                        100,
                        50),
                List.of(Ability.LEVITATE), Ability.ILLUMINATE,
                15, 165,
                new Stats(0,0,0,3,0,0), 90,
                0.5,
                177, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("Specialised cords connect each unit together, forming one collective mind. A strong electrical field surrounds them. Anything that breaches that field will be shocked with huge amounts of electricity."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.FLASH,4),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,8),
                        new MoveLearnSetEntry(Move.SNARL,12),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,17),
                        new MoveLearnSetEntry(Move.CHARGE,22),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,27),
                        new MoveLearnSetEntry(Move.PAYBACK,33),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,37),
                        new MoveLearnSetEntry(Move.DISCHARGE,44),
                        new MoveLearnSetEntry(Move.DARK_PULSE,49),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,53),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,58),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,62)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 39, 54, .3, List.of(
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
