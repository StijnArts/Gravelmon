package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shellance extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shellance() {
        super("Shellance",
                Type.WATER, Type.FIGHTING,
                new Stats(53,
                        80,
                        80,
                        45,
                        75,
                        67),
                List.of(Ability.SHELL_ARMOR,Ability.JUSTIFIED,Ability.LONG_REACH), Ability.LONG_REACH,
                15, 165,
                new Stats(0,1,1,0,0,0), 100,
                0.5,
                140, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("When it evolved, it became intelligent enough to create crude weapons out of seashells. It uses these to scare off anything that enters its territory."),
                List.of(new EvolutionEntry("aquarrior", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.AQUASLAP,5),
                        new MoveLearnSetEntry(Move.FORESIGHT,9),
                        new MoveLearnSetEntry(Move.FORCE_PALM,24),
                        new MoveLearnSetEntry(Move.ENSNARE,27),
                        new MoveLearnSetEntry(Move.TAUNT,30),
                        new MoveLearnSetEntry(Move.REVENGE,33),
                        new MoveLearnSetEntry(Move.WATERFALL,39),
                        new MoveLearnSetEntry(Move.REFRESH,43),
                        new MoveLearnSetEntry(Move.WRING_OUT,47),
                        new MoveLearnSetEntry(Move.BATON_PASS,51),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,57),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 28, 41, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
