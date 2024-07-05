package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class CefiranVenomoth extends Pokemon {
    public CefiranVenomoth(String name, Aspect aspect) {
        super(name, aspect,"CefiranVenomoth",
                Type.BUG, Type.GHOST,
                new Stats(70,65,60,90,100,90),
                List.of(Ability.ASTONISHMENT), Ability.TINTED_LENS,
                15, 125,
                new Stats(0,0,0,1,1,0), 75,
                0.5,
                158, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.BUG),
                List.of("Venomoth are nocturnal--they only are active at night. Their favorite prey are insects that gather around streetlights, attracted by the light in the darkness."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SILVER_WIND, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.DISABLE, 1),
                        new MoveLearnSetEntry(Move.FORESIGHT, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 5),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, 11),
                        new MoveLearnSetEntry(Move.POISON_POWDER, 13),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 17),
                        new MoveLearnSetEntry(Move.STUN_SPORE, 23),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE, 25),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER, 29),
                        new MoveLearnSetEntry(Move.GUST, 31),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, 37),
                        new MoveLearnSetEntry(Move.GRUDGE, 41),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 47),
                        new MoveLearnSetEntry(Move.PSYCHIC, 55),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 59),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE, 63)
                ),
                List.of(Label.OPAL, Label.GEN1),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 45, 0.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Venomoth");
        setCanFly(true);
        addAdditionalEvolution("venonat", new EvolutionEntry("venomoth cefiran", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_SPOOKY.getId() + ":" + Biome.IS_SPOOKY.getName() +"\""))));
    }
}
