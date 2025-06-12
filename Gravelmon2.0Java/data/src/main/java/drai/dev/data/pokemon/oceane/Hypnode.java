package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hypnode extends drai.dev.data.pokemon.Pokemon {
    public Hypnode() {
        super("Hypnode",
                Type.PSYCHIC,
                new Stats(55,
                        45,
                        55,
                        85,
                        95,
                        70),
                List.of(Ability.PRANKSTER), Ability.ANTICIPATION,
                4, 165,
                new Stats(0,0,0,0,1,0), 235,
                0.5,
                142, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("The two attachments atop its head are constantly twitching and sensing the surroundings. It is incredibly shy and will teleport at the slightest opportunity."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,6),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,10),
                        new MoveLearnSetEntry(Move.BUBBLE,13),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,16),
                        new MoveLearnSetEntry(Move.PSYWAVE,19),
                        new MoveLearnSetEntry(Move.HELPING_HAND,23),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,27),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,31),
                        new MoveLearnSetEntry(Move.PSYCHIC,35),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,39),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,42),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,46),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,50),
                        new MoveLearnSetEntry(Move.HEALING_WISH,55)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 11, 34, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
