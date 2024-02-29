package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Warshrike extends drai.dev.gravelmon.pokemon.Pokemon {
    public Warshrike() {
        super("Warshrike",
                Type.DARK,Type.FLYING,
                new Stats(84,
                        110,
                        70,
                        60,
                        81,
                        95),
                List.of(Ability.MOXIE,Ability.INTIMIDATE,Ability.RIVALRY), Ability.RIVALRY,
                8, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                214, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("They have a rivalry with Falcryo. A flock of Warshrike will seek vengeance on those who cause harm to their colony. With their skillful and carefully planned attacks, they can take down their foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PUNISHMENT,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.PURSUIT,9),
                        new MoveLearnSetEntry(Move.WING_ATTACK,13),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,18),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,23),
                        new MoveLearnSetEntry(Move.WHIRLWIND,28),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,35),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,39),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,45),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,51),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,57),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.CHIRP,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Warshrike");

    }


}
