package drai.dev.data.games.pokemmo.done;


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
        pokemon.add(new Elefern());
        pokemon.add(new Foliphant());
        pokemon.add(new Forestusk());
        pokemon.add(new Kinfowl());
        pokemon.add(new Pyravis());
        pokemon.add(new Pavonix());
        pokemon.add(new Cubble());
        pokemon.add(new Sabroar());
        pokemon.add(new Striger());
        pokemon.add(new Chipmunch());
        pokemon.add(new Munchilla());
        pokemon.add(new Hunbear());
        pokemon.add(new Grizlusk());
        pokemon.add(new Gnawzzle());
        pokemon.add(new Maniscourge(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Whirliseed());
        pokemon.add(new Burlygig());
        pokemon.add(new Sycanopy());
        pokemon.add(new Rosepillar());
        pokemon.add(new Pupenta());
        pokemon.add(new Cerisefly());
        pokemon.add(new Snuggrub());
        pokemon.add(new Furncoon());
        pokemon.add(new Eruptle());
        pokemon.add(new Miniral());
        pokemon.add(new Boliath(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Watter());
        pokemon.add(new Marinott(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Pilomoss());
        pokemon.add(new Arbomoss());
        pokemon.add(new Buzzling());
        pokemon.add(new Furrbee());
        pokemon.add(new Clonector());
        pokemon.add(new Antillery());
        pokemon.add(new Reavair());
        pokemon.add(new Maraudair(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Beoleaf());
        pokemon.add(new Werevine());
        pokemon.add(new Nocthorne());
        pokemon.add(new Gullstal());
        pokemon.add(new Coasteron());
        pokemon.add(new Arveeny());
        pokemon.add(new Lemighty(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Quink());
        pokemon.add(new Tadacid());
        pokemon.add(new Rancroak());
        pokemon.add(new Gamutrid());
        pokemon.add(new Duhmbey());
        pokemon.add(new Vishuslayk());
        pokemon.add(new Timicharge());
        pokemon.add(new Ramparent());
        pokemon.add(new Tatei());
        pokemon.add(new Kyopir());
        pokemon.add(new Piroyata());
        pokemon.add(new Platypud());
        pokemon.add(new Platypulse(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Surisand());
        pokemon.add(new Surislash(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Zappinch());
        pokemon.add(new Parrocity());
        pokemon.add(new Peaby());
        pokemon.add(new Papea());
        pokemon.add(new Tabuki(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Halseaon());
        pokemon.add(new Ventilio());
        pokemon.add(new Katanicut());
        pokemon.add(new Fibraark());
        pokemon.add(new Snarligatr());
        pokemon.add(new Ferocidile(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Gorbler());
        pokemon.add(new Gaiaminth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Costanut());
        pokemon.add(new Decareca(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Akakeru());
        pokemon.add(new Keruguru());
        pokemon.add(new Kerukeru());
        pokemon.add(new Seevil(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Mimicnid());
        pokemon.add(new Tasmaniac());
        pokemon.add(new Toxipine());
        pokemon.add(new Venetreme(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Ozzapi());
        pokemon.add(new Oscillacone(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Volswine());
        pokemon.add(new Blitzhogg(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Scarug());
        pokemon.add(new Crypcoon());
        pokemon.add(new Sarcofomoth());
        pokemon.add(new Gubeluto());
        pokemon.add(new Barrenoose(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Cubrosus());
        pokemon.add(new Feranther());
        pokemon.add(new Orialith());
        pokemon.add(new Tripulcre());
        pokemon.add(new Flittervolt());
        pokemon.add(new Bakkabolt(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Dragite());
        pokemon.add(new Crushaur());
        pokemon.add(new Tiamond(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Folfaun());
        pokemon.add(new Elklore(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Woodwoo());
        pokemon.add(new Forowl(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Canifang());
//        pokemon.add(new Scuffulent());   Missing Stats
//        pokemon.add(new Fracactus());   Missing Stats
//        pokemon.add(new Salasander());   Missing Stats
//        pokemon.add(new Alpalpa());   Missing Stats
//        pokemon.add(new Pacalaya());   Missing Stats
//        pokemon.add(new Molooze());   Missing Stats
        addNewPokemon(new Escargoo());
//        pokemon.add(new Tundrimp());   Missing Stats
//        pokemon.add(new Gigice());   Missing Stats
//        pokemon.add(new Froskijo());   Missing Stats
//        pokemon.add(new Wintweet());   Missing Stats
//        pokemon.add(new Frosbeak());   Missing Stats
        addNewPokemon(new Glaceor());
        addNewPokemon(new Iceteroid());
        addNewPokemon(new Pangoloo());
        addNewPokemon(new Snoat());
//        pokemon.add(new Glacermine());   Missing Stats
//        pokemon.add(new Toyrosaur());   Missing Stats
//        pokemon.add(new Stegotoy());   Missing Stats
//        pokemon.add(new Jellestrial());   Missing Stats
        addNewPokemon(new Medusien());
//        pokemon.add(new Tantan());   Missing Stats
//        pokemon.add(new Natugnaro());   Missing Stats
        addNewPokemon(new Ankarmor());
//        pokemon.add(new Ankyolith());   Missing Stats
//        pokemon.add(new Therospine());   Missing Stats
//        pokemon.add(new Theroroar());   Missing Stats
//        pokemon.add(new Rapraider());   Missing Stats
//        pokemon.add(new Flammtern());   Missing Stats
//        pokemon.add(new Yokorch());   Missing Stats
//        pokemon.add(new Rockid());   Missing Stats
//        pokemon.add(new Stubhorn());   Missing Stats
//        pokemon.add(new Rocstrich());   Missing Stats
//        pokemon.add(new Venoraze());   Missing Stats
//        pokemon.add(new Toxerno());   Missing Stats
//        pokemon.add(new Aridamel());   Missing Stats
//        pokemon.add(new Deserdary());   Missing Stats
//        pokemon.add(new Diploracus());   Missing Stats
//        pokemon.add(new Floradocus());   Missing Stats
//        pokemon.add(new Kakapow());   Missing Stats
//        pokemon.add(new Beetler());   Missing Stats
//        pokemon.add(new Caratarge());   Missing Stats
//        pokemon.add(new Pavapace());   Missing Stats
//        pokemon.add(new Geonigma());   Missing Stats
        addNewPokemon(new Smokwi());
//        pokemon.add(new Iguava());   Missing Stats
//        pokemon.add(new Modovoldo());   Missing Stats
        addNewPokemon(new Jackajolt());
//        pokemon.add(new Panburn());   Missing Stats
//        pokemon.add(new Panblaze());   Missing Stats
//        pokemon.add(new Flamhopper());   Missing Stats
//        pokemon.add(new Mantini());   Missing Stats
//        pokemon.add(new Thanatis());   Missing Stats
//        pokemon.add(new Unode());   Missing Stats
//        pokemon.add(new Dioduo());   Missing Stats
        addNewPokemon(new Quadrarity());
//        pokemon.add(new Cisburn());   Missing Stats
//        pokemon.add(new Foaltasm());   Missing Stats
//        pokemon.add(new Stallighast());   Missing Stats
        addNewPokemon(new Robutler());
        addNewPokemon(new Waitroid());
//        pokemon.add(new Pinacier());   Missing Stats
        addNewPokemon(new Narcicle());
//        pokemon.add(new Gulpit());   Missing Stats
//        pokemon.add(new Sparrawk());   Missing Stats
//        pokemon.add(new Falswain());   Missing Stats
        addNewPokemon(new Naviator());
        addNewPokemon(new Callimeeko());
        addNewPokemon(new Quokkute());
        addNewPokemon(new Coralpus());
//        pokemon.add(new Paratorte());   Missing Stats
        addNewPokemon(new Vegebun());
        addNewPokemon(new Grinyan());
//        pokemon.add(new Talpastar());   Missing Stats
//        pokemon.add(new Cassoworry());   Missing Stats
//        pokemon.add(new Flysh());   Missing Stats
//        pokemon.add(new Skoi());   Missing Stats
//        pokemon.add(new Magnymph());   Missing Stats
//        pokemon.add(new Polaragon());   Missing Stats
//        pokemon.add(new Psylet());   Missing Stats
//        pokemon.add(new Oracowl());   Missing Stats
//        pokemon.add(new Sansque());   Missing Stats
//        pokemon.add(new Granuken());   Missing Stats
//        pokemon.add(new Lossoul());   Missing Stats
//        pokemon.add(new Pyromen());   Missing Stats
//        pokemon.add(new Serasoul());   Missing Stats
//        pokemon.add(new Tarseek());   Missing Stats
//        pokemon.add(new Buddaki());   Missing Stats
//        pokemon.add(new Jestar());   Missing Stats
//        pokemon.add(new Hornbeet());   Missing Stats
//        pokemon.add(new Butobeet());   Missing Stats
//        pokemon.add(new Adjie());   Missing Stats
//        pokemon.add(new Majee());   Missing Stats
//        pokemon.add(new Latarajee());   Missing Stats
//        pokemon.add(new Goraseed());   Missing Stats
//        pokemon.add(new Mandroxica());   Missing Stats
        addNewPokemon(new Cryzlect());
//        pokemon.add(new Perfomask());   Missing Stats
        addNewPokemon(new Perlusc());
//        pokemon.add(new Nacrelusc());   Missing Stats
//        pokemon.add(new Poisnip());   Missing Stats
//        pokemon.add(new Scyrmpion());   Missing Stats
//        pokemon.add(new Submurchible());   Missing Stats
//        pokemon.add(new Timekreepa());   Missing Stats
//        pokemon.add(new Compawtriot());   Missing Stats
        addNewPokemon(new Tamanome());
        addNewPokemon(new Tamakomu());
        addNewPokemon(new Honokomu());
        addNewPokemon(new Tatakomu());
        addNewPokemon(new Mizukomu());
        addNewPokemon(new Majokomu());
        addNewPokemon(new Damakomu());
        addNewPokemon(new Sokukomu());
//        pokemon.add(new Leafdra());   Missing Stats
//        pokemon.add(new Terradra());   Missing Stats
        addNewPokemon(new Flamdra());
        addNewPokemon(new Vulcadra());
//        pokemon.add(new Oceadra());   Missing Stats
//        pokemon.add(new Peladra());   Missing Stats
        addNewPokemon(new Vivizard());
        addNewPokemon(new Prizmazor());
        addNewPokemon(new Faberon());
        addNewPokemon(new Dragerg());
        addNewPokemon(new Anarchaic());
//        pokemon.add(new Orderion());   Missing Stats
        addNewPokemon(new Harpiveran());
        addNewPokemon(new Esoterra());
        addNewPokemon(new Axolovl());
    }

}
