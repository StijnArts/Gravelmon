package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snifae extends drai.dev.data.pokemon.Pokemon {
    public Snifae() {
        super("Snifae",
                Type.FAIRY,
                new Stats(50,
                        50,
                        40,
                        100,
                        115,
                        120),
                List.of(Ability.RUN_AWAY), Ability.PRANKSTER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Lusted after by enthusiasts and other mons alike for the thrill of the hunt. Snifae are mischievous and like to tease and trick those that pursue them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.CUDDLE,5),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.TRICK,15),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,21),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,27),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,36),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,40),
                        new MoveLearnSetEntry(Move.PSYSHOCK,44),
                        new MoveLearnSetEntry(Move.FAKE_OUT,49),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,53),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,59),
                        new MoveLearnSetEntry(Move.MOONBLAST,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snifae");

    }


}
