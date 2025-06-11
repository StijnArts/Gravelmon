package drai.dev.data.pokemon.varitas.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class VaritasianEelektrik extends drai.dev.data.pokemon.Pokemon {
    public VaritasianEelektrik(String name, Aspect aspect) {
        super(name, aspect,"Eelektrik",
                Type.GROUND, Type.WATER,
                new Stats(65,
                        85,
                        70,
                        75,
                        70,
                        40),
                List.of(Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                12, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                142, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It's so slippery that it can comfortably swim through muddy ground as if it's liquid. It swallows vast amounts of mud, absorbs any nutrients or plant matter in it and then spits up what's left."),
                List.of(new EvolutionEntry("VaritasianEelektross",EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_LIFE,1),
                        new MoveLearnSetEntry(Move.BIND,9),
                        new MoveLearnSetEntry(Move.ACID,19),
                        new MoveLearnSetEntry(Move.DIG,29),
                        new MoveLearnSetEntry(Move.WATER_PULSE,44),
                        new MoveLearnSetEntry(Move.COIL,54),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,59),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,64),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,69),
                        new MoveLearnSetEntry(Move.THRASH,74),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm")                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 39, 50, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER),
                List.of());
           setLangFileName("Eelektrik");
            setCanBreathUnderwater(true);
            setCanSwim(true);
            setAvoidsLand(true);
    }


}
