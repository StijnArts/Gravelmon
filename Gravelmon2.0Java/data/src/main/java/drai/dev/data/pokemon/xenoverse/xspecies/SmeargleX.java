package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SmeargleX extends Pokemon {
    public SmeargleX(String name, Aspect aspect) {
        super(name, aspect,"SmeargleX",
                Type.FAIRY,
                new Stats(55, 20, 35, 20, 45, 75),
                List.of(Ability.IMMUNITY, Ability.SWEET_VEIL), Ability.STICKY_HOLD,
                12, 580,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                26, List.of(EggGroup.XENO),
                List.of("It produces a delicious low-calory cream, but it becomes rancid if not kept cool."),
                List.of(new EvolutionEntry("chientilly", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"gravelmon:xenolith")),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,3),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.SWEET_KISS,9),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,12),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,15),
                        new MoveLearnSetEntry(Move.FLAIL,18),
                        new MoveLearnSetEntry(Move.REFRESH,21),
                        new MoveLearnSetEntry(Move.CHARM,24),
                        new MoveLearnSetEntry(Move.WRING_OUT,28),
                        new MoveLearnSetEntry(Move.MILK_DRINK,32),
                        new MoveLearnSetEntry(Move.CREAM_WHIP,36),
                        new MoveLearnSetEntry(Move.PRESENT,39),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,43),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.BENEVOLENCE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN1),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 30, 43, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Smeargle");

    }
}
