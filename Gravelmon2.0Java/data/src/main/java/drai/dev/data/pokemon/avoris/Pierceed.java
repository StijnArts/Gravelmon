package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pierceed extends drai.dev.data.pokemon.Pokemon {
    public Pierceed() {
        super("Pierceed",
                Type.GRASS, Type.FIGHTING,
                new Stats(78,
                        60,
                        89,
                        56,
                        55,
                        68),
                List.of(Ability.HUSTLE,Ability.SUPER_LUCK,Ability.SKILL_LINK), Ability.SKILL_LINK,
                10, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They developed thick armor to defend against attacks from their rival, Nuzleaf. With their piercing arms, they knock down trees where Nuzleaf reside in within their territory."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.LOW_KICK,13),
                        new MoveLearnSetEntry(Move.ARM_THRUST,17),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,21),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,25),
                        new MoveLearnSetEntry(Move.BULK_UP,33),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,37),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,41),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,45),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,49),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,53),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,57),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,60)          ),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(14)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pierceed");

    }


}
