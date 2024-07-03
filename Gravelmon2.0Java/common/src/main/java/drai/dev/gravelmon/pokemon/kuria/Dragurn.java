package drai.dev.gravelmon.pokemon.kuria;


import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Dragurn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dragurn() {
        super("Dragurn",
                Type.DRAGON,
                new Stats(50,
                        60,
                        90,
                        60,
                        90,
                        20),
                List.of(Ability.STURDY), Ability.SOLID_ROCK,
                6, 100,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("When born Dragurn find a vessel to hide within to protect themselves from predators. They will stay in their new-found homes all of their life."),
                List.of(new EvolutionEntry("Drajinn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.DRAGON_PULSE.getName()+"\"")))),
                List.of(            new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.BITE,3),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,6),
                        new MoveLearnSetEntry(Move.ASSURANCE,9),
                        new MoveLearnSetEntry(Move.TAUNT,12),
                        new MoveLearnSetEntry(Move.SLASH,15),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,18),
                        new MoveLearnSetEntry(Move.METAL_CLAW,21),
                        new MoveLearnSetEntry(Move.CRUNCH,24),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,27),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,30),
                        new MoveLearnSetEntry(Move.IRON_HEAD,33),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,39),
                        new MoveLearnSetEntry(Move.OUTRAGE,42),
                        new MoveLearnSetEntry(Move.GUILLOTINE,45),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,48)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 29, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Dragurn");

    }


}
