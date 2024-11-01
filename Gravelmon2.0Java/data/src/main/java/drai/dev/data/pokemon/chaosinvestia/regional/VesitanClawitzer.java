package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanClawitzer extends drai.dev.data.pokemon.Pokemon {
    public VesitanClawitzer(String name, Aspect aspect) {
        super(name, aspect, "VesitanClawitzer",
                Type.WATER,Type.STEEL,
                new Stats(78,
                        66,
                        92,
                        99,
                        120,
                        71),
                List.of(Ability.MEGA_LAUNCHER), null,
                13, 353,
                new Stats(0,0,0,0,2,0), 155,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("Aus seinen gewaltigen Scheren feuert es riesige Stahlkugeln ab, die ganze Klippen zum Einsturz bringen können."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DARK_PULSE,50),
                        new MoveLearnSetEntry(Move.BUBBLE,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,34),
                        new MoveLearnSetEntry(Move.FLAIL,16),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,66),
                        new MoveLearnSetEntry(Move.VICE_GRIP,9),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,32),
                        new MoveLearnSetEntry(Move.DOOM_DESIRE,57),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,40),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,72),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,1),
                        new MoveLearnSetEntry(Move.CRABHAMMER,30),
                        new MoveLearnSetEntry(Move.WATER_SPORT,7),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,25)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 44, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Clawitzer");

    }


}
