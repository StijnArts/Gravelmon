package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Drenchest extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drenchest() {
        super("Drenchest",
                Type.GHOST, Type.DARK,
                new Stats(102,
                        114,
                        100,
                        70,
                        63,
                        41),
                List.of(Ability.JACKPOT,Ability.STEELWORKER,Ability.CURSED_BODY), Ability.CURSED_BODY,
                10, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("Expeditions to find its hoard of valuables invariably end in disaster. Some say they form from the souls of pirates who lost everything trying to strike it rich."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.HEX,25),
                        new MoveLearnSetEntry(Move.NUGGETFLING,30),
                        new MoveLearnSetEntry(Move.GRUDGE,35),
                        new MoveLearnSetEntry(Move.CRUNCH,40),
                        new MoveLearnSetEntry(Move.SOULCHOMP,47),
                        new MoveLearnSetEntry(Move.GOLD_BREAKER,55)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 11, 34, 5.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.SHIP_WRECK),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
