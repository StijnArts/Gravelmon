package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Xinigen extends drai.dev.data.pokemon.Pokemon {
    public Xinigen() {
        super("Xinigen",
                Type.FLYING, Type.PSYCHIC,
                new Stats(80,
                        110,
                        80,
                        100,
                        90,
                        120),
                List.of(Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                35, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Xinigen moves wherever the wind blows and its intentions are as pure as the oxygen it provides the air with. That is if anybody doesn't pose a threat towards the breathable air that most Pokémon are dependent on. This legendary Pokémon may turn vengeful towards those who harm the clean air of the Pokémon World. This is shown through Xinigen's actions as it stalks quietly behind the enemies of the climate. When not travelling alone it finds good company in Sigilyph."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,17),
                        new MoveLearnSetEntry(Move.HEAL_BELL,22),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,28),
                        new MoveLearnSetEntry(Move.TAILWIND,34),
                        new MoveLearnSetEntry(Move.FROST_BREATH,38),
                        new MoveLearnSetEntry(Move.AIR_SLASH,46),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,50),
                        new MoveLearnSetEntry(Move.PSYCHIC,56),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,64),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,74),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,80),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,86),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,93)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Xinigen");

    }


}
