package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.crozoic.*;

import java.util.*;
//done
public class Crozoic extends drai.dev.data.games.registry.Game {
    public Crozoic() {
        super("Crozoic");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Arovee());
//        pokemon.add(new Dinari());   Member of line Not Finished
        pokemon.add(new Picant());
        pokemon.add(new Surveilant());
        pokemon.add(new Hellantern(new Stats(434, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK, StatType.SPEED))));
        pokemon.add(new Glizyrup(new Stats(342, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Pekohmu(new Stats(412, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Razaury());
        pokemon.add(new Therislash(new Stats(514, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Brainibash());
        pokemon.add(new Brainiache(new Stats(506, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Seigoni());
        pokemon.add(new Seigoxic(new Stats(500, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Seanodont(new Stats(387, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Chillaxo());
        pokemon.add(new Kulapack());
        pokemon.add(new Shroolumn(new Stats(477, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Fishereel(new Stats(467, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))));
        pokemon.add(new Mander());
        pokemon.add(new Mander());
        pokemon.add(new Umander(new Stats(467, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Trilobrite());
        pokemon.add(new Delvalite(new Stats(437, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Lumarva());
        pokemon.add(new Glowpa());
        pokemon.add(new Cryoptera(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Paluducki());
        pokemon.add(new Hydrosaur(new Stats(467, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Shredpole());
        pokemon.add(new Oblitoad(new Stats(455, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Snagmire());
        pokemon.add(new Stricycle());
        pokemon.add(new Mimentron());
        pokemon.add(new Ovimourn());
        pokemon.add(new Funeraptor(new Stats(513, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Varaquake(new Stats(467, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Rexinder());
        pokemon.add(new Tarboraze(new Stats(532, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Oloraudio(new Stats(476, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Dauspector(new Stats(476, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Miniclod());
        pokemon.add(new Sauropot());
        pokemon.add(new Stratopod(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Twintuff());
        pokemon.add(new Rocktile());
        pokemon.add(new Graplarock());
        pokemon.add(new Oxygryph());
        pokemon.add(new Sharpunk());
        pokemon.add(new Spurocious(new Stats(513, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Terraform());
        pokemon.add(new Battletail());
        pokemon.add(new Battanker(new Stats(498, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Tropichomp());
        pokemon.add(new Dendrago(new Stats(476, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        pokemon.add(new Booade());
        pokemon.add(new Fauxnidon(new Stats(485, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Pikoral());
        pokemon.add(new Crestoral(new Stats(500, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Hungrebe());
        pokemon.add(new Lungrebe(new Stats(454, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Punshell());
        pokemon.add(new Whammonite(new Stats(512, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Elesmoduct(new Stats(505, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.HP))));
        pokemon.add(new Fossoul());
        pokemon.add(new Soulhofen());
        pokemon.add(new Shaelseum());
        pokemon.add(new Stunge());
        pokemon.add(new Bristilt(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Clawryde());
        pokemon.add(new Tullabaloo(new Stats(378, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Drambam(new Stats(378, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Takoyuki());
        pokemon.add(new Squicecone(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Dangoceras());
        pokemon.add(new Tenkoi());
        pokemon.add(new Tenchondri(new Stats(467, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.ATTACK))));
        pokemon.add(new Gustwee());
        pokemon.add(new Elegyre(new Stats(412, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        pokemon.add(new Palagaia(new Stats(496, StatArchetype.PHYSICAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Ginkorale(new Stats(435, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Pachibrik());
        pokemon.add(new Pachicorn(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Onsentient());
        pokemon.add(new Stegairy());
        pokemon.add(new Reptor(new Stats(411, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Ordovice(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Permiblaze(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Kretozone(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Ucarya(new Stats(600, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
    }

}
