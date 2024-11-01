package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lukewran extends Pokemon {
    public Lukewran() {
        super("Lukewran",
                Type.FIRE, Type.STEEL,
                new Stats(81,
                        80,
                        96,
                        80,
                        96,
                        67),
                List.of(Ability.FLASH_FIRE), Ability.FLAME_BODY,
                8, 2048,
                new Stats(0,0,1,0,1,0), 6,
                -1,
                125, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("It lives deep in volcanic caverns. It is skilled at using its cross- shaped claws to fight."),
                List.of(new EvolutionEntry("heatran", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,8),
                        new MoveLearnSetEntry(Move.METAL_SOUND,15),
                        new MoveLearnSetEntry(Move.CRUNCH,22),
                        new MoveLearnSetEntry(Move.SCARY_FACE,29),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,36),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,43),
                        new MoveLearnSetEntry(Move.IRON_HEAD,50),
                        new MoveLearnSetEntry(Move.EARTH_POWER,57),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,64),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,71),
                        new MoveLearnSetEntry(Move.SWAGGER,78),
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,85),
                        new MoveLearnSetEntry(Move.ERUPTION,92),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor")
                        ),
                List.of(Label.VEGA, Label.LEGENDARY),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.00005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
