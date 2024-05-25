package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Chewmunk extends Pokemon {
    public Chewmunk() {
        super("Chewmunk",
                Type.NORMAL,
                new Stats(30,
                        60,
                        25,
                        30,
                        40,
                        65),
                List.of(Ability.CHEEK_POUCH, Ability.PICKUP), Ability.GLUTTONY,
                4, 55,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.FAIRY),
                List.of("Chewmunk are prolific enough to have established a firm population in Kaskade's cities. Their friendly attitude towards people is a trait of a desirable pet, but their need to constantly shave their teeth by chewing makes them difficult pets."),
                List.of(new EvolutionEntry("cheekat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.BITE,5),
                        new MoveLearnSetEntry(Move.STUFF_CHEEKS,10),
                        new MoveLearnSetEntry(Move.SPIT_UP,15),
                        new MoveLearnSetEntry(Move.STOCKPILE,15),
                        new MoveLearnSetEntry(Move.SWALLOW,15),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.REST,25),
                        new MoveLearnSetEntry(Move.COUNTER,30),
                        new MoveLearnSetEntry(Move.BULLET_SEED,35),
                        new MoveLearnSetEntry(Move.SUPER_FANG,40),
                        new MoveLearnSetEntry(Move.BELCH,45),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
