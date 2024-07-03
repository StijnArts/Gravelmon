package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Spikips extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spikips() {
        super("Spikips",
                Type.ROCK, Type.BUG,
                new Stats(60,
                        60,
                        80,
                        37,
                        80,
                        38),
                List.of(Ability.POISON_POINT), Ability.LIGHTNING_ROD,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.BUG),
                List.of("- String Shot Bug - Jab Normal 7 Mud-Slap Ground 15 Poison Sting Poison 21 Thread LashSTAB Bug 29 Pin MissileSTAB Bug 36 Spikes Ground 42 Ancient PowerSTAB Rock 49 Spike Cannon Normal 54 Muddy Water Water 62 MegahornSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.POISON_STING,15),
                        new MoveLearnSetEntry(Move.THREADLASH,21),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,29),
                        new MoveLearnSetEntry(Move.SPIKES,36),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,42),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,49),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,54),
                        new MoveLearnSetEntry(Move.MEGAHORN,62),
                        new MoveLearnSetEntry(Move.CONFUSION,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spikips");

    }


}
