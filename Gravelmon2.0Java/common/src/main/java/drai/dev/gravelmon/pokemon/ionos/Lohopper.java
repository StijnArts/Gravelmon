package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Lohopper extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lohopper() {
        super("Lohopper",
                Type.BUG, Type.FIGHTING,
                new Stats(59,
                        79,
                        60,
                        50,
                        50,
                        70),
                List.of(Ability.INNER_FOCUS), Ability.SWARM,
                7, 0,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Lophopper work in great numbers. They practice stealth tactics and locate themselves using sound and by guidance of the stars. Their primary target is usually on people´s crops. Despite being skillful thieves, they will not escape being caught stealing. Instead, they offer a fair fight and will accept defeat if proven hors de combat."),
                List.of(new EvolutionEntry("wisopotron", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.PESTER,14),
                        new MoveLearnSetEntry(Move.COUNTER,18),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,21),
                        new MoveLearnSetEntry(Move.STEAMROLLER,24),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,29),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,37),
                        new MoveLearnSetEntry(Move.GYRO_BALL,44),
                        new MoveLearnSetEntry(Move.DETECT,53),
                        new MoveLearnSetEntry(Move.SUPERPOWER,57)                         ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 12, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lohopper");

    }


}
