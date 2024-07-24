package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Foxsye extends drai.dev.data.pokemon.Pokemon {
    public Foxsye() {
        super("Foxsye",
                Type.FAIRY,
                new Stats(40,
                        60,
                        45,
                        70,
                        50,
                        65),
                List.of(Ability.PERCEIVE), Ability.INFILTRATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The mystical orb it holds possesses a magical power that allows them to see through deception and trickery. It seeks out for the truth. Eye contact with a Foxsye will urge you to spill your secrets."),
                List.of(new EvolutionEntry("veroxifye", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(new MoveLearnSetEntry(Move.CONFIDE,1),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,12),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,15),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,19),
                        new MoveLearnSetEntry(Move.PIXIEDUST,22),
                        new MoveLearnSetEntry(Move.REVENGE,26),
                        new MoveLearnSetEntry(Move.FLATTER,30),
                        new MoveLearnSetEntry(Move.PIXIEPUNCH,34),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,39),
                        new MoveLearnSetEntry(Move.SUPERPOWER,45),
                        new MoveLearnSetEntry(Move.TRICK,50),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,55)                ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 26, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Foxsye");

    }


}
