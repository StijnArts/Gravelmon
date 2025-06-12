package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dartypooper extends drai.dev.data.pokemon.Pokemon {
    public Dartypooper() {
        super("Dartypooper",
                Type.NORMAL,Type.FIGHTING,
                new Stats(89,
                        98,
                        70,
                        75,
                        70,
                        80),
                List.of(Ability.DEFIANT), Ability.DIVERSION,
                12, 1950,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The thick, leathery hide on this Pokémon's rear makes it near-impermeable to attacks. When threatened, this Pokémon will thrash its sharp horn and whip-like tail around to ward off any potential threats."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,1),
                        new MoveLearnSetEntry(Move.BULK_UP,30),
                        new MoveLearnSetEntry(Move.TAUNT,36),
                        new MoveLearnSetEntry(Move.HEADBUTT,40),
                        new MoveLearnSetEntry(Move.SCREECH,42),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,45),
                        new MoveLearnSetEntry(Move.THRASH,49),
                        new MoveLearnSetEntry(Move.BODY_PRESS,51),
                        new MoveLearnSetEntry(Move.MINIMIZE,60),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,62)                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 26, 45, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dartypooper");

    }


}
