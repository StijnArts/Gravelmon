package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Foaloch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Foaloch() {
        super("Foaloch",
                Type.WATER,Type.GRASS,
                new Stats(55,
                        55,
                        50,
                        45,
                        55,
                        50),
                List.of(Ability.GRASS_PELT,Ability.HYDRATION,Ability.RUN_AWAY), Ability.RUN_AWAY,
                12, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("It walks uneasily due to its young legs, so it spends most of its time in the water while its body strengthens. The lily pad on its back is buoyant and allows it to tread water without fear of drowning, though it tends to drift off if unattended."),
                List.of(new EvolutionEntry("neyloch", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(      new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.MIST,9),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,18),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,24),
                        new MoveLearnSetEntry(Move.LEECH_SEED,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,36),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,50),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,57),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,64)),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 6, 27, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WINTER,Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
