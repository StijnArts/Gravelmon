package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.crozoic.*;

import java.util.*;
public class Crozoic extends drai.dev.data.games.registry.Game {
    public Crozoic() {
        super("Crozoic");
    }
//TODO update when all other ones are done
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
//        pokemon.add(new Trilobrite()); todo
//        pokemon.add(new Delvalite());
//        pokemon.add(new Lumarva());
//        pokemon.add(new Glowpa());
        pokemon.add(new Cryoptera(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        pokemon.add(new Paluducki()); todo
//        pokemon.add(new Hydrosaur());
        pokemon.add(new Shredpole());
        pokemon.add(new Oblitoad(new Stats(455, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        pokemon.add(new Snagmire()); todo
        pokemon.add(new Stricycle());
        pokemon.add(new Mimentron());
        pokemon.add(new Ovimourn());
        pokemon.add(new Funeraptor(new Stats(513, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Varaquake(new Stats(467, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Rexinder());
        pokemon.add(new Tarboraze(new Stats(532, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
//        pokemon.add(new Oloraudio()); todo
//        pokemon.add(new Dauspector()); todo
        pokemon.add(new Miniclod());
//        pokemon.add(new Sauropot()); todo
        pokemon.add(new Stratopod(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
//        pokemon.add(new Twintuff()); todo
//        pokemon.add(new Rocktile());
//        pokemon.add(new Graplarock());
        pokemon.add(new Oxygryph());
        pokemon.add(new Sharpunk());
        pokemon.add(new Spurocious(new Stats(513, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        pokemon.add(new Terraform()); TODO
//        pokemon.add(new Battletail());
//        pokemon.add(new Battanker());
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
//        pokemon.add(new Elesmoduct()); todo
//        pokemon.add(new Fossoul());
        pokemon.add(new Soulhofen());
        pokemon.add(new Shaelseum());
        pokemon.add(new Stunge());
        pokemon.add(new Bristilt(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Clawryde());
//        pokemon.add(new Tullabaloo()); Member of line Not Finished
//        pokemon.add(new Drambam()); todo
//        pokemon.add(new Takoyuki());
        pokemon.add(new Squicecone(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Dangoceras()); todo
//        pokemon.add(new Tenkoi());
//        pokemon.add(new Tenchondri());
//        pokemon.add(new Gustwee());
        pokemon.add(new Elegyre(new Stats(412, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        pokemon.add(new Palagaia(new Stats(496, StatArchetype.PHYSICAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Ginkorale()); todo
        pokemon.add(new Pachibrik());
        pokemon.add(new Pachicorn(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Onsentient()); todo
        pokemon.add(new Stegairy());
//        pokemon.add(new Ordovice()); todo
//        pokemon.add(new Permiblaze());
//        pokemon.add(new Kretozone());
//        pokemon.add(new Ucarya());
        pokemon.add(new Reptor(new Stats(411, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
    }

}
