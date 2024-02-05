package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Aampeel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aampeel() {
        super("Aampeel",
                Type.WATER,Type.ELECTRIC,
                new Stats(50,
                        50,
                        54,
                        105,
                        54,
                        147),
                List.of(Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                9, 165,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                157, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of("It travels underwater at incredibly high speed. Its electric discharges are capable of boiling the water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.WATER_GUN,11),
                        new MoveLearnSetEntry(Move.GLARE,15),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,18),
                        new MoveLearnSetEntry(Move.WATER_PULSE,22),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,27),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,34),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,39),
                        new MoveLearnSetEntry(Move.THUNDER,45)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 29, 48, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_REEF)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
