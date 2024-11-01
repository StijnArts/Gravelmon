package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Manticoeur extends Pokemon {
    public Manticoeur() {
        super("Manticoeur",
                Type.FAIRY, Type.POISON,
                new Stats(30, 45, 40, 40, 50, 60),
                List.of(Ability.CUTE_CHARM, Ability.POISON_POINT), Ability.MOODY,
                4, 120,
                new Stats(0,0,0,0,0,1), 190,
                0.875,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.FAIRY, EggGroup.FIELD),
                List.of("This Pokemon has a moody temper. It lures prey with its sweet face, then sucker punches them using its stinger."),
                List.of(new EvolutionEntry("fatail", EvolutionType.LEVEL_UP, false, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"160"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"night\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,4),
                        new MoveLearnSetEntry(Move.ASSIST,8),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,12),
                        new MoveLearnSetEntry(Move.ATTRACT,15),
                        new MoveLearnSetEntry(Move.POISON_TAIL,19),
                        new MoveLearnSetEntry(Move.CHARM,23),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,27),
                        new MoveLearnSetEntry(Move.SLASH,32),
                        new MoveLearnSetEntry(Move.POISON_JAB,37),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,41),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,46),
                        new MoveLearnSetEntry(Move.FELL_STINGER,50)
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
