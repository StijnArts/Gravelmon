package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Leukofite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Leukofite() {
        super("Leukofite",
                Type.FIGHTING, Type.FLYING,
                new Stats(60,
                        80,
                        60,
                        100,
                        140,
                        80),
                List.of(Ability.IMMUNITY,Ability.LIQUID_OOZE,Ability.POISON_HEAL), Ability.POISON_HEAL,
                8, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It can see bacteria and viruses on any surface, sending it into an outrage. Anything it deems unclean is drowned in its slime."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.TAUNT,8),
                        new MoveLearnSetEntry(Move.FLATTER,12),
                        new MoveLearnSetEntry(Move.LOW_KICK,16),
                        new MoveLearnSetEntry(Move.VENOSHOCK,20),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,24),
                        new MoveLearnSetEntry(Move.SWAGGER,28),
                        new MoveLearnSetEntry(Move.POISON_JAB,32),
                        new MoveLearnSetEntry(Move.TOXIC,36),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,40),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,44),
                        new MoveLearnSetEntry(Move.BELCH,48)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 22, 42, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Leukofite");

    }


}
