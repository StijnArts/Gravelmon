package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Atomite extends Pokemon {
    public Atomite() {
        super("Atomite",
                Type.NORMAL, Type.ELECTRIC,
                new Stats(16, 20, 30, 84, 30, 100),
                List.of(Ability.LIGHTNING_ROD, Ability.ECCENTRIC), Ability.ADAPTABILITY,
                1, 1,
                new Stats(0,0,0,0,0,1), 180,
                -1,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Atomite is the smallest known Pokemon. Sometimes a big group of Atomite will group together to mimic the shape of something else."),
                List.of(new EvolutionEntry("orbatom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "36")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,2),
                        new MoveLearnSetEntry(Move.MINIMIZE,6),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,10),
                        new MoveLearnSetEntry(Move.AGILITY,14),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,15),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,19),
                        new MoveLearnSetEntry(Move.SWIFT,23),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,27),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,28),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,32),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,36),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,40),
                        new MoveLearnSetEntry(Move.SINGULARITY,41),
                        new MoveLearnSetEntry(Move.DISCHARGE,45),
                        new MoveLearnSetEntry(Move.OVERDRIVE,49),
                        new MoveLearnSetEntry(Move.LOCKON,53),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,54),
                        new MoveLearnSetEntry(Move.ATOM_SPLIT,58),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:spider_eye",90, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        
    }
}
