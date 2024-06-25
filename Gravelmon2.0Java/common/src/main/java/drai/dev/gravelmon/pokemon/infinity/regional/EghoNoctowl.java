package drai.dev.gravelmon.pokemon.infinity.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class EghoNoctowl extends Pokemon {
    public EghoNoctowl(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"EghoNoctowl",
                Type.DARK, Type.FLYING,
                new Stats(86, 50, 77, 99, 70, 70),
                List.of(Ability.UNNERVE), Ability.NO_GUARD,
                19, 498,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                155, ExperienceGroup.MEDIUM_FAST,
                70,
                39, List.of(EggGroup.FLYING),
                List.of("Noctowl use the crest on its head to reflect light into the eyes of its prey. On moonless nights, one may mistake the crest as the actual moon."),
                List.of(new EvolutionEntry("grimfowl", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,5),
                        new MoveLearnSetEntry(Move.CONFUSION,9),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,13),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,17),
                        new MoveLearnSetEntry(Move.NIGHTMARE,21),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,25),
                        new MoveLearnSetEntry(Move.SNARL,29),
                        new MoveLearnSetEntry(Move.AIR_SLASH,33),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,37),
                        new MoveLearnSetEntry(Move.MOONBLAST,41),
                        new MoveLearnSetEntry(Move.SNATCH,45),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,49),
                        new MoveLearnSetEntry(Move.ROOST,53),
                        new MoveLearnSetEntry(Move.DREAM_EATER,57),
                        new MoveLearnSetEntry(Move.HURRICANE,62),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,66),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.PLUCK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DEFOG,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.ROOST,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"egg"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg")
                        ),
                List.of(Label.INFINITY, Label.GEN2),
                4, List.of(
                        new ItemDrop("minecraft:egg",50, 1,2),
                        new ItemDrop("minecraft:feather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 20, 43, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.39, 0.3,
                List.of());
        this.setLangFileName("Noctowl");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanFly(true);
        //this.setBaseScale(1);
        //this.setHitbox(1,1.7);
        //this.setModeled(true);
    }
}
