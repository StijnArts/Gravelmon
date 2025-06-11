package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Pelasquall extends drai.dev.data.pokemon.Pokemon {
    public Pelasquall() {
        super("Pelasquall",
                Type.WATER, Type.FLYING,
                new Stats(87,
                        95,
                        75,
                        108,
                        90,
                        80),
                List.of(Ability.TORRENT,Ability.BIG_PECKS,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                8, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Experts of strong winds and raging waves. This rare species of flying Pokemon has been seen rescuing both people and Pokemon lost at sea. Only the most skillful Pelasquall can channel lighting strikes through its long head feather; and resist the power of dark clouds."),
                List.of()
                ,List.of(            new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BITE,24),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,33),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,42)            ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST)
    .setAntiBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
