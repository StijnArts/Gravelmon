package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.ruskow.*;

import java.util.*;

public class Ruskow extends drai.dev.data.games.registry.Game {
    public Ruskow() {
        super("Ruskow");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Eleplant());   
        pokemon.add(new Herbederm());   
        pokemon.add(new Mammahonia());
        pokemon.add(new Bollokin());   
        pokemon.add(new Flamabull());   
        pokemon.add(new Audhroch(new Stats(524, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Newtiny());   
        pokemon.add(new Salamarsh());   
        pokemon.add(new Caudatidal(new Stats(524, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Coocun());   
        pokemon.add(new Cocadeux());   
        pokemon.add(new Cocatrois(new Stats(510, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Pilfur());   
        pokemon.add(new Pikpossum(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Nimf());   
        pokemon.add(new Trusshy());   
        pokemon.add(new Dayfly(new Stats(390, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Duskito(new Stats(390, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Kupal());   
        pokemon.add(new Cheervona(new Stats(410, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Taracub());   
        pokemon.add(new Dentdeleo());   
        pokemon.add(new Dandylion(new Stats(490, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Cervidear(new Stats(340, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.HP))));
        pokemon.add(new Pedenki(new Stats(330, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Rasclove(new Stats(340, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        pokemon.add(new Inkling());   
        pokemon.add(new Inkap());   
        pokemon.add(new Inklassy(new Stats(470, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Sorrowmin());   
        pokemon.add(new Ermourne());   
        pokemon.add(new Weepsel(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Magixy());   
        pokemon.add(new Magimancy(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Critatter());   
        pokemon.add(new Critippet());   
        pokemon.add(new Critabard(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Spectung());   
        pokemon.add(new Hauntung());   
        pokemon.add(new Phantung(new Stats(470, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Maluce());   
        pokemon.add(new Nitemori(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Llima());   
        pokemon.add(new Rocpaca());   
        pokemon.add(new Jewellama(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Crovus());   
        pokemon.add(new Cawpin(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Flambe());   
        pokemon.add(new Fricasheep());   
        pokemon.add(new Searies(new Stats(470, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Lullamb());   
        pokemon.add(new Shleepy(new Stats(450, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        pokemon.add(new Mismol());   
        pokemon.add(new Hokumol(new Stats(460, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.HP))));
        pokemon.add(new Boovine(new Stats(390, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Tumblwee());   
        pokemon.add(new Jumblweed());   
        pokemon.add(new Troublweed(new Stats(460, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Poisoma());   
        pokemon.add(new Coronatox(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Spuro());   
        pokemon.add(new Spurtail(new Stats(450, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Walabrume());   
        pokemon.add(new Kangarain());   
        pokemon.add(new Stormaroo(new Stats(480, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Cadavish());   
        pokemon.add(new Carcashark(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Shoales());   
        pokemon.add(new Palaices(new Stats(440, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Dolfun());   
        pokemon.add(new Tropiaqua(new Stats(450, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Peruna(new Stats(390, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
//        pokemon.add(new Mantill());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Maneral());   Missing Art
//        pokemon.add(new Dripem());   Missing Art
//        pokemon.add(new Blowelt());   Missing Art
//        pokemon.add(new Perxie());   Missing Art
//        pokemon.add(new Frownie());   Missing Art
//        pokemon.add(new Grimlin());   Missing Art
//        pokemon.add(new Gargamin());   Missing Art
//        pokemon.add(new Garguardan());   Missing Art
//        pokemon.add(new Shivery());   Missing Art
//        pokemon.add(new Glaciowl());   Missing Art
//        pokemon.add(new Snobun());   Missing Art
//        pokemon.add(new Lapice());   Missing Art
//        pokemon.add(new Merrymint());   Missing Art
//        pokemon.add(new Ringibell());   Missing Art
//        pokemon.add(new Iciclaw());   Missing Art
//        pokemon.add(new Chillobo());   Missing Art
//        pokemon.add(new Twinklyink());   Missing Art
//        pokemon.add(new Tadbole());   Missing Art
//        pokemon.add(new Frolog());   Missing Art
//        pokemon.add(new Grottoad());   Missing Art
//        pokemon.add(new Firaffa());   Missing Art
//        pokemon.add(new Paladon());   Missing Art
//        pokemon.add(new Wreking());   Missing Art
//        pokemon.add(new Gagild());   Missing Art
//        pokemon.add(new Paramite());   Missing Art
//        pokemon.add(new Cordysect());   Missing Art
//        pokemon.add(new Hissathmum());   Missing Art
//        pokemon.add(new Unispor());   Missing Art
//        pokemon.add(new Bispor());   Missing Art
//        pokemon.add(new Trispor());   Missing Art
//        pokemon.add(new Aubanda());   Missing Art
//        pokemon.add(new Burbanda());   Missing Art
//        pokemon.add(new Babashka());   Missing Art
//        pokemon.add(new Mamashka());   Missing Art
//        pokemon.add(new Gulpy());   Missing Art
//        pokemon.add(new Peroleum());   Missing Art
//        pokemon.add(new Chafern());   Missing Art
//        pokemon.add(new Cirgrus());   Missing Art
//        pokemon.add(new Pavogue());   
//        pokemon.add(new Sovynik());   Missing Art
//        pokemon.add(new Ussernaut());   Missing Art
//        pokemon.add(new Eetie());   Missing Art
//        pokemon.add(new Youefo());   Missing Art
        pokemon.add(new Catopact());   
        pokemon.add(new Spectreflek());   
        pokemon.add(new Polterglas(new Stats(510, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Sleazer());   Missing Art
//        pokemon.add(new Plagrusomr());   Missing Art
//        pokemon.add(new Torspeedo());   Missing Art
//        pokemon.add(new Subuoyant());   Missing Art
//        pokemon.add(new Acrylor());   Missing Art
//        pokemon.add(new Tempoura());   Missing Art
//        pokemon.add(new Gallopere());   Missing Art
//        pokemon.add(new Solbud());   Missing Art
//        pokemon.add(new Grotess());   Missing Art
//        pokemon.add(new Larvequin());   Missing Art
//        pokemon.add(new Harlequeen());   Missing Art
//        pokemon.add(new Teddilite());   Missing Art
//        pokemon.add(new Bearionette());   Missing Art
        pokemon.add(new Oozion());   
        pokemon.add(new Gloopzion(new Stats(480, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
//        pokemon.add(new Nomix());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Clerix());   Missing Art
//        pokemon.add(new Sorcerix());   Missing Art
//        pokemon.add(new Combatix());   Missing Art
//        pokemon.add(new Bandix());   Missing Art
//        pokemon.add(new Judodo());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Solotussle());   Missing Art
//        pokemon.add(new Keewee());   Missing Art
//        pokemon.add(new Behemoa());   Missing Art
//        pokemon.add(new Bisdawn());   Missing Art
//        pokemon.add(new Adeos());   Missing Art
//        pokemon.add(new Aurevora());   Missing Art
//        pokemon.add(new Lamotte());   Missing Art
//        pokemon.add(new Wawalle());   Missing Art
//        pokemon.add(new Villamya());   Missing Art
//        pokemon.add(new Simagedon());   Missing Art
//        pokemon.add(new Kumajr());   Missing Art
    }

}
