package drai.dev.data.pokemon.chaosinvestia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nidoranma extends drai.dev.data.pokemon.Pokemon {
    public Nidoranma() {
        super("Nidoranma",
                Type.POISON,
                new Stats(46,
                        57,
                        40,
                        50,
                        40,
                        40),
                List.of(Ability.POISON_POINT,Ability.RIVALRY), null,
                5, 90,
                new Stats(0,1,0,0,0,0), 235,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Es untersucht die Umgebung, indem es die Ohren spitzt und lauscht. Sein giftiges Horn schützt es."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_DRILL,45),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,37),
                        new MoveLearnSetEntry(Move.HELPING_HAND,25),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,9),
                        new MoveLearnSetEntry(Move.CAPTIVATE,43),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,19),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,21),
                        new MoveLearnSetEntry(Move.FLATTER,33),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,31),
                        new MoveLearnSetEntry(Move.POISON_STING,13),
                        new MoveLearnSetEntry(Move.AMNESIA,"egg"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSION,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.POISON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nidoranma");

    }


}
