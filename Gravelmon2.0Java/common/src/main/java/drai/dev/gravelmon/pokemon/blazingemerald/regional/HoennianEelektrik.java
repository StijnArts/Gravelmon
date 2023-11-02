package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class HoennianEelektrik extends Pokemon {
    public HoennianEelektrik(int dexNo) {
        super(dexNo,"HoennianEelektrik",
                Type.GROUND, Type.ELECTRIC,
                new Stats(50, 100, 40, 30, 80, 80),
                List.of(Ability.SHED_SKIN), Ability.SAND_VEIL,
                (int) (((9)*12+(6))*2.54), (int) (1543*0.4),
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                142, ExperienceGroup.SLOW,
                70,
                51,  List.of(EggGroup.AMORPHOUS),
                List.of("Through frequent shedding of it's skin, this Pokemon grows in size at an incredible rate. It devours sand and leaves behind rare minerals as waste"),
                List.of(new EvolutionEntry("hoennianeelektross", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.BITE,4),
                        new MoveLearnSetEntry(Move.SPARK,8),
                        new MoveLearnSetEntry(Move.WRAP,13),
                        new MoveLearnSetEntry(Move.MAGNITUDE,19),
                        new MoveLearnSetEntry(Move.DIG,26),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.BOLT_BLITZ,43),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.ELECTROBURST,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN5),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 40, 55, 0.7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.UNDERGROUND),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Eelektrik");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
