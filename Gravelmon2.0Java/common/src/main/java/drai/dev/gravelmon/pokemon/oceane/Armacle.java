package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Armacle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Armacle() {
        super("Armacle",
                Type.GROUND,
                new Stats(40,
                        70,
                        90,
                        70,
                        40,
                        20),
                List.of(Ability.SKILL_LINK,Ability.MEGA_LAUNCHER,Ability.BOMBARDIER), Ability.BOMBARDIER,
                8, 165,
                new Stats(0,0,1,0,0,0), 220,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Armacle are never found alone. They attach themselves to the underside of boats, reefs, or even other Pokemon. When approached, they violently launch volleys of sand to defend their territory."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.HARDEN,7),
                        new MoveLearnSetEntry(Move.MUD_BOMB,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.BULLET_SEED,20),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.LOCKON,27),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,30),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,34),
                        new MoveLearnSetEntry(Move.SANDSHOT,38),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,51),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,56),
                        new MoveLearnSetEntry(Move.SNIPE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Armacle");

    }


}
