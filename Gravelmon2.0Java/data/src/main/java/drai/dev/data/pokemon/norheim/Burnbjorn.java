package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Burnbjorn extends drai.dev.data.pokemon.Pokemon {
    public Burnbjorn() {
        super("Burnbjorn",
                Type.FIRE, Type.NORMAL,
                new Stats(80,
                        113,
                        85,
                        84,
                        90,
                        80),
                List.of(Ability.BLAZE,Ability.TOUGH_CLAWS,Ability.SCRAPPY), Ability.SCRAPPY,
                21, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Surroudning the neck of a Burnbjorn is a collection of the finest honey, hardened and nearly unbreakable. This large Pokemon uses burst of fire sparingly due to its raw power and its care for the forests. Various Pokemon are attracted to the sweet smell of Burnbjorn, but it does not like to be bothered."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.ROAR,7),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,12),
                        new MoveLearnSetEntry(Move.ENCORE,15),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,18),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,23),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,26),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,29),
                        new MoveLearnSetEntry(Move.FRUSTRATION,34),
                        new MoveLearnSetEntry(Move.RETURN,34),
                        new MoveLearnSetEntry(Move.RECOVER,37),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,40),
                        new MoveLearnSetEntry(Move.AGILITY,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48),
                        new MoveLearnSetEntry(Move.HEAL_BELL,51),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,56)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Burnbjorn");

    }


}
