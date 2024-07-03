package drai.dev.gravelmon.games.pokemmo.secondbatch;


import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.oceane.Jawee;
import drai.dev.gravelmon.pokemon.oceane.Jawsome;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Goetia extends drai.dev.gravelmon.games.registry.Game {
    public Goetia() {
        super("Goetia");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new Nymfaun());   Missing Stats
//        pokemon.add(new Faeribou());   Missing Stats
//        pokemon.add(new Moosquatch());   Missing Stats
//        pokemon.add(new Slowth());   Missing Stats
//        pokemon.add(new Mossloth());   Missing Stats
//        pokemon.add(new Slowgrowth());   Missing Stats
//        pokemon.add(new Pinonkey());   Missing Stats
//        pokemon.add(new Donkeyata());   Missing Stats
//        pokemon.add(new Fiestaur());   Missing Stats
//        pokemon.add(new Taratinder());   Missing Stats
//        pokemon.add(new Tarantorch());   Missing Stats
//        pokemon.add(new Charantula());   Missing Stats
//        pokemon.add(new Seamian());   Missing Stats
//        pokemon.add(new Mermonkey());   Missing Stats
//        pokemon.add(new Panseidon());   Missing Stats
//        pokemon.add(new Cowet());   Missing Stats
//        pokemon.add(new Moistox());   Missing Stats
//        pokemon.add(new Buffaloam());   Missing Stats
//        pokemon.add(new Glaby());   Missing Stats
//        pokemon.add(new Glaboar());   Missing Stats
//        pokemon.add(new Weevoll());   Missing Stats
//        pokemon.add(new Bollweave());   Missing Stats
//        pokemon.add(new Beegan());   Missing Stats
//        pokemon.add(new Beegarden());   Missing Stats
//        pokemon.add(new Hikoon());   Missing Stats
//        pokemon.add(new Emoth());   Missing Stats
//        pokemon.add(new Houndworm());   Missing Stats
//        pokemon.add(new Wearwolf());   Missing Stats
//        pokemon.add(new Fursoot());   Missing Stats
//        pokemon.add(new Lousidogg());   Missing Stats
//        pokemon.add(new Gooeyduck());   Missing Stats
//        pokemon.add(new Gooeygoose());   Missing Stats
//        pokemon.add(new Poofly());   Missing Stats
//        pokemon.add(new Beelobuzz());   Missing Stats
//        pokemon.add(new Spitsen());   Missing Stats
//        pokemon.add(new Salimute());   Missing Stats
//        pokemon.add(new Slobbernard());   Missing Stats
//        pokemon.add(new Burroworm());   Missing Stats
//        pokemon.add(new Bingus());   Missing Stats
//        pokemon.add(new Crungus());   Missing Stats
//        pokemon.add(new Sphingus());   Missing Stats
//        pokemon.add(new Grubolt());   Missing Stats
//        pokemon.add(new Zapupa());   Missing Stats
//        pokemon.add(new Buzzkill());   Missing Stats
//        pokemon.add(new Mayflown());   Missing Stats
//        pokemon.add(new Bleech());   Missing Stats
//        pokemon.add(new Hiruleech());   Missing Stats
//        pokemon.add(new Lampupa());   Missing Stats
//        pokemon.add(new Glowyrm());   Missing Stats
//        pokemon.add(new Decompost());   Missing Stats
//        pokemon.add(new Gorgompost());   Missing Stats
//        pokemon.add(new Flamingoop());   Missing Stats
//        pokemon.add(new Beddybug());   Missing Stats
//        pokemon.add(new Honeyjou());   Missing Stats
//        pokemon.add(new Glutthoney());   Missing Stats
//        pokemon.add(new Mintooth());   Missing Stats
//        pokemon.add(new Icypod());   Missing Stats
//        pokemon.add(new Isoberg());   Missing Stats
//        pokemon.add(new Rumpork());   Missing Stats
//        pokemon.add(new Porkupid());   Missing Stats
//        pokemon.add(new Brickabrack());   Missing Stats
//        pokemon.add(new Brickwald());   Missing Stats
//        pokemon.add(new Brickozuna());   Missing Stats
//        pokemon.add(new Toadsgool());   Missing Stats
//        pokemon.add(new Acrology());   Missing Stats
//        pokemon.add(new Astropheles());   Missing Stats
//        pokemon.add(new Tarankey());   Missing Stats
//        pokemon.add(new Tarankong());   Missing Stats
//        pokemon.add(new Plagior());   Missing Stats
//        pokemon.add(new Beeball());   Missing Stats
//        pokemon.add(new Beemason());   Missing Stats
//        pokemon.add(new Beebegone());   Missing Stats
//        pokemon.add(new Sparkete());   Missing Stats
//        pokemon.add(new Plasmakate());   Missing Stats
//        pokemon.add(new Plasmagician());   Missing Stats
//        pokemon.add(new Balloony());   Missing Stats
//        pokemon.add(new Derangible());   Missing Stats
//        pokemon.add(new Dadrone());   Missing Stats
//        pokemon.add(new Airlantic());   Missing Stats
//        pokemon.add(new Chumbas());   Missing Stats
//        pokemon.add(new Chunderbolt());   Missing Stats
//        pokemon.add(new Bogchamp());   Missing Stats
//        pokemon.add(new Marisite());   Missing Stats
//        pokemon.add(new Marrowite());   Missing Stats
//        pokemon.add(new Barrelsite());   Missing Stats
//        pokemon.add(new Squorm());   Missing Stats
//        pokemon.add(new Ragrand());   Missing Stats
//        pokemon.add(new Bobbilisk());   Missing Stats
//        pokemon.add(new Boggeyman());   Missing Stats
//        pokemon.add(new Shockter());   Missing Stats
//        pokemon.add(new Surgeon());   Missing Stats
//        pokemon.add(new Belfry());   Missing Stats
//        pokemon.add(new Strigori());   Missing Stats
//        pokemon.add(new Demontor());   Missing Stats
//        pokemon.add(new Rotegg());   Missing Stats
//        pokemon.add(new Fowlest());   Missing Stats
//        pokemon.add(new Krakatori());   Missing Stats
//        pokemon.add(new Nematon());   Missing Stats
//        pokemon.add(new Helminthon());   Missing Stats
//        pokemon.add(new Capaciton());   Missing Stats
//        pokemon.add(new Trematon());   Missing Stats
//        pokemon.add(new Cylily());   Missing Stats
//        pokemon.add(new Tamanily());   Missing Stats
//        pokemon.add(new Verdanteater());   Missing Stats
//        pokemon.add(new Rowbug());   Missing Stats
//        pokemon.add(new Bugboat());   Missing Stats
//        pokemon.add(new Scaround());   Missing Stats
//        pokemon.add(new Scaroyal());   Missing Stats
//        pokemon.add(new Scarazor());   Missing Stats
//        pokemon.add(new Gremtrail());   Missing Stats
//        pokemon.add(new Araphosa());   Missing Stats
//        pokemon.add(new Zaraphosa());   Missing Stats
//        pokemon.add(new Waruphosa());   Missing Stats
//        pokemon.add(new Aviculor());   Missing Stats
//        pokemon.add(new Nepixie());   Missing Stats
//        pokemon.add(new Neprite());   Missing Stats
//        pokemon.add(new Nympenthes());   Missing Stats
//        pokemon.add(new Neprechaun());   Missing Stats
//        pokemon.add(new Ghoti());   Missing Stats
//        pokemon.add(new Inferatu());   Missing Stats
//        pokemon.add(new Astronotilus());   Missing Stats
//        pokemon.add(new Snotme());   Missing Stats
//        pokemon.add(new Facsimilee());   Missing Stats
//        pokemon.add(new Theftidee());   Missing Stats
//        pokemon.add(new Lansquid());   Missing Stats
//        pokemon.add(new Calispade());   Missing Stats
//        pokemon.add(new Archraken());   Missing Stats
//        pokemon.add(new Larvot());   Missing Stats
//        pokemon.add(new Rabbot());   Missing Stats
//        pokemon.add(new Grunje());   Missing Stats
//        pokemon.add(new Grunjerk());   Missing Stats
//        pokemon.add(new Magboil());   Missing Stats
//        pokemon.add(new Docteria());   Missing Stats
//        pokemon.add(new Epimedic());   Missing Stats
//        pokemon.add(new Padull());   Missing Stats
//        pokemon.add(new Sawface());   Missing Stats
//        pokemon.add(new Smogout());   Missing Stats
//        pokemon.add(new Miasmog());   Missing Stats
//        pokemon.add(new Hydura());   Missing Stats
//        pokemon.add(new Scyllabyss());   Missing Stats
//        pokemon.add(new Medusting());   Missing Stats
//        pokemon.add(new Charybyss());   Missing Stats
//        pokemon.add(new Nepolyp());   Missing Stats
//        pokemon.add(new Polypitcher());   Missing Stats
//        pokemon.add(new Polypenthes());   Missing Stats
//        pokemon.add(new Trogleech());   Missing Stats
//        pokemon.add(new Troglobite());   Missing Stats
//        pokemon.add(new Troglobeast());   Missing Stats
//        pokemon.add(new Flattery());   Missing Stats
//        pokemon.add(new Oddcast());   Missing Stats
//        pokemon.add(new Pozzombie());   Missing Stats
//        pokemon.add(new Barnacorn());   Missing Stats
//        pokemon.add(new Barnoose());   Missing Stats
//        pokemon.add(new Feferococo());   Missing Stats
//        pokemon.add(new Saccarin());   Missing Stats
//        pokemon.add(new Woebegong());   Missing Stats
//        pokemon.add(new Rivotter());   Missing Stats
//        pokemon.add(new Jaguatter());   Missing Stats
//        pokemon.add(new Mabalone());   Missing Stats
//        pokemon.add(new Mollusciron());   Missing Stats
//        pokemon.add(new Larvatinum());   Missing Stats
//        pokemon.add(new Cassowar());   Missing Stats
//        pokemon.add(new Casspartan());   Missing Stats
//        pokemon.add(new Ornake());   Missing Stats
//        pokemon.add(new Flamboa());   Missing Stats
//        pokemon.add(new Flitch());   Missing Stats
//        pokemon.add(new Fitorfly());   Missing Stats
//        pokemon.add(new Supafly());   Missing Stats
//        pokemon.add(new Borpion());   Missing Stats
//        pokemon.add(new Panorpion());   Missing Stats
//        pokemon.add(new Canibble());   Missing Stats
//        pokemon.add(new Peernut());   Missing Stats
//        pokemon.add(new Embrystic());   Missing Stats
//        pokemon.add(new Shromp());   Missing Stats
//        pokemon.add(new Clobster());   Missing Stats
//        pokemon.add(new Prawnage());   Missing Stats
//        pokemon.add(new Shrude());   Missing Stats
//        pokemon.add(new Radfink());   Missing Stats
//        pokemon.add(new Fluffloat());   Missing Stats
//        pokemon.add(new Colonoodle());   Missing Stats
//        pokemon.add(new Tenthereal());   Missing Stats
//        pokemon.add(new Jelectric());   Missing Stats
//        pokemon.add(new Jelightning());   Missing Stats
//        pokemon.add(new Huffalimp());   Missing Stats
//        pokemon.add(new Burstank());   Missing Stats
//        pokemon.add(new Debutaint());   Missing Stats
//        pokemon.add(new Promenude());   Missing Stats
//        pokemon.add(new Glautillion());   Missing Stats
//        pokemon.add(new Lilacorn());   Missing Stats
//        pokemon.add(new Wisterious());   Missing Stats
//        pokemon.add(new Cattermaul());   Missing Stats
//        pokemon.add(new Katybud());   Missing Stats
//        pokemon.add(new Thornydid());   Missing Stats
//        pokemon.add(new Candelaria());   Missing Stats
//        pokemon.add(new Lanternaria());   Missing Stats
//        pokemon.add(new Crestrap());   Missing Stats
//        pokemon.add(new Sundraco());   Missing Stats
//        pokemon.add(new Eelabyss());   Missing Stats
//        pokemon.add(new Loguts());   Missing Stats
//        pokemon.add(new Herocust());   Missing Stats
//        pokemon.add(new Mustmite());   Missing Stats
//        pokemon.add(new Dustmighty());   Missing Stats
//        pokemon.add(new Aardvolt());   Missing Stats
//        pokemon.add(new Catfeine());   Missing Stats
//        pokemon.add(new Kittypillar());   Missing Stats
//        pokemon.add(new Fuzzilk());   Missing Stats
//        pokemon.add(new Bombun());   Missing Stats
//        pokemon.add(new Stingray());   Missing Stats
//        pokemon.add(new Suglide());   Missing Stats
//        pokemon.add(new Coolugo());   Missing Stats
//        pokemon.add(new Luxuroe());   Missing Stats
//        pokemon.add(new Aristocarp());   Missing Stats
//        pokemon.add(new Icesight());   Missing Stats
//        pokemon.add(new Icestalk());   Missing Stats
//        pokemon.add(new Venigoon());   Missing Stats
//        pokemon.add(new Venigaloot());   Missing Stats
//        pokemon.add(new Charmix());   Missing Stats
//        pokemon.add(new Charmatch());   Missing Stats
//        pokemon.add(new Ravolt());   Missing Stats
//        pokemon.add(new Lubub());   Missing Stats
//        pokemon.add(new Heartery());   Missing Stats
//        pokemon.add(new Ventherm());   Missing Stats
//        pokemon.add(new Volchemo());   Missing Stats
//        pokemon.add(new Tublip());   Missing Stats
//        pokemon.add(new Narpoon());   Missing Stats
//        pokemon.add(new Hantom());   Missing Stats
//        pokemon.add(new Spectouch());   Missing Stats
        pokemon.add(new Jawee());
        pokemon.add(new Jawsome());
//        pokemon.add(new Whirlybug());   Missing Stats
//        pokemon.add(new Shellicopter());   Missing Stats
//        pokemon.add(new Aviatrice());   Missing Stats
//        pokemon.add(new Hagloop());   Missing Stats
//        pokemon.add(new Nyareis());   Missing Stats
//        pokemon.add(new Eunash());   Missing Stats
//        pokemon.add(new Termini());   Missing Stats
//        pokemon.add(new Termulch());   Missing Stats
//        pokemon.add(new Termajesty());   Missing Stats
//        pokemon.add(new Toxsick());   Missing Stats
//        pokemon.add(new Sirenatee());   Missing Stats
//        pokemon.add(new Elegrace());   Missing Stats
//        pokemon.add(new Hierophant());   Missing Stats
//        pokemon.add(new Nitpick());   Missing Stats
//        pokemon.add(new Cootiepie());   Missing Stats
//        pokemon.add(new Gurugan());   Missing Stats
//        pokemon.add(new Guruvelt());   Missing Stats
//        pokemon.add(new Pierrot());   Missing Stats
//        pokemon.add(new Aukward());   Missing Stats
//        pokemon.add(new Puffoon());   Missing Stats
//        pokemon.add(new Icykandji());   Missing Stats
//        pokemon.add(new Iglookandji());   Missing Stats
//        pokemon.add(new Sparassid());   Missing Stats
//        pokemon.add(new Crickid());   Missing Stats
//        pokemon.add(new Grylloket());   Missing Stats
//        pokemon.add(new Coolstroyr());   Missing Stats
//        pokemon.add(new Lorable());   Missing Stats
//        pokemon.add(new Sproutot());   Missing Stats
//        pokemon.add(new Scaregrow());   Missing Stats
//        pokemon.add(new Elefin());   Missing Stats
//        pokemon.add(new Makarel());   Missing Stats
//        pokemon.add(new Brackish());   Missing Stats
//        pokemon.add(new Lagoon());   Missing Stats
//        pokemon.add(new Billabong());   Missing Stats
//        pokemon.add(new Lizava());   Missing Stats
//        pokemon.add(new Bugbear());   Missing Stats
//        pokemon.add(new Caesoil());   Missing Stats
//        pokemon.add(new Mudragon());   Missing Stats
//        pokemon.add(new Spyaye());   Missing Stats
//        pokemon.add(new Scryaye());   Missing Stats
//        pokemon.add(new Ewwgie());   Missing Stats
//        pokemon.add(new Skeezer());   Missing Stats
//        pokemon.add(new Tenrock());   Missing Stats
//        pokemon.add(new Ratstar());   Missing Stats
//        pokemon.add(new Polyfreight());   Missing Stats
//        pokemon.add(new Tuskoar());   Missing Stats
//        pokemon.add(new Tuskoble());   Missing Stats
//        pokemon.add(new Gastare());   Missing Stats
//        pokemon.add(new Espergo());   Missing Stats
//        pokemon.add(new Psyphon());   Missing Stats
//        pokemon.add(new Psydaria());   Missing Stats
//        pokemon.add(new Malease());   Missing Stats
//        pokemon.add(new Bohole());   Missing Stats
//        pokemon.add(new Peathog());   Missing Stats
//        pokemon.add(new Wartbog());   Missing Stats
//        pokemon.add(new Pictog());   Missing Stats
//        pokemon.add(new Androck());   Missing Stats
//        pokemon.add(new Maningauz());   Missing Stats
//        pokemon.add(new Sarcophacoon());   Missing Stats
//        pokemon.add(new Beedazzle());   Missing Stats
//        pokemon.add(new Wormachine());   Missing Stats
//        pokemon.add(new Denkipede());   Missing Stats
//        pokemon.add(new Traplure());   Missing Stats
//        pokemon.add(new Axelure());   Missing Stats
//        pokemon.add(new Abyspook());   Missing Stats
//        pokemon.add(new Abyssoul());   Missing Stats
//        pokemon.add(new Catterbrain());   Missing Stats
//        pokemon.add(new Twistree());   Missing Stats
//        pokemon.add(new Twisbee());   Missing Stats
//        pokemon.add(new Figabee());   Missing Stats
//        pokemon.add(new Fumball());   Missing Stats
//        pokemon.add(new Trickytreat());   Missing Stats
//        pokemon.add(new Woodron());   Missing Stats
//        pokemon.add(new Troytron());   Missing Stats
//        pokemon.add(new Monstauk());   Missing Stats
//        pokemon.add(new Monstale());   Missing Stats
//        pokemon.add(new Caskry());   Missing Stats
//        pokemon.add(new Mausomber());   Missing Stats
//        pokemon.add(new Widoweb());   Missing Stats
//        pokemon.add(new Widowitch());   Missing Stats
//        pokemon.add(new Impelial());   Missing Stats
//        pokemon.add(new Ashmodeus());   Missing Stats
//        pokemon.add(new Marlequin());   Missing Stats
//        pokemon.add(new Kojaku());   Missing Stats
//        pokemon.add(new Fujaku());   Missing Stats
//        pokemon.add(new Vasbar());   Missing Stats
//        pokemon.add(new Combatant());   Missing Stats
//        pokemon.add(new Sergeant());   Missing Stats
//        pokemon.add(new Militant());   Missing Stats
//        pokemon.add(new Puffume());   Missing Stats
//        pokemon.add(new Smogstack());   Missing Stats
//        pokemon.add(new Hazrat());   Missing Stats
//        pokemon.add(new Atomant());   Missing Stats
//        pokemon.add(new Mirorim());   Missing Stats
//        pokemon.add(new Abstrarts());   Missing Stats
//        pokemon.add(new Petrosaur());   Missing Stats
//        pokemon.add(new Quartzcoatl());   Missing Stats
//        pokemon.add(new Spinotap());   Missing Stats
//        pokemon.add(new Spinoscrap());   Missing Stats
//        pokemon.add(new Dregion());   Missing Stats
//        pokemon.add(new Shalegion());   Missing Stats
//        pokemon.add(new Dessicat());   Missing Stats
//        pokemon.add(new Mummoth());   Missing Stats
//        pokemon.add(new Zomboo());   Missing Stats
//        pokemon.add(new Icevil());   Missing Stats
//        pokemon.add(new Thycicle());   Missing Stats
//        pokemon.add(new Andrymir());   Missing Stats
//        pokemon.add(new Dermug());   Missing Stats
//        pokemon.add(new Necrophagus());   Missing Stats
//        pokemon.add(new Oculyp());   Missing Stats
//        pokemon.add(new Psynapse());   Missing Stats
//        pokemon.add(new Brainowar());   Missing Stats
//        pokemon.add(new Pootzin());   Missing Stats
//        pokemon.add(new Hoatstink());   Missing Stats
//        pokemon.add(new Ponarian());   Missing Stats
//        pokemon.add(new Plakiton());   Missing Stats
//        pokemon.add(new Astaron());   Missing Stats
//        pokemon.add(new Sharog());   Missing Stats
//        pokemon.add(new Sharagged());   Missing Stats
//        pokemon.add(new Sharchaic());   Missing Stats
//        pokemon.add(new Vaxxine());   Missing Stats
//        pokemon.add(new Prickary());   Missing Stats
//        pokemon.add(new Chelomat());   Missing Stats
//        pokemon.add(new Chelosnap());   Missing Stats
//        pokemon.add(new Slipeel());   Missing Stats
//        pokemon.add(new Phonana());   Missing Stats
//        pokemon.add(new Phonutree());   Missing Stats
//        pokemon.add(new Tunihag());   Missing Stats
//        pokemon.add(new Hagnoz());   Missing Stats
//        pokemon.add(new Bandiero());   Missing Stats
//        pokemon.add(new Spinnotaur());   Missing Stats
//        pokemon.add(new Wetterwaul());   Missing Stats
//        pokemon.add(new Crabuddy());   Missing Stats
//        pokemon.add(new Palnemone());   Missing Stats
//        pokemon.add(new Hermitwin());   Missing Stats
//        pokemon.add(new Mermegg());   Missing Stats
        pokemon.add(new Wermaid());
//        pokemon.add(new Flowerm());   Missing Stats
        pokemon.add(new Vermenace());
//        pokemon.add(new Sushef());   Missing Stats
//        pokemon.add(new Grillardin());   Missing Stats
//        pokemon.add(new Kestrail());   Missing Stats
//        pokemon.add(new Sagittary());   Missing Stats
//        pokemon.add(new Barbaron());   Missing Stats
//        pokemon.add(new Spidirt());   Missing Stats
//        pokemon.add(new Terraintula());   Missing Stats
//        pokemon.add(new Tigearth());   Missing Stats
//        pokemon.add(new Larvade());   Missing Stats
//        pokemon.add(new Invadien());   Missing Stats
//        pokemon.add(new Xenovader());   Missing Stats
//        pokemon.add(new Mefowl());   Missing Stats
//        pokemon.add(new Liviscous());   Missing Stats
//        pokemon.add(new Punkoil());   Missing Stats
//        pokemon.add(new Feverm());   Missing Stats
//        pokemon.add(new Sinchilla());   Missing Stats
//        pokemon.add(new Sourpent());   Missing Stats
//        pokemon.add(new Perilouse());   Missing Stats
//        pokemon.add(new Poxopon());   Missing Stats
//        pokemon.add(new Grimongrel());   Missing Stats
//        pokemon.add(new Baiking());   Missing Stats
        pokemon.add(new Caulderon());
//        pokemon.add(new Seraphlea());   Missing Stats
//        pokemon.add(new Nirvantis());   Missing Stats
        pokemon.add(new Gargorgon());
        pokemon.add(new Nitecrawler());
        pokemon.add(new Hallowither());
        pokemon.add(new Apeiron());
//        pokemon.add(new Kathekon());   Missing Stats
//        pokemon.add(new Olgorkoi());   Missing Stats
//        pokemon.add(new Telos());   Missing Stats
//        pokemon.add(new AlkDhuulq());   Missing Stats
//        pokemon.add(new DNArc());   Missing Stats
    }

}
