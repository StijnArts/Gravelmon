package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Lasaur extends drai.dev.data.pokemon.Pokemon {
    public Lasaur() {
        super("Lasaur",
                Type.ROCK, Type.ELECTRIC,
                new Stats(55,
                        70,
                        35,
                        70,
                        45,
                        80),
                List.of(Ability.LIGHTNING_ROD), Ability.GALVANIZE,
                7, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It can concentrate a weak electric charge in the crest on its head. Though this only produces minor electric attacks, it also stimulates its brain, heightening its reflexes."),
                List.of(new EvolutionEntry("Lectrosaur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.SCREECH,5),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,10),
                        new MoveLearnSetEntry(Move.ACCELEROCK,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,30),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,35),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,40),
                        new MoveLearnSetEntry(Move.JUMP_KICK,45),
                        new MoveLearnSetEntry(Move.SLASH,50),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,55)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 22, 38, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                List.of());
           setLangFileName("Lasaur");

    }


}
