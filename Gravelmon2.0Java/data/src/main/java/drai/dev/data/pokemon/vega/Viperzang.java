package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Viperzang extends Pokemon {
    public Viperzang() {
        super( "Viperzang",
                Type.NORMAL, Type.DARK,
                new Stats(80	,
                        125	,
                        75	,
                        65	,
                        75	,
                        105),
                List.of(Ability.IMMUNITY), Ability.TOXIC_BOOST,
                17, 623,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                184, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CROSS_POISON,1),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,8),
                        new MoveLearnSetEntry(Move.PURSUIT,12),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,15),
                        new MoveLearnSetEntry(Move.SLASH,19),
                        new MoveLearnSetEntry(Move.VENGEANCE,22),
                        new MoveLearnSetEntry(Move.POISON_JAB,26),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,29),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,33),
                        new MoveLearnSetEntry(Move.DETECT,36),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,40),
                        new MoveLearnSetEntry(Move.TAUNT,43),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,47),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,50),
                        new MoveLearnSetEntry(Move.DEVASTATE,54),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.VILE_VENOM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.CRYOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,"tutor"),
                        new MoveLearnSetEntry(Move.DISABLE,"tutor"),
                        new MoveLearnSetEntry(Move.FEINT,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,"tutor"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"tutor"),
                        new MoveLearnSetEntry(Move.FACADE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.SPIN_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.BOLD_BLAZE,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.SHARPSHOOT,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 19, 46, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        addAdditionalEvolution("zangoose", new EvolutionEntry("viperzang", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"seviper\""))));
        addAdditionalEvolution("zangoose", new EvolutionEntry("viperzang", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:dusk_stone"));
    }
}
