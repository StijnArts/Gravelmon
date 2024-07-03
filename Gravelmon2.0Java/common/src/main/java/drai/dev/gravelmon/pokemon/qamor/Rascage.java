package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Rascage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rascage() {
        super("Rascage",
                Type.ELECTRIC, Type.POISON,
                new Stats(87,
                        60,
                        76,
                        80,
                        64,
                        42),
                List.of(Ability.STATIC), Ability.POISON_POINT,
                8, 165,
                new Stats(2,0,0,0,0,0), 180,
                0.5,
                151, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Rascage are easily startled and especially clumsy Pokemon, if it feels threatened it will shoot quills that not only shock its enemies with electricity but also inject them with venom. It stores its electricity in its fuzzy cheeks which is released from the quills on its back."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,8),
                        new MoveLearnSetEntry(Move.POISON_STING,12),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,15),
                        new MoveLearnSetEntry(Move.CHARGE,19),
                        new MoveLearnSetEntry(Move.VENOSHOCK,23),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,26),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,30),
                        new MoveLearnSetEntry(Move.SPIKES,36),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,39),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,42),
                        new MoveLearnSetEntry(Move.DISCHARGE,47),
                        new MoveLearnSetEntry(Move.BELCH,52),
                        new MoveLearnSetEntry(Move.STUNJAB,"tm"),
                        new MoveLearnSetEntry(Move.TWINEEDLE,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.NUZZLE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 9, 32, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rascage");

    }


}
