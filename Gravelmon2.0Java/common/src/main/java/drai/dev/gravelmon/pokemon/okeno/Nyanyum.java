package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nyanyum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nyanyum() {
        super("Nyanyum",
                Type.FAIRY,Type.NORMAL,
                new Stats(76,
                        37,
                        37,
                        40,
                        40,
                        55),
                List.of(Ability.SWEET_VEIL,Ability.PASTEL_VEIL,Ability.FRIEND_GUARD), Ability.FRIEND_GUARD,
                6, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.25,
                70, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Their fur is silky and has a glimmering appearance when under light. They wag their star-shaped tails during nights when the moon is full, and become lethargic when its not visible."),
                List.of(new EvolutionEntry("yummyan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"190")))),
                List.of(
                        new MoveLearnSetEntry(Move.HAPPYSLAP,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,4),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,7),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,10),
                        new MoveLearnSetEntry(Move.ENCORE,14),
                        new MoveLearnSetEntry(Move.CUDDLE,18),
                        new MoveLearnSetEntry(Move.SWEET_KISS,21),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,25),
                        new MoveLearnSetEntry(Move.METRONOME,30),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,34),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,39),
                        new MoveLearnSetEntry(Move.DECORATE,44),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,48),
                        new MoveLearnSetEntry(Move.SWEETDECAY,53),
                        new MoveLearnSetEntry(Move.SING,"tm"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"tm"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 32, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nyanyum");

    }


}
