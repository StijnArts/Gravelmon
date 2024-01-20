package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Raccolossus extends Pokemon {
    public Raccolossus() {
        super("Raccolossus",
                Type.POISON, Type.DRAGON,
                new Stats(95,135,80,100,110,80),
                List.of(Ability.POISON_POINT, Ability.INTIMIDATE), Ability.MOXIE,
                21, 69,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                214, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.DRAGON),
                List.of("It's said that Raccane that evolve into Draccane have proven to their kind that they can provide for their family."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.BITE, 5),
                        new MoveLearnSetEntry(Move.HEADBUTT, 10),
                        new MoveLearnSetEntry(Move.POISON_FANG, 15),
                        new MoveLearnSetEntry(Move.ACID, 18),
                        new MoveLearnSetEntry(Move.SCARY_FACE, 20),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 23),
                        new MoveLearnSetEntry(Move.CRUNCH, 25),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, 31),
                        new MoveLearnSetEntry(Move.CROSS_POISON, 35),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 38),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, 41),
                        new MoveLearnSetEntry(Move.OUTRAGE, 50),
                        new MoveLearnSetEntry(Move.DOUBLE_EDGE, 55),

                        new MoveLearnSetEntry(Move.DEFENSE_CURL, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, "egg"),
                        new MoveLearnSetEntry(Move.THRASH, "egg"),
                        new MoveLearnSetEntry(Move.TWISTER, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 43, 67, 2.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
