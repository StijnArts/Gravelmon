package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Naviator extends drai.dev.data.pokemon.Pokemon {
    public Naviator() {
        super("Naviator",
                Type.NORMAL, Type.FLYING,
                new Stats(90,
                        129,
                        60,
                        50,
                        71,
                        110),
                List.of(Ability.KEEN_EYE,Ability.SNIPER), Ability.STAKEOUT,
                22, 215,
                new Stats(2,1,0,0,0,0), 60,
                0.5,
                230, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Their vision is unrivalled; soaring high in the sky helps them to easily identify prey and swoop down with pinpoint accuracy. They are known to roam around the Pokemon world and to have nests in the faraway territory of Okeno."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,3),
                        new MoveLearnSetEntry(Move.METAL_CLAW,5),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,10),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,14),
                        new MoveLearnSetEntry(Move.DEFOG,18),
                        new MoveLearnSetEntry(Move.ROOST,21),
                        new MoveLearnSetEntry(Move.AIR_SLASH,24),
                        new MoveLearnSetEntry(Move.TAILWIND,30),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.SKY_DROP,40),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,52)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(60).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP, Biome.IS_SKY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Naviator");

    }


}
