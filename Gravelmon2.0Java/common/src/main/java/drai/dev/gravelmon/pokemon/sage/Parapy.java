package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Parapy extends Pokemon {
    public Parapy() {
        super("Parapy",
                Type.BUG, Type.WATER,
                new Stats(60, 55, 70, 60, 55, 35),
                List.of(Ability.SHED_SKIN, Ability.ADAPTABILITY), Ability.TECHNICIAN,
                5, 123,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                67, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.WATER_2, EggGroup.BUG),
                List.of("Parapy grows inside the mouth of a fish and replaces the tongue of its host. It uses its host's body as a trojan horse, attacking unwitting prey as it swims by."),
                List.of(new EvolutionEntry("mawasite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_LIFE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,2),
                        new MoveLearnSetEntry(Move.TACKLE,5),
                        new MoveLearnSetEntry(Move.BUBBLE,10),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,12),
                        new MoveLearnSetEntry(Move.LICK,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.BUG_BITE,22),
                        new MoveLearnSetEntry(Move.AQUA_RING,25),
                        new MoveLearnSetEntry(Move.ICE_FANG,30),
                        new MoveLearnSetEntry(Move.STEAMROLLER,32),
                        new MoveLearnSetEntry(Move.WATER_PULSE,35),
                        new MoveLearnSetEntry(Move.POSSESSION,40),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,42),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,45),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,50),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.BRINE,"egg"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.SLASH,"egg"),
                        new MoveLearnSetEntry(Move.SOAK,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:string",50, 1,2)
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 4, 15, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_LUKEWARM)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_FRESHWATER))),
                List.of(SpawnPreset.UNDERWATER),
                0.3, 0.3,
                List.of());
        this.setAvoidsLand(true);
        this.setCanBreathUnderwater(true);
        this.setCanSwim(true);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
