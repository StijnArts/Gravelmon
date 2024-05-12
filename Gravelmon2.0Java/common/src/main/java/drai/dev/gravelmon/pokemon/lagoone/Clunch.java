package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Clunch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clunch() {
        super("Clunch",
                Type.WATER,
                new Stats(40,
                        50,
                        90,
                        30,
                        40,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 60,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its real body is concealed inside a seashell. Due to its light body they will clamp on surfaces to not get carried by strong currents."),
                List.of(new EvolutionEntry("locklusk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(      new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.MUD_BOMB,1),
                        new MoveLearnSetEntry(Move.BULLET_SEED,1),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,1),
                        new MoveLearnSetEntry(Move.VICE_GRIP,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,4),
                        new MoveLearnSetEntry(Move.AQUA_JET,7),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,11),
                        new MoveLearnSetEntry(Move.METAL_CLAW,14),
                        new MoveLearnSetEntry(Move.LOCKON,17),
                        new MoveLearnSetEntry(Move.WATER_PULSE,21),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,25),
                        new MoveLearnSetEntry(Move.METAL_SOUND,29),
                        new MoveLearnSetEntry(Move.FLAME_BURST,34),
                        new MoveLearnSetEntry(Move.CRABHAMMER,38),
                        new MoveLearnSetEntry(Move.AGILITY,42),
                        new MoveLearnSetEntry(Move.SCALD,47),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,51),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,55),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,59)                  ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 6, 28, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Clunch");

    }


}
