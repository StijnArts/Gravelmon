package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class RapidashX  extends Pokemon {
    public RapidashX(String name, Aspect aspect) {
        super(name, aspect,"RapidashX",
                Type.FLYING,
                new Stats(65, 90, 70, 80, 80, 115),
                List.of(Ability.CLOUD_BURST), Ability.CLOUD_BURST,
                17, 900,
                new Stats(0,0,0,0,0,2), 60,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                26, List.of(EggGroup.XENO),
                List.of("A peaceful tempered X Pokemon. However, if it gets furious, it wraps itself in thunderclouds and triggers raging lightning storms."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUBSTITUTE,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.DISCHARGE,1),
                        new MoveLearnSetEntry(Move.THUNDER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.DEFOG,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,15),
                        new MoveLearnSetEntry(Move.AGILITY,20),
                        new MoveLearnSetEntry(Move.BOUNCE,25),
                        new MoveLearnSetEntry(Move.STOMP,30),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,43),
                        new MoveLearnSetEntry(Move.AIR_SLASH,49),
                        new MoveLearnSetEntry(Move.HURRICANE,56),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,63),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.FLASH,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN1),
                1, List.of(
                        new ItemDrop("gravelmon:xenolith",20, 1,1)),
                SpawnContext.GROUNDED, SpawnPool.RARE, 40, 56, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of(new PokemonForm("Storm", true,
                        Type.FLYING, Type.ELECTRIC,
                        new Stats(65, 80, 70, 140, 60, 145),
                        List.of(Ability.CLOUD_BURST), Ability.CLOUD_BURST,
                        17, 900,
                        new Stats(0,0,0,0,0,2), 60,
                        0.5,
                        175, ExperienceGroup.MEDIUM_FAST,
                        70,
                        26, List.of(EggGroup.XENO),
                        List.of(Aspect.STORM),
                        List.of("A peaceful tempered X Pokemon. However, if it gets furious, it wraps itself in thunderclouds and triggers raging lightning storms."),
                        List.of(),
                        List.of(
                        ),
                        List.of(Label.XENOVERSE, Label.GEN1),
                        0, List.of(
                        ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 56, 0.0000, List.of(
                                new BiomeSpawnCondition(List.of(Biome.IS_END))
                        ), List.of(),
                        List.of(SpawnPreset.NATURAL),
                        1.4, 0.3)));
        this.setLangFileName("Rapidash");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setModeled(true);
        this.setBaseScale(1.25);
        this.setHitbox(0.9,2);
        this.getForms().get(0).setHasSeparateModel(true);
    }
}
