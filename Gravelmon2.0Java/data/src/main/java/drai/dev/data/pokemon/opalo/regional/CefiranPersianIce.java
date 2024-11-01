package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranPersianIce extends Pokemon {
    public CefiranPersianIce(String name, Aspect aspect) {
        super(name, aspect,"CefiranPersianIce",
                Type.NORMAL, Type.ICE,
                new Stats(80,105,65,115,60,65),
                List.of(Ability.TOUGH_CLAWS), Ability.TECHNICIAN,
                10, 320,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of("A Persian's six bold whiskers sense air movements to determine what is in its vicinity. It becomes docile if grabbed by the whiskers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWITCHEROO, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 1),
                        new MoveLearnSetEntry(Move.EMBER, 6),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 14),
                        new MoveLearnSetEntry(Move.SCREECH, 17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 22),
                        new MoveLearnSetEntry(Move.TAUNT, 25),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 28),
                        new MoveLearnSetEntry(Move.ICE_FANG, 33),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 38),
                        new MoveLearnSetEntry(Move.HONE_CLAWS, 44),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 47),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 53),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 56),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE, 61),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH, 68),
                        new MoveLearnSetEntry(Move.AMNESIA, "egg"),
                        new MoveLearnSetEntry(Move.ASSIST, "egg"),
                        new MoveLearnSetEntry(Move.CHARM, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS, "egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "egg"),
                        new MoveLearnSetEntry(Move.RETURN, "egg"),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH, "egg"),
                        new MoveLearnSetEntry(Move.PUNISHMENT, "egg"),
                        new MoveLearnSetEntry(Move.SNATCH, "egg"),
                        new MoveLearnSetEntry(Move.SPITE, "egg"),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, "egg")
                ),
                List.of(Label.OPAL, Label.GEN1),
                4, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 44, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_FOREST))),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Persian");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
