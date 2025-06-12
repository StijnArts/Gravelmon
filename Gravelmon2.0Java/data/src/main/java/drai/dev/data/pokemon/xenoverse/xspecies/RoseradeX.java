package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class RoseradeX extends Pokemon {
    public RoseradeX(String name, Aspect aspect) {
        super(name, aspect,"RoseradeX",
                Type.SOUND, Type.POISON,
                new Stats(60, 61, 65, 134, 90, 105),
                List.of(Ability.SERENE_GRACE), Ability.SOUNDPROOF,
                9, 145,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                232, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.XENO),
                List.of("It waves its stings to modify any sound wave at will. If it interferes with its opponent's heartbeat, it will cause them irreparable harm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TWINEEDLE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1),
                        new MoveLearnSetEntry(Move.ENCORE,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.VENOSHOCK,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.UPROAR,1),
                        new MoveLearnSetEntry(Move.FLATTER,1),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1),
                        new MoveLearnSetEntry(Move.TOXIC,40),
                        new MoveLearnSetEntry(Move.PERISH_SONG,45),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,50),
                        new MoveLearnSetEntry(Move.NOISE_BURST,55),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.CHEERING,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN4),
                1, List.of(
                        new ItemDrop("gravelmon:xenolith",50, 1,1)),
                new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Roserade");

    }
}
