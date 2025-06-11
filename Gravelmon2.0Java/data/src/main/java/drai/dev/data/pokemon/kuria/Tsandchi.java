package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tsandchi extends drai.dev.data.pokemon.Pokemon {
    public Tsandchi() {
        super("Tsandchi",
                Type.FIGHTING, Type.GROUND,
                new Stats(70,
                        85,
                        50,
                        30,
                        60,
                        60),
                List.of(Ability.DESERTBODY,Ability.SCRAPPY), Ability.MOXIE,
                8, 221,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                107, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("They spend day and night wandering caves and fields looking for opponents to fight. Their body is resillient, but they can quickly patch themselves up using mud and sand if it gets torn."),
                List.of(new EvolutionEntry("bagarrough", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(           new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,7),
                        new MoveLearnSetEntry(Move.TAUNT,14),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,21),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,28),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,35),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,49),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,56),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,63),
                        new MoveLearnSetEntry(Move.ENDEAVOR,70),
                        new MoveLearnSetEntry(Move.MEGAHORN,77),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,84),
                        new MoveLearnSetEntry(Move.HEADLONG_RUSH,91)             ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Tsandchi");

    }


}
