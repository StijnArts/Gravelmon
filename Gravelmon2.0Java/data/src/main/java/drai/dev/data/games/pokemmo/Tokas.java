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
        addNewPokemon(new Frungus());   
        addNewPokemon(new Mushribbit());   
        addNewPokemon(new Toadrule(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Oinklit());   
        addNewPokemon(new Hamferno());   
        addNewPokemon(new Infernoink(new Stats(532, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Bufflow());   
        addNewPokemon(new Brinalo());   
        addNewPokemon(new Bisonami(new Stats(525, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
//        addNewPokemon(new Trilbin());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Bintone());   Missing Art
//        addNewPokemon(new Beatrob());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Erliber());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Getzawyrm());   Missing Art
        addNewPokemon(new Nutub());   
        addNewPokemon(new Bubinuter(new Stats(470, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
//        addNewPokemon(new Combee());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Vespiquen());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Mortoise());   Missing Art
//        addNewPokemon(new Clunkey());   Missing Art
//        addNewPokemon(new Arachute());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Parachnid());   Missing Art
//        addNewPokemon(new Scuddle());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Crustancient());   Missing Art
//        addNewPokemon(new Nozlox());   Missing Art
//        addNewPokemon(new Hydrox());   Missing Art
//        addNewPokemon(new Dewmite());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Fountic());   Missing Art
//        addNewPokemon(new Obstick());   Missing Art
//        addNewPokemon(new Stalkturnal());   Missing Art
//        addNewPokemon(new Walok());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Binduga());   Missing Art
//        addNewPokemon(new Gliduki());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Tukaleap());   Missing Art
//        addNewPokemon(new Cattack());   Missing Art
//        addNewPokemon(new Magby("", Aspect.TOKASSIAN));   Missing Art
//        addNewPokemon(new Magmar("", Aspect.TOKASSIAN));   Missing Art
        addNewPokemon(new Koroka());   
        addNewPokemon(new Goroka(new Stats(478, StatArchetype.SPECIAL_WALL,
                List.of(StatType.DEFENCE))));
//        addNewPokemon(new Snoboon());   Missing Art
//        addNewPokemon(new Boonball());   Missing Art
//        addNewPokemon(new Abomboon());   Missing Art
//        addNewPokemon(new Gexom());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Gectidact());   Missing Art
        addNewPokemon(new Finpin());   
        addNewPokemon(new Merpin());   
        addNewPokemon(new Mermace(new Stats(500, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
//        addNewPokemon(new Aarkweird());   Missing Art
//        addNewPokemon(new Myrmerize());   Missing Art
//        addNewPokemon(new Tamindash());   Missing Art
//        addNewPokemon(new Corozard());   Missing Art
//        addNewPokemon(new Biolazard());   Missing Art
        addNewPokemon(new Gravelo());   
        addNewPokemon(new Minerapt());   
        addNewPokemon(new Outcroptor(new Stats(510, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
//        addNewPokemon(new Grebur());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Grebloo());   Missing Art
        addNewPokemon(new Parazyme());   
        addNewPokemon(new Cytocite(new Stats(470, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
//        addNewPokemon(new Snifflet());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Fridgehog());   Missing Art
//        addNewPokemon(new Iciquill());   Missing Art
//        addNewPokemon(new Gestup());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Phantoll());   Missing Art
//        addNewPokemon(new Springeist());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new 215200());   Missing Art
    }

}
