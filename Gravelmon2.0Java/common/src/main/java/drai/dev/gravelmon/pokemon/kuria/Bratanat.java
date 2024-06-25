package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bratanat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bratanat() {
        super("Bratanat",
                Type.BUG,
                new Stats(50,
                        40,
                        40,
                        55,
                        80,
                        68),
                List.of(Ability.IMMUNITY), Ability.POISON_POINT,
                3, 11,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It's full of so much disease that it has eventually become immune to all sickness. Because of this incredible power, Bratanat is always cheerful and happy. It spends its days playfully pranking others but it has to keep a distance so it doesn't give anyone a disease."),
                List.of(new EvolutionEntry("witherwind", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")))),
                List.of(           new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,7),
                        new MoveLearnSetEntry(Move.DISABLE,11),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,19),
                        new MoveLearnSetEntry(Move.PSYBEAM,22),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,26),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,30),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,33),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,37),
                        new MoveLearnSetEntry(Move.PSYCHIC,41),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,46),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,50),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,55)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bratanat");

    }


}
