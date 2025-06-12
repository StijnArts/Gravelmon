package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Platinux extends drai.dev.data.pokemon.Pokemon {
    public Platinux() {
        super("Platinux",
                Type.ELECTRIC, Type.STEEL,
                new Stats(87,
                        45,
                        86,
                        98,
                        76,
                        79),
                List.of(Ability.MEGA_LAUNCHER,Ability.SWIFT_SWIM), Ability.SHARPSHOOTER,
                19, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Electricity builds up on the surface of its snout over time, which it can release as a devastating concentrated bolt. When its bristly fur stands on end, it's a sign that it's fully charged and ready to attack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ZAP_CANNON,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,1),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,1),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.IRON_TAIL,1),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1),
                        new MoveLearnSetEntry(Move.DISCHARGE,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.EGG_BOMB,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1)
                ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 43, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Platinux");

    }


}
