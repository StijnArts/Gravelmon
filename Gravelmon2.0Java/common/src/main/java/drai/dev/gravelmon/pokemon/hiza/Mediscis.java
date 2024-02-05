package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mediscis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mediscis() {
        super("Mediscis",
                Type.WATER,Type.POISON,
                new Stats(75,
                        90,
                        75,
                        80,
                        75,
                        90),
                List.of(Ability.POISON_POINT), Ability.WEAK_ARMOR,
                15, 165,
                new Stats(0,1,0,0,0,1), 50,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its hollow body is full of venom which it injects on those it stabs with its snout. While this venom by itself is dangerous, it can be used to treat other kinds of venomous bites."),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.FELL_STINGER,12),
                        new MoveLearnSetEntry(Move.MINIMIZE,16),
                        new MoveLearnSetEntry(Move.SPIKES,20),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.POISON_JAB,28),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,32),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,36),
                        new MoveLearnSetEntry(Move.SPIT_UP,40),
                        new MoveLearnSetEntry(Move.STOCKPILE,40),
                        new MoveLearnSetEntry(Move.TOXIC,44),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,48),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,52),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,56)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 23, 54, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
