package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Belostoke extends drai.dev.data.pokemon.Pokemon {
    public Belostoke() {
        super("Belostoke",
                Type.FIRE,
                new Stats(70,
                        65,
                        90,
                        120,
                        65,
                        80),
                List.of(Ability.SNIPER,Ability.MAGMA_ARMOR,Ability.NEUTRALIZING_GAS), Ability.NEUTRALIZING_GAS,
                18, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It uses gusts of smog to smoke out its Bug Pokemon prey, then sucks them up by inhaling through its tiny mouth. The leftover shells of its prey are used as fuel to create more smoke."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.SMOKE_BOMB,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.INCINERATE,1),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,1),
                        new MoveLearnSetEntry(Move.FLAME_BURST,1),
                        new MoveLearnSetEntry(Move.LOCKON,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,1),
                        new MoveLearnSetEntry(Move.TOXIC_FUMES,1),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 45, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_NETHER_BASALT, Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NEAR_LAVA),
                0.28, 0.3,
                List.of());
           setLangFileName("Belostoke");

    }


}
