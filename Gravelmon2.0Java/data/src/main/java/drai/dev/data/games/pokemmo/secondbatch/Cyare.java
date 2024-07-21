package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.atlas.Bramboom;
import drai.dev.data.pokemon.atlas.Burramble;
import drai.dev.data.pokemon.atlas.Crebb;
import drai.dev.data.pokemon.atlas.Crustocean;
import drai.dev.data.pokemon.atlas.Donguano;
import drai.dev.data.pokemon.atlas.Impac;
import drai.dev.data.pokemon.atlas.Impers;
import drai.dev.data.pokemon.atlas.Impie;
import drai.dev.data.pokemon.atlas.Imploda;
import drai.dev.data.pokemon.atlas.Impulso;
import drai.dev.data.pokemon.atlas.Kotukoatl;
import drai.dev.data.pokemon.atlas.Lamber;
import drai.dev.data.pokemon.atlas.Otamot;
import drai.dev.data.pokemon.atlas.Quetzap;
import drai.dev.data.pokemon.atlas.Scurley;
import drai.dev.data.pokemon.atlas.Sheruption;
import drai.dev.data.pokemon.atlas.Shockatoo;
import drai.dev.data.pokemon.atlas.Tinguano;
import drai.dev.data.pokemon.atlas.Tomabi;
import drai.dev.data.pokemon.atlas.Volpaca;
import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.cyare.*;
import drai.dev.data.pokemon.cyare.Ghouster;
import drai.dev.data.pokemon.rica.Conchorn;
import drai.dev.data.pokemon.rica.Conium;
import drai.dev.data.pokemon.rica.Lumibuzz;
import drai.dev.data.pokemon.rica.Snoosect;

import java.util.*;

public class Cyare extends drai.dev.data.games.registry.Game {
    public Cyare() {
        super("Cyare");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Scurley());
        pokemon.add(new Burramble());
        pokemon.add(new Bramboom());
        pokemon.add(new Lamber());
        pokemon.add(new Volpaca());
        pokemon.add(new Sheruption());
//        pokemon.add(new Pengle()); Member of line Not Finished
//        pokemon.add(new Twaddle()); Member of line Not Finished
//        pokemon.add(new Pengalance());   Missing Art
        pokemon.add(new Grubble()); Member of line Not Finished
        pokemon.add(new Pupive()); Member of line Not Finished
        pokemon.add(new Waspen(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Glittle());   Missing Stats
        pokemon.add(new Lupupa());   Missing Stats
        pokemon.add(new Fluminux(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Aegle());   Missing Stats
        pokemon.add(new Eaglory(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Cavole());   Missing Stats
        pokemon.add(new Cavident(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Quetzap());
        pokemon.add(new Shockatoo());
        pokemon.add(new Kotukoatl());
        pokemon.add(new Grainum());
        pokemon.add(new Tomabi());
        pokemon.add(new Otamot());
        pokemon.add(new Smulb());   Missing Stats
        pokemon.add(new Lillusion());   Missing Stats
        pokemon.add(new Putrigeist(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Bommy());   Missing Stats
        pokemon.add(new Wubunny()); Member of line Not Finished
        pokemon.add(new Froskie());   Missing Stats
        pokemon.add(new Alpaline(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Musiquail());   Missing Stats
        pokemon.add(new Orphestra(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Flurrilli());   Missing Stats
        pokemon.add(new Daffochil());   Missing Stats
        pokemon.add(new Frigivine(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new PekPek());   Missing Stats
        pokemon.add(new Vampeka(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Zeta());   Missing Stats
        pokemon.add(new Gizeta());   Missing Stats
        pokemon.add(new Shogizeta(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Panboo());   Missing Stats
        pokemon.add(new Bansenbu(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Vyrat());   Missing Stats
        pokemon.add(new Miasflow(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Gumla());   Missing Stats
        pokemon.add(new Eucowala(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Kooragant());   Missing Stats
        pokemon.add(new Mockaburra(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Pebblet());   Missing Stats
        pokemon.add(new Peccarock(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Dasypudge());   Missing Stats
        pokemon.add(new Armordillo(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Quafer());   Missing Stats
        pokemon.add(new Orycterra(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Pygnite());   Missing Stats
        pokemon.add(new Pocinder());   Missing Stats
        pokemon.add(new Quolcano(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Chimpunk(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Snoosect());
        pokemon.add(new Lumibuzz());
        pokemon.add(new Loticus());   Missing Stats
        pokemon.add(new Lotiluna(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Avipip());   Missing Stats
        pokemon.add(new Parasquack());   Missing Stats
        pokemon.add(new Peasicant(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Florita());   Missing Stats
        pokemon.add(new Floraia(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Bunoo());   Missing Stats
        pokemon.add(new Boobun(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Wizarda());   Missing Stats
        pokemon.add(new Wizadow(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Ghouster(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats //Renamed from Banshriek
        pokemon.add(new Fenetic());   Missing Stats
        pokemon.add(new Voltient(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Tricity(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Curray(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Cubet());   Missing Stats
        pokemon.add(new Titanice(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Haildeer(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Littull());   Missing Stats
        pokemon.add(new Nobull(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Irritabull(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP)))); Member of line Not Finished
        pokemon.add(new Orukul(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Tinguano());
        pokemon.add(new Donguano());
        pokemon.add(new Khepharoh(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Poisstone(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Conium());
        pokemon.add(new Conchorn());
        pokemon.add(new Liquion(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Cocopow());
        pokemon.add(new Chemko(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Kiwern());   Missing Stats
        pokemon.add(new Wetaket(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Tuatria(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Angemini(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Urnada(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Caprikid());   Missing Stats
        pokemon.add(new Cascaprine(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Flaries(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Vipetro());   Missing Stats
        pokemon.add(new Serpentide(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Moorling());   Missing Stats
        pokemon.add(new Pukana(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Armorca(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Shiverish());   Missing Stats
        pokemon.add(new Glacuda());   Missing Stats
        pokemon.add(new Cryodra()); Member of line Not Finished
        pokemon.add(new Slimug());   Missing Stats
        pokemon.add(new Segnapod()); Member of line Not Finished
        pokemon.add(new Brumbolt());   Missing Stats
        pokemon.add(new Incendaur(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Sukoi());   Missing Stats
        pokemon.add(new Plecoast(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Aquana(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Sakano());   Missing Stats
        pokemon.add(new Sakanodon(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Member of line Not Finished //Renamed from Draphin
        pokemon.add(new Crebb());
        pokemon.add(new Crustocean());
        pokemon.add(new Impie());
        pokemon.add(new Impulso());
        pokemon.add(new Impers());
        pokemon.add(new Imploda());
        pokemon.add(new Impac());
        pokemon.add(new Imprism());
        pokemon.add(new Solare(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Glaciare(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Pluvare(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Caecare(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Caligulare(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Sollis());   Missing Stats
        pokemon.add(new Sollord(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Raptorch());   Missing Stats
        pokemon.add(new Velosickle(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Lophi());   Missing Stats
        pokemon.add(new Ocephus(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Mamby());   Missing Stats
        pokemon.add(new Mamroth(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Frospine());   Missing Stats
        pokemon.add(new Phasmyst());   Missing Stats
        pokemon.add(new Spectrice()); Member of line Not Finished
        pokemon.add(new Chibiryu());   Missing Stats
        pokemon.add(new Midryu());   Missing Stats
        pokemon.add(new Ryurai(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Seaquine(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Greequine(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Orequine(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Draquados(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
    }

}
