package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ribikun extends drai.dev.data.pokemon.Pokemon {
    public Ribikun() {
        super("Ribikun",
                Type.GROUND,
                new Stats(60,
                        55,
                        55,
                        60,
                        70,
                        45),
                List.of(Ability.DRY_SKIN,Ability.RAINBOON), Ability.ADAPTABILITY,
                6, 64,
                new Stats(0,0,0,0,1,0), 45,
                0.0,
                69, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("It can sit for days waiting for prey. When demoisturized, its body becomes rigid like a statue. It prefers shade, suggesting the dry environment it dwells in was once upon a time more lush."),
                List.of(new EvolutionEntry("kunama", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.ACID_ARMOR.getName())))),
                List.of(          new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SNORE,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,9),
                        new MoveLearnSetEntry(Move.WATER_PULSE,13),
                        new MoveLearnSetEntry(Move.MUD_SHOT,18),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,25),
                        new MoveLearnSetEntry(Move.MUD_BOMB,28),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,32),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,38),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,47)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ribikun");

    }


}
