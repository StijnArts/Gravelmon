package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mettlemaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mettlemaw() {
        super("Mettlemaw",
                Type.STEEL, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It chews on metal wire, leading to a mass of wires to get caught in between its teeth. They do this to reinforce their teeth, allowing them to hunt their favorite prey - Cavitrio."),
                List.of(new EvolutionEntry("scourgeon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.CRUNCH.getName()+"\"")))	),
                List.of(         new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,11),
                        new MoveLearnSetEntry(Move.VICE_GRIP,16),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,21),
                        new MoveLearnSetEntry(Move.SUPER_FANG,26),
                        new MoveLearnSetEntry(Move.BATON_PASS,31),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,36),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,41),
                        new MoveLearnSetEntry(Move.METAL_PINCER,46),
                        new MoveLearnSetEntry(Move.SPIT_UP,51),
                        new MoveLearnSetEntry(Move.STOCKPILE,51),
                        new MoveLearnSetEntry(Move.SWALLOW,51),
                        new MoveLearnSetEntry(Move.IRON_HEAD,56),
                        new MoveLearnSetEntry(Move.METAL_BLAST,61),
                        new MoveLearnSetEntry(Move.GUILLOTINE,66)               ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Mettlemaw");

    }


}
