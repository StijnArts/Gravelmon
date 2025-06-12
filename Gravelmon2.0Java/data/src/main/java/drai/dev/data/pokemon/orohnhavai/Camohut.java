package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Camohut extends drai.dev.data.pokemon.Pokemon {
    public Camohut() {
        super("Camohut",
                Type.GROUND, Type.DRAGON,
                new Stats(40,
                        50,
                        100,
                        65,
                        70,
                        15),
                List.of(Ability.BATTLE_ARMOR,Ability.OVERCOAT,Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                11, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their disguise as tiny huts helps prevent them from getting in danger with predators. They move in herds traveling around near the foot of mountains. Their tough exterior withstands powerful attacks and harsh weather conditions."),
                List.of(new EvolutionEntry("camofirma", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,2),
                        new MoveLearnSetEntry(Move.MUDSLAP,6),
                        new MoveLearnSetEntry(Move.PROTECT,10),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,15),
                        new MoveLearnSetEntry(Move.BESTOW,19),
                        new MoveLearnSetEntry(Move.MUD_BOMB,23),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,28),
                        new MoveLearnSetEntry(Move.SLAM,32),
                        new MoveLearnSetEntry(Move.SAFEGUARD,34),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,37),
                        new MoveLearnSetEntry(Move.EARTH_POWER,43),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,47),
                        new MoveLearnSetEntry(Move.BULK_UP,52),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,57),
                        new MoveLearnSetEntry(Move.OUTRAGE,62)              ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(7)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Camohut");

    }


}
