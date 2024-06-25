package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class RoseliaX extends Pokemon {
    public RoseliaX(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"RoseliaX",
                Type.SOUND, Type.POISON,
                new Stats(50, 56, 45, 104, 80, 85),
                List.of(Ability.SERENE_GRACE), Ability.SOUNDPROOF,
                3, 20,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.XENO),
                List.of("Using the auricular organs on its arms, Roselia amplifies the range of its voice. It can even break rocks at full volume."),
                List.of(new EvolutionEntry("roseradex", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"gravelmon:xenolith")),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.SUPERSONIC,7),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,10),
                        new MoveLearnSetEntry(Move.ENCORE,13),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.VENOSHOCK,19),
                        new MoveLearnSetEntry(Move.SING,22),
                        new MoveLearnSetEntry(Move.POISON_JAB,25),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,28),
                        new MoveLearnSetEntry(Move.UPROAR,31),
                        new MoveLearnSetEntry(Move.FLATTER,34),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,37),
                        new MoveLearnSetEntry(Move.TOXIC,40),
                        new MoveLearnSetEntry(Move.PERISH_SONG,43),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,46),
                        new MoveLearnSetEntry(Move.NOISE_BURST,50),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
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
                List.of(Label.XENOVERSE, Label.GEN3),
                1, List.of(
                        new ItemDrop("gravelmon:xenolith",20, 1,1)),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 36, 0.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Roselia");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
