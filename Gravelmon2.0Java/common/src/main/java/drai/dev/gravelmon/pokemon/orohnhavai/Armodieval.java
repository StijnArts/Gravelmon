package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Armodieval extends drai.dev.gravelmon.pokemon.Pokemon {
    public Armodieval() {
        super("Armodieval",
                Type.STEEL,
                new Stats(95,
                        75,
                        200,
                        55,
                        60,
                        35),
                List.of(Ability.STURDY,Ability.IRON_BARBS,Ability.HEATPROOF), Ability.HEATPROOF,
                8, 165,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                195, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Known also in the medieval times of the Pokemon world, Armodieval would protect and stand guard in a castle with its ultimate defense. Its unbreakable shield is made of solid titanium and can stop even the most powerful blast."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.HARDEN,5),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,15),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,25),
                        new MoveLearnSetEntry(Move.BLOCK,30),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,35),
                        new MoveLearnSetEntry(Move.DETECT,40),
                        new MoveLearnSetEntry(Move.METAL_SOUND,46),
                        new MoveLearnSetEntry(Move.METAL_BURST,52),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,58),
                        new MoveLearnSetEntry(Move.GYRO_BALL,64)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Armodieval");

    }


}
