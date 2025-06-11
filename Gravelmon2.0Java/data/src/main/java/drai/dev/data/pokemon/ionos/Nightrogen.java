package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nightrogen extends drai.dev.data.pokemon.Pokemon {
    public Nightrogen() {
        super("Nightrogen",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(190,
                        90,
                        70,
                        90,
                        60,
                        70),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                17, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Nightrogen (UB - 60 Pulse) appears to have the ability to support the air with the majority of breathable particles for all people and Pokémon. During nighttime when everybody is asleep, UB-60 sends out electric pulses through its kind spirited mind, like calm waves of a sparkling ocean. The same pulses fills the air with nitrogen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,8),
                        new MoveLearnSetEntry(Move.PSYWAVE,16),
                        new MoveLearnSetEntry(Move.WATER_PULSE,24),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,30),
                        new MoveLearnSetEntry(Move.PSYSHOCK,35),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,40),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,46),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,52),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,56),
                        new MoveLearnSetEntry(Move.CALM_MIND,63),
                        new MoveLearnSetEntry(Move.MOONBLAST,68),
                        new MoveLearnSetEntry(Move.MOONLIGHT,73),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,81)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nightrogen");

    }


}
