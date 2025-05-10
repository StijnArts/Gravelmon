package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.otopo.*;

import java.util.*;
//done
public class Otopo extends drai.dev.data.games.registry.Game {
    public Otopo() {
        super("Otopo");
    }
//TODO update and dex
    @Override
    public void registerPokemon() {
        addNewPokemon(new Elefern());
        addNewPokemon(new Foliphant());
        addNewPokemon(new Forestusk());
        addNewPokemon(new Kinfowl());
        addNewPokemon(new Pyravis());
        addNewPokemon(new Pavonix());
        addNewPokemon(new Cubble());
        addNewPokemon(new Sabroar());
        addNewPokemon(new Striger());
        addNewPokemon(new Chipmunch());
        addNewPokemon(new Munchilla());
        addNewPokemon(new Hunbear());
        addNewPokemon(new Grizlusk());
        addNewPokemon(new Gnawzzle());
        addNewPokemon(new Maniscourge(new Stats(489, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Whirliseed());
        addNewPokemon(new Burlygig());
        addNewPokemon(new Sycanopy());
        addNewPokemon(new Rosepillar());
        addNewPokemon(new Pupenta());
        addNewPokemon(new Cerisefly());
        addNewPokemon(new Snuggrub());
        addNewPokemon(new Furncoon());
        addNewPokemon(new Eruptle());
        addNewPokemon(new Miniral());
        addNewPokemon(new Boliath(new Stats(467, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Watter());
        addNewPokemon(new Marinott(new Stats(476, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Pilomoss());
        addNewPokemon(new Arbomoss());
        addNewPokemon(new Buzzling());
        addNewPokemon(new Furrbee());
        addNewPokemon(new Clonector());
        addNewPokemon(new Antillery());
        addNewPokemon(new Reavair());
        addNewPokemon(new Maraudair(new Stats(476, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Beoleaf());
        addNewPokemon(new Werevine());
        addNewPokemon(new Nocthorne());
        addNewPokemon(new Woodwoo());
        addNewPokemon(new Forowl(new Stats(476, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Gullstal());
        addNewPokemon(new Coasteron());
        addNewPokemon(new Arveeny());
        addNewPokemon(new Lemighty(new Stats(444, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Quink());
        addNewPokemon(new Tadacid());
        addNewPokemon(new Rancroak());
        addNewPokemon(new Gamutrid());
        addNewPokemon(new Duhmbey());
        addNewPokemon(new Vishuslayk());
        addNewPokemon(new Timicharge());
        addNewPokemon(new Ramparent());
        addNewPokemon(new Tatei());
        addNewPokemon(new Kyopir());
        addNewPokemon(new Piroyata());
        addNewPokemon(new Fluffalo());
        addNewPokemon(new Buffofluff());
        addNewPokemon(new Platypud());
        addNewPokemon(new Platypulse(new Stats(465, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Surisand());
        addNewPokemon(new Surislash(new Stats(432, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Zappinch());
        addNewPokemon(new Parrocity());
        addNewPokemon(new Peaby());
        addNewPokemon(new Papea());
        addNewPokemon(new Tabuki(new Stats(410, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));
        addNewPokemon(new Halseaon());
        addNewPokemon(new Ventilio());
        addNewPokemon(new Katanicut());
        addNewPokemon(new Fibraark());
        addNewPokemon(new Snarligatr());
        addNewPokemon(new Ferocidile(new Stats(475, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Gorbler());
        addNewPokemon(new Gaiaminth(new Stats(467, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Costanut());
        addNewPokemon(new Decareca(new Stats(456, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Akakeru());
        addNewPokemon(new Keruguru());
        addNewPokemon(new Kerukeru());
        addNewPokemon(new Seevil(new Stats(356, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Mimicnid());
        addNewPokemon(new Tasmaniac());
        addNewPokemon(new Toxipine());
        addNewPokemon(new Venetreme(new Stats(456, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Ozzapi());
        addNewPokemon(new Oscillacone(new Stats(467, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Volswine());
        addNewPokemon(new Blitzhogg(new Stats(467, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Scarug());
        addNewPokemon(new Crypcoon());
        addNewPokemon(new Sarcofomoth());
        addNewPokemon(new Gubeluto());
//        addNewPokemon(new Mossroc()); Member of line Not Finished
//        addNewPokemon(new Ickko()); Member of line Not Finished
        addNewPokemon(new Cubrosus());
        addNewPokemon(new Feranther());
        addNewPokemon(new Orialisk());
        addNewPokemon(new Tripulcre());
        addNewPokemon(new Flittervolt());
        addNewPokemon(new Bakkabolt(new Stats(476, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Dragite());
        addNewPokemon(new Crushaur());
        addNewPokemon(new Tiamond(new Stats(536, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Folfaun());
        addNewPokemon(new Elklore(new Stats(487, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Canifang());
        addNewPokemon(new Scuffulent());   
        addNewPokemon(new Fracactus(new Stats(457, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Salasander(new Stats(356, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Alpalpa());   
        addNewPokemon(new Pacalaya(new Stats(467, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Molooze());   
        addNewPokemon(new Escargoo());
        addNewPokemon(new Tundrimp());   
        addNewPokemon(new Gigice(new Stats(478, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Froskijo(new Stats(478, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Wintweet());   
        addNewPokemon(new Frosbeak(new Stats(460, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Glaceor());
        addNewPokemon(new Iceteroid());
        addNewPokemon(new Pangoloo());
        addNewPokemon(new Snoat());
        addNewPokemon(new Sleasel());
        addNewPokemon(new Glacermine(new Stats(510, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Toyrosaur());   
        addNewPokemon(new Stegotoy(new Stats(531, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Jellestrial());   
        addNewPokemon(new Medusien());
        addNewPokemon(new Tantan());   
        addNewPokemon(new Natugnaro(new Stats(510, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Ankarmor());
        addNewPokemon(new Kilosor(new Stats(510, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.ATTACK))));
        addNewPokemon(new Therospine());   
        addNewPokemon(new Theroroar(new Stats(510, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Rapraider(new Stats(510, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Flammtern());   
        addNewPokemon(new Yokorch(new Stats(487, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Stubby()); //renamed Rockid
        addNewPokemon(new Stuckorn(new Stats(486, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE)))); //   renamed from Stuckorn
        addNewPokemon(new Rocstrich(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Venoraze());   
        addNewPokemon(new Toxerno(new Stats(521, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Aridamel());   
        addNewPokemon(new Deserdary(new Stats(498, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.HP))));
        addNewPokemon(new Diploracus());   
        addNewPokemon(new Floradocus(new Stats(532, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Kakapow(new Stats(453, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Beetler());   
        addNewPokemon(new Caratarge());   
        addNewPokemon(new Pavapace(new Stats(511, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Geonigma(new Stats(344, StatArchetype.FAST_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Smokwi());
        addNewPokemon(new Iguava());   
        addNewPokemon(new Modovoldo(new Stats(487, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Jackajolt());
        addNewPokemon(new Panburn());   
        addNewPokemon(new Panblaze(new Stats(512, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Flamhopper(new Stats(411, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Hornbully(new Stats(411, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Mantini());   
        addNewPokemon(new Thanatis(new Stats(456, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Unode());
        addNewPokemon(new Dioduo());
        addNewPokemon(new Quadrarity());
        addNewPokemon(new Cisburn(new Stats(344, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Foaltasm());   
        addNewPokemon(new Stallighast(new Stats(498, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Robutler());
        addNewPokemon(new Waitroid());
        addNewPokemon(new Pinacier());
        addNewPokemon(new Narcicle());
        addNewPokemon(new Gulpit(new Stats(412, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Sparrawk());   
        addNewPokemon(new Falswain());   
        addNewPokemon(new Naviator());
        addNewPokemon(new Callimeeko());
        addNewPokemon(new Quokkute());
        addNewPokemon(new Coralpus());
        addNewPokemon(new Paratorte(new Stats(412, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Vegebun());
        addNewPokemon(new Grinyan());
        addNewPokemon(new Talpastar(new Stats(324, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Cassoworry(new Stats(324, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Flysh());   
        addNewPokemon(new Skoi(new Stats(456, StatArchetype.FAST_MIXED_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Magnymph());   
        addNewPokemon(new Polaragon(new Stats(456, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Psylet());   
        addNewPokemon(new Oracowl(new Stats(456, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Sansque());   
        addNewPokemon(new Granuken(new Stats(512, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Lamentra());   
        addNewPokemon(new Bittergeist(new Stats(480, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Cherisoul(new Stats(480, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Tarseek());   
        addNewPokemon(new Buddaki(new Stats(488, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Jestar(new Stats(423, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Lunbun(new Stats(423, StatArchetype.FAST_PHYSICAL_ATTACKER,
                        List.of(StatType.SPEED))));
        addNewPokemon(new Lichyrm());
        addNewPokemon(new Hornbeet());   
        addNewPokemon(new Tengushi(new Stats(487, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK))));
        addNewPokemon(new Adjie());   
        addNewPokemon(new Majee());   
        addNewPokemon(new Latarajee(new Stats(522, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Goraseed());   
        addNewPokemon(new Mandroxica(new Stats(512, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Rocurrent());
        addNewPokemon(new Cryzlect());
        addNewPokemon(new Electrec());
        addNewPokemon(new Perfomask(new Stats(342, StatArchetype.FAST_SUPPORT,
                List.of(StatType.HP))));
        addNewPokemon(new Perlusc());
        addNewPokemon(new Nacrelusc(new Stats(451, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Poisnip());   
        addNewPokemon(new Scyrmpion(new Stats(487, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Anemular(new Stats(432, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Submurchible(new Stats(311, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Timekreepa(new Stats(343, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Compawtriot(new Stats(400, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Tamanome());
        addNewPokemon(new Tamakomu());
        addNewPokemon(new Honokomu());
        addNewPokemon(new Tatakomu());
        addNewPokemon(new Mizukomu());
        addNewPokemon(new Majokomu());
        addNewPokemon(new Damakomu());
        addNewPokemon(new Sokukomu());
        addNewPokemon(new Leafdra());   
        addNewPokemon(new Terradra(new Stats(534, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Flamdra());
        addNewPokemon(new Vulcadra());
        addNewPokemon(new Oceadra());   
        addNewPokemon(new Peladra(new Stats(534, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Vivizard());
        addNewPokemon(new Prizmazor());
        addNewPokemon(new Faberon());
        addNewPokemon(new Dragerg());
        addNewPokemon(new Harpiveran());
        addNewPokemon(new Orderion(new Stats(680, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.DEFENCE))));
        addNewPokemon(new Anarchaic());
        addNewPokemon(new Esoterra());
        addNewPokemon(new Axolovl());
    }

}
