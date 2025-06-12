package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sparroing extends drai.dev.data.pokemon.Pokemon {
    public Sparroing() {
        super("Sparroing",
                Type.FIGHTING, Type.STEEL,
                new Stats(75,
                        80,
                        50,
                        50,
                        75,
                        75),
                List.of(Ability.QUICK_FEET,Ability.RECKLESS,Ability.PRANKSTER), Ability.PRANKSTER,
                15, 165,
                new Stats(0,0,0,0,1,1), 100,
                0.5,
                142, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("Sparroing nimbly bound across rooftops with their springy feet, damaging roofs and causing all sorts of trouble. The coiled legs can extend up to ten times in length to kick enemies with iron force."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BOUNCE,1),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.ACROBATICS,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.RUSHDOWN,1),
                        new MoveLearnSetEntry(Move.AXE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.POUNCE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Sparroing");

    }


}
