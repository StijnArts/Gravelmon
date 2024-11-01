package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.tokas.*;

import java.util.*;
public class Tokas extends drai.dev.data.games.registry.Game {
    public Tokas() {
        super("Tokas");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Frungus());   
        pokemon.add(new Mushribbit());   
        pokemon.add(new Toadrule(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Oinklit());   
        pokemon.add(new Hamferno());   
        pokemon.add(new Infernoink(new Stats(532, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Bufflow());   
        pokemon.add(new Brinalo());   
        pokemon.add(new Bisonami(new Stats(525, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
//        pokemon.add(new Trilbin());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Bintone());   Missing Art
//        pokemon.add(new Beatrob());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Erliber());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Getzawyrm());   Missing Art
        pokemon.add(new Nutub());   
        pokemon.add(new Bubinuter(new Stats(470, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
//        pokemon.add(new Combee());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Vespiquen());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Mortoise());   Missing Art
//        pokemon.add(new Clunkey());   Missing Art
//        pokemon.add(new Arachute());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Parachnid());   Missing Art
//        pokemon.add(new Scuddle());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Crustancient());   Missing Art
//        pokemon.add(new Nozlox());   Missing Art
//        pokemon.add(new Hydrox());   Missing Art
//        pokemon.add(new Dewmite());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Fountic());   Missing Art
//        pokemon.add(new Obstick());   Missing Art
//        pokemon.add(new Stalkturnal());   Missing Art
//        pokemon.add(new Walok());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Binduga());   Missing Art
//        pokemon.add(new Gliduki());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Tukaleap());   Missing Art
//        pokemon.add(new Cattack());   Missing Art
//        pokemon.add(new Magby("", Aspect.TOKASSIAN));   Missing Art
//        pokemon.add(new Magmar("", Aspect.TOKASSIAN));   Missing Art
        pokemon.add(new Koroka());   
        pokemon.add(new Goroka(new Stats(478, StatArchetype.SPECIAL_WALL,
                List.of(StatType.DEFENCE))));
//        pokemon.add(new Snoboon());   Missing Art
//        pokemon.add(new Boonball());   Missing Art
//        pokemon.add(new Abomboon());   Missing Art
//        pokemon.add(new Gexom());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Gectidact());   Missing Art
        pokemon.add(new Finpin());   
        pokemon.add(new Merpin());   
        pokemon.add(new Mermace(new Stats(500, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
//        pokemon.add(new Aarkweird());   Missing Art
//        pokemon.add(new Myrmerize());   Missing Art
//        pokemon.add(new Tamindash());   Missing Art
//        pokemon.add(new Corozard());   Missing Art
//        pokemon.add(new Biolazard());   Missing Art
        pokemon.add(new Gravelo());   
        pokemon.add(new Minerapt());   
        pokemon.add(new Outcroptor(new Stats(510, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
//        pokemon.add(new Grebur());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Grebloo());   Missing Art
        pokemon.add(new Parazyme());   
        pokemon.add(new Cytocite(new Stats(470, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Snifflet());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Fridgehog());   Missing Art
//        pokemon.add(new Iciquill());   Missing Art
//        pokemon.add(new Gestup());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Phantoll());   Missing Art
//        pokemon.add(new Springeist());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new 215200());   Missing Art
    }

}
