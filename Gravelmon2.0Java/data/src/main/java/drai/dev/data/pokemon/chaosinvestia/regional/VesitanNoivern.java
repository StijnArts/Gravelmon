package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanNoivern extends drai.dev.data.pokemon.Pokemon {
    public VesitanNoivern(String name, Aspect aspect) {
        super(name, aspect, "VesitanNoivern",
                Type.FAIRY,Type.DRAGON,
                new Stats(90,
                        89,
                        85,
                        123,
                        97,
                        85),
                List.of(Ability.FRISK,Ability.INFILTRATOR), null,
                15, 850,
                new Stats(0,0,0,2,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Es fliegt in finsterer, mondloser Nacht umher und macht Jagd auf achtlose Beute. Ist bei Dunkelheit jedem Gegner überlegen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,18),
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SUPER_FANG,45),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,54),
                        new MoveLearnSetEntry(Move.BOOMBURST,75),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,54),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,31),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,60),
                        new MoveLearnSetEntry(Move.GUST,11),
                        new MoveLearnSetEntry(Move.WING_ATTACK,16),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,5),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.WHIRLWIND,42),
                        new MoveLearnSetEntry(Move.TAILWIND,35),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.ROOST,27),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,40),
                        new MoveLearnSetEntry(Move.MOONLIGHT,1),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,49)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Noivern");

    }


}
