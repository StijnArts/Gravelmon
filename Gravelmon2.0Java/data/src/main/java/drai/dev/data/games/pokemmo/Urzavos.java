package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.urzavos.*;

import java.util.*;

public class Urzavos extends drai.dev.data.games.registry.Game {
    public Urzavos() {
        super("Urzavos");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Spritten());
        addNewPokemon(new Predageist());
        addNewPokemon(new Phanther());
        addNewPokemon(new Ambystar());   
        addNewPokemon(new Amphibula());   
        addNewPokemon(new Galaxalotl(new Stats(530, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Psyalii());   
        addNewPokemon(new Dusynap());   
        addNewPokemon(new Injelligent(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        addNewPokemon(new Squiruff());
        addNewPokemon(new Scuffrel());
        addNewPokemon(new Peap());   
        addNewPokemon(new Peafuddle());   
        addNewPokemon(new Peadazzled(new Stats(490, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Peaknighted(new Stats(490, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Ahrimini(new Stats(370, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));      
        addNewPokemon(new Prikkle());   
        addNewPokemon(new Pinzineedl(new Stats(430, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Lizleaf());   
        addNewPokemon(new Thistliz());   
        addNewPokemon(new Brambazard(new Stats(460, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        addNewPokemon(new Hayboo());   
        addNewPokemon(new Effighast(new Stats(450, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Skeinter());   
        addNewPokemon(new Aracknit(new Stats(440, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        addNewPokemon(new Rodoll());   
        addNewPokemon(new Verplushie(new Stats(445, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Brrbear());
        addNewPokemon(new Brrzolt());
        addNewPokemon(new Plumbee());
        addNewPokemon(new Pupoke());   
        addNewPokemon(new Briarasp(new Stats(480, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        addNewPokemon(new Elemuttal());   
        addNewPokemon(new Caniflame(new Stats(450, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Thounder(new Stats(450, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        addNewPokemon(new Permafruff(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Snatchirp());   
        addNewPokemon(new Corvosene(new Stats(440, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Constellapin(new Stats(370, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Ichorot());
        addNewPokemon(new Statikub());   
        addNewPokemon(new Urzap());   
        addNewPokemon(new Batteary(new Stats(500, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Bawlmire());   
        addNewPokemon(new Miserooze());   
        addNewPokemon(new Depressoil(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        addNewPokemon(new Hilaribat());   
        addNewPokemon(new Histerijeist(new Stats(470, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        addNewPokemon(new Parasuck());   
        addNewPokemon(new Hemorobbin(new Stats(460, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Sedimollusk());
        addNewPokemon(new Gastropow());
        addNewPokemon(new Mosshroud());
        addNewPokemon(new Murkreep());
        addNewPokemon(new Bateeny());
        addNewPokemon(new Bathemoth(new Stats(478, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Brachiboing());
        addNewPokemon(new Soaropod(new Stats(480, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Souropod());
        addNewPokemon(new Apatoplek(new Stats(480, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Whirlifern());
        addNewPokemon(new Ferneurosis(new Stats(478, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Luminlite());
        addNewPokemon(new Luminlux());   
        addNewPokemon(new Lumineye());
        addNewPokemon(new Prickity());   
        addNewPokemon(new Ruffhaws());
        addNewPokemon(new Chompupi());
    }

}
