package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.crozoic.*;

import java.util.*;
public class Crozoic extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Crozoic();
    private Crozoic() {
        super("Crozoic");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Arovee());
        addNewPokemon(new Dinari());
        addNewPokemon(new Taltael(new Stats(434, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK, StatType.SPEED))));
        addNewPokemon(new Picant());
        addNewPokemon(new Surveilant());
        addNewPokemon(new Hellantern(new Stats(484, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK, StatType.SPEED))));
        addNewPokemon(new Glizyrup(new Stats(342, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Pekohmu(new Stats(412, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Razaury());
        addNewPokemon(new Therislash(new Stats(514, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Brainibash());
        addNewPokemon(new Brainiache(new Stats(506, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Seigoni());
        addNewPokemon(new Seigoxic(new Stats(500, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Seanodont(new Stats(387, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Chillaxo());
        addNewPokemon(new Kulapack());
        addNewPokemon(new Shroolumn(new Stats(477, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Fishereel(new Stats(467, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Mander());
        addNewPokemon(new Mander());
        addNewPokemon(new Umander(new Stats(467, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Trilobrite());
        addNewPokemon(new Delvalite(new Stats(437, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Lumarva());
        addNewPokemon(new Glowpa());
        addNewPokemon(new Cryoptera(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Paluducki());
        addNewPokemon(new Hydrosaur(new Stats(467, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Shredpole());
        addNewPokemon(new Oblitoad(new Stats(455, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Snagmire());
        addNewPokemon(new Stricycle());
        addNewPokemon(new Mimentron());
        addNewPokemon(new Ovimourn());
        addNewPokemon(new Funeraptor(new Stats(513, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Varaquake(new Stats(467, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Rexinder());
        addNewPokemon(new Tarboraze(new Stats(532, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Toraiking());
        addNewPokemon(new Toraiqueen());
        addNewPokemon(new Oloraudio(new Stats(476, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Dauspector(new Stats(476, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Miniclod());
        addNewPokemon(new Sauropot());
        addNewPokemon(new Stratopod(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Twintuff());
        addNewPokemon(new Rocktile());
        addNewPokemon(new Graplarock());
        addNewPokemon(new Oxygryph());
        addNewPokemon(new Gorgonox());
        addNewPokemon(new Sharpunk());
        addNewPokemon(new Spurocious(new Stats(513, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Terraform());
        addNewPokemon(new Battletail());
        addNewPokemon(new Battanker(new Stats(498, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Tropichomp());
        addNewPokemon(new Dendrago(new Stats(476, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Booade());
        addNewPokemon(new Fauxnidon(new Stats(485, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Pikoral());
        addNewPokemon(new Crestoral(new Stats(500, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Hungrebe());
        addNewPokemon(new Lungrebe(new Stats(454, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Punshell());
        addNewPokemon(new Whammonite(new Stats(512, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Elesmoduct(new Stats(505, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Fossoul());
        addNewPokemon(new Soulhofen());
        addNewPokemon(new Shaelseum());
        addNewPokemon(new Stunge());
        addNewPokemon(new Bristilt(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Clawryde());
        addNewPokemon(new Tullabaloo(new Stats(378, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Drambam(new Stats(378, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Takoyuki());
        addNewPokemon(new Squicecone(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Dangoceras());
        addNewPokemon(new Tenkoi());
        addNewPokemon(new Tenchondri(new Stats(467, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.ATTACK))));
        addNewPokemon(new Gustwee());
        addNewPokemon(new Elegyre(new Stats(412, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new Palagaia(new Stats(496, StatArchetype.PHYSICAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Ginkorale(new Stats(435, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Pachibrik());
        addNewPokemon(new Pachicorn(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Onsentient());
        addNewPokemon(new Stegairy());
        addNewPokemon(new Reptor(new Stats(411, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Ordovice(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Permiblaze(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Kretozone(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Ucarya(new Stats(600, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
    }

}
