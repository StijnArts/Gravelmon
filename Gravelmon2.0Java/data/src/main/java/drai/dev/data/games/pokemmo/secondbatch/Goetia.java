package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.goetia.*;
import drai.dev.data.pokemon.goetia.Jelsparc;
import drai.dev.data.pokemon.goetia.Lumini;
import drai.dev.data.pokemon.oceane.Jawee;
import drai.dev.data.pokemon.oceane.Jawsome;
import drai.dev.data.attributes.*;

import java.util.*;

import static drai.dev.data.attributes.StatType.*;

public class Goetia extends drai.dev.data.games.registry.Game {
    public Goetia() {
        super("Goetia");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Nymfaun());   Missing Stats
        pokemon.add(new Faeribou());   Missing Stats
        pokemon.add(new Moosquatch(new Stats(535, StatArchetype.PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Slowth());   Missing Stats
        pokemon.add(new Mossloth());   Missing Stats
        pokemon.add(new Slowgrowth(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Pinonkey());   Missing Stats
        pokemon.add(new Donkeyata());   Missing Stats
        pokemon.add(new Fiestaur(new Stats(534, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(SPEED))));   Missing Stats
        pokemon.add(new Taratinder());   Missing Stats
        pokemon.add(new Tarantorch());   Missing Stats
        pokemon.add(new Charantula(new Stats(534, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Seamian());   Missing Stats
        pokemon.add(new Mermonkey());   Missing Stats
        pokemon.add(new Panseidon(new Stats(533, StatArchetype.SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Cowet());   Missing Stats
        pokemon.add(new Moistox());   Missing Stats
        pokemon.add(new Buffaloam(new Stats(531, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Glaby());   Missing Stats
        pokemon.add(new Glaboar(new Stats(380, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Weevoll());   Missing Stats
        pokemon.add(new Bollweave(new Stats(403, StatArchetype.FAST_SUPPORT, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Beegan());   Missing Stats
        pokemon.add(new Beegarden(new Stats(370, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Hikoon());   Missing Stats
        pokemon.add(new Emoth(new Stats(370, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(SPEED))));   Missing Stats
        pokemon.add(new Houndworm());   Missing Stats
        pokemon.add(new Wearwolf(new Stats(378, StatArchetype.PHYSICAL_ATTACKER, List.of(ATTACK))));   Missing Stats
        pokemon.add(new Fursoot());   Missing Stats
        pokemon.add(new Lousidogg(new Stats(381, StatArchetype.SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Gooeyduck());   Missing Stats
        pokemon.add(new Gooeygoose(new Stats(367, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Poofly(new Stats(280, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Beelobuzz(new Stats(280, StatArchetype.SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Spitsen());   Missing Stats
        pokemon.add(new Salimute());   Missing Stats
        pokemon.add(new Slobbernard(new Stats(512, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));   Missing Stats
        pokemon.add(new Burroworm(new Stats(312, StatArchetype.SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Bingus());   Missing Stats
        pokemon.add(new Crungus());   Missing Stats
        pokemon.add(new Sphingus(new Stats(480, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(ATTACK))));   Missing Stats
        pokemon.add(new Grubolt());   Missing Stats
        pokemon.add(new Zapupa());   Missing Stats
        pokemon.add(new Buzzkill(new Stats(484, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(ATTACK))));   Missing Stats
        pokemon.add(new Mayflown(new Stats(350, StatArchetype.FAST_SUPPORT, List.of(SPEED))));   Missing Stats
        pokemon.add(new Bleech());   Missing Stats
        pokemon.add(new Hiruleech(new Stats(410, StatArchetype.SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Lumini());   Missing Stats
        pokemon.add(new Lampupa());   Missing Stats
        pokemon.add(new Glowyrm(new Stats(423, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Decompost());   Missing Stats
        pokemon.add(new Gorgompost(new Stats(411, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Flamingoop(new Stats(365, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Beddybug(new Stats(324, StatArchetype.SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Honeyjou());   Missing Stats
        pokemon.add(new Glutthoney(new Stats(435, StatArchetype.SPECIAL_WALL, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Mintooth(new Stats(376, StatArchetype.BULKY_SUPPORT, List.of(HP))));   Missing Stats
        pokemon.add(new Icypod());   Missing Stats
        pokemon.add(new Isoberg(new Stats(405, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE, ATTACK))));   Missing Stats
        pokemon.add(new Rumpork());   Missing Stats
        pokemon.add(new Porkupid(new Stats(412, StatArchetype.SPECIAL_WALL, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Brickabrack());   Missing Stats
        pokemon.add(new Brickwald());   Missing Stats
        pokemon.add(new Brickozuna(new Stats(435, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Toadsgool(new Stats(312, StatArchetype.BULKY_SUPPORT, List.of(DEFENCE))));   Missing Stats
        pokemon.add(new Acrology());   Missing Stats
        pokemon.add(new Astropheles(new Stats(432, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Tarankey());   Missing Stats
        pokemon.add(new Tarankong(new Stats(423, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Plagior(new Stats(334, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Beeball());   Missing Stats
        pokemon.add(new Beemason());   Missing Stats
        pokemon.add(new Beebegone(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, List.of(DEFENCE))));   Missing Stats
        pokemon.add(new Sparkete());   Missing Stats
        pokemon.add(new Plasmakate());   Missing Stats
        pokemon.add(new Plasmagician(new Stats(465, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Balloony());   Missing Stats
        pokemon.add(new Derangible(new Stats(451, StatArchetype.SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Dadrone());   Missing Stats
        pokemon.add(new Airlantic(new Stats(445, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(DEFENCE))));   Missing Stats
        pokemon.add(new Chumbas());   Missing Stats
        pokemon.add(new Chunderbolt(new Stats(451, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Bogchamp(new Stats(451, StatArchetype.SPECIAL_WALL, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Marisite());   Missing Stats
        pokemon.add(new Marrowite(new Stats(432, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(SPEED))));   Missing Stats
        pokemon.add(new Barrelsite(new Stats(432, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Squorm());   Missing Stats
        pokemon.add(new Ragrand());   Missing Stats
        pokemon.add(new Bobbilisk(new Stats(511, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Boggeyman(new Stats(453, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Shockter());   Missing Stats
        pokemon.add(new Surgeon(new Stats(450, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Belfry());   Missing Stats
        pokemon.add(new Strigori());   Missing Stats
        pokemon.add(new Demontor(new Stats(523, StatArchetype.FAST_SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Rotegg());   Missing Stats
        pokemon.add(new Fowlest());   Missing Stats
        pokemon.add(new Krakatori(new Stats(523, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Nematon());   Missing Stats
        pokemon.add(new Helminthon(new Stats(456, StatArchetype.PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Capaciton(new Stats(456, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Trematon(new Stats(456, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Cylily());   Missing Stats
        pokemon.add(new Tamanily());   Missing Stats
        pokemon.add(new Verdanteater(new Stats(511, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Rowbug());   Missing Stats
        pokemon.add(new Bugboat(new Stats(423, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Scaround());   Missing Stats
        pokemon.add(new Scaroyal(new Stats(435, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Scarazor(new Stats(435, StatArchetype.PHYSICAL_ATTACKER, List.of(ATTACK))));   Missing Stats
        pokemon.add(new Gremtrail(new Stats(376, StatArchetype.PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Araphosa());   Missing Stats
        pokemon.add(new Zaraphosa(new Stats(456, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Waruphosa(new Stats(456, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(ATTACK))));   Missing Stats
        pokemon.add(new Aviculor(new Stats(456, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(SPEED))));   Missing Stats
        pokemon.add(new Nepixie());   Missing Stats
        pokemon.add(new Neprite());   Missing Stats
        pokemon.add(new Nympenthes(new Stats(435, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Neprechaun(new Stats(435, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Ghoti());   Missing Stats
        pokemon.add(new Inferatu(new Stats(440, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Astronotilus(new Stats(350, StatArchetype.SPECIAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Snotme());   Missing Stats
        pokemon.add(new Facsimilee());   Missing Stats
        pokemon.add(new Theftidee(new Stats(467, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Lansquid());   Missing Stats
        pokemon.add(new Calispade());   Missing Stats
        pokemon.add(new Archraken(new Stats(475, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Larvot());   Missing Stats
        pokemon.add(new Rabbot(new Stats(412, StatArchetype.PHYSICAL_ATTACKER, List.of(ATTACK))));   Missing Stats
        pokemon.add(new Grunje());   Missing Stats
        pokemon.add(new Grunjerk(new Stats(423, StatArchetype.PHYSICAL_ATTACKER, List.of(ATTACK, ATTACK))));   Missing Stats
        pokemon.add(new Magboil(new Stats(356, StatArchetype.SPECIAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Docteria());   Missing Stats
        pokemon.add(new Epimedic(new Stats(454, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Padull());   Missing Stats
        pokemon.add(new Sawface(new Stats(434, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));   Missing Stats
        pokemon.add(new Smogout());   Missing Stats
        pokemon.add(new Miasmog(new Stats(434, StatArchetype.PHYSICAL_ATTACKER, List.of(ATTACK))));   Missing Stats
        pokemon.add(new Hydura());   Missing Stats
        pokemon.add(new Scyllabyss(new Stats(435, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Medusting());   Missing Stats
        pokemon.add(new Charybyss(new Stats(451, StatArchetype.SPECIAL_WALL, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Nepolyp());   Missing Stats
        pokemon.add(new Polypitcher());   Missing Stats
        pokemon.add(new Polypenthes(new Stats(512, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Trogleech());   Missing Stats
        pokemon.add(new Troglobite());   Missing Stats
        pokemon.add(new Troglobeast(new Stats(514, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(HP))));   Missing Stats
        pokemon.add(new Flattery());   Missing Stats
        pokemon.add(new Oddcast(new Stats(465, StatArchetype.SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Pozzombie(new Stats(376, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));   Missing Stats
        pokemon.add(new Barnacorn());   Missing Stats
        pokemon.add(new Barnoose(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Feferococo(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Saccarin(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Woebegong(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Rivotter());   Missing Stats
        pokemon.add(new Jaguatter(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Mabalone());   Missing Stats
        pokemon.add(new Mollusciron(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Larvatinum());   Missing Stats
        pokemon.add(new Cassowar());   Missing Stats
        pokemon.add(new Casspartan(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Ornake());   Missing Stats
        pokemon.add(new Flamboa(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Flitch());   Missing Stats
        pokemon.add(new Fitorfly());   Missing Stats
        pokemon.add(new Supafly(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Borpion());   Missing Stats
        pokemon.add(new Panorpion(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Canibble(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Peernut(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Embrystic(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Shromp());   Missing Stats
        pokemon.add(new Clobster(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Prawnage(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Shrude());   Missing Stats
        pokemon.add(new Radfink(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Fluffloat());   Missing Stats
        pokemon.add(new Colonoodle());   Missing Stats
        pokemon.add(new Tenthereal(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Jelsparc()); Missing Stats //renamed from Jelectric
        pokemon.add(new Jelightning(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Huffalimp(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Burstank(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Debutaint());   Missing Stats
        pokemon.add(new Promenude());   Missing Stats
        pokemon.add(new Glautillion(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Lilacorn());   Missing Stats
        pokemon.add(new Wisterious(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Cattermaul(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Katybud());   Missing Stats
        pokemon.add(new Thornydid(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Candelaria());   Missing Stats
        pokemon.add(new Lanternaria(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Crestrap());   Missing Stats
        pokemon.add(new Sundraco(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Eelabyss(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Loguts());   Missing Stats
        pokemon.add(new Herocust(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Mustmite());   Missing Stats
        pokemon.add(new Dustmighty(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Aardvolt(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Catfeine(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Kittypillar());   Missing Stats
        pokemon.add(new Fuzzilk());   Missing Stats
        pokemon.add(new Bombun(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Stingray(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Suglide());   Missing Stats
        pokemon.add(new Coolugo(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Luxuroe());   Missing Stats
        pokemon.add(new Aristocarp(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Icesight());   Missing Stats
        pokemon.add(new Icestalk(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Venigoon());   Missing Stats
        pokemon.add(new Venigaloot(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Charmix());   Missing Stats
        pokemon.add(new Charmatch(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Ravolt(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Lubub());   Missing Stats
        pokemon.add(new Heartery(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Ventherm());   Missing Stats
        pokemon.add(new Volchemo(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Tublip(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Narpoon(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Hantom());   Missing Stats
        pokemon.add(new Spectouch(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Jawee());
        pokemon.add(new Jawsome());
        pokemon.add(new Whirlybug());   Missing Stats
        pokemon.add(new Shellicopter(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Aviatrice(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Hagloop(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Nyareis());   Missing Stats
        pokemon.add(new Eunash(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Termini());   Missing Stats
        pokemon.add(new Termulch());   Missing Stats
        pokemon.add(new Termajesty(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Toxsick(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Sirenatee(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Elegrace(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Hierophant(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Nitpick());   Missing Stats
        pokemon.add(new Cootiepie(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Gurugan());   Missing Stats
        pokemon.add(new Guruvelt(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Pierrot());   Missing Stats
        pokemon.add(new Aukward());   Missing Stats
        pokemon.add(new Puffoon(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Icykandji());   Missing Stats
        pokemon.add(new Iglookandji(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Sparassid(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Crickid());   Missing Stats
        pokemon.add(new Grylloket());   Missing Stats
        pokemon.add(new Coolstroyr(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Lorable(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Sproutot());   Missing Stats
        pokemon.add(new Scaregrow(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Elefin());   Missing Stats
        pokemon.add(new Makarel(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Brackish());   Missing Stats
        pokemon.add(new Lagoon());   Missing Stats
        pokemon.add(new Billabong(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Lizava(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Bugbear(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Caesoil());   Missing Stats
        pokemon.add(new Mudragon(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Spyaye());   Missing Stats
        pokemon.add(new Scryaye(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Ewwgie());   Missing Stats
        pokemon.add(new Skeezer(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Tenrock());   Missing Stats
        pokemon.add(new Ratstar(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Polyfreight(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Tuskoar());   Missing Stats
        pokemon.add(new Tuskoble(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Gastare());   Missing Stats
        pokemon.add(new Espergo(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Psyphon());   Missing Stats
        pokemon.add(new Psydaria(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Malease(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Bohole(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Peathog());   Missing Stats
        pokemon.add(new Wartbog(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Pictog(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Androck(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Maningauz());   Missing Stats
        pokemon.add(new Sarcophacoon(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Beedazzle(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Wormachine(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Denkipede(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Traplure(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Axelure(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Abyspook());   Missing Stats
        pokemon.add(new Abyssoul(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Catterbrain(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Twistree(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Twisbee());   Missing Stats
        pokemon.add(new Figabee(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Fumball());   Missing Stats
        pokemon.add(new Trickytreat(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Woodron());   Missing Stats
        pokemon.add(new Troytron(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Monstauk());   Missing Stats
        pokemon.add(new Monstale(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Caskry());   Missing Stats
        pokemon.add(new Mausomber(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Widoweb());   Missing Stats
        pokemon.add(new Widowitch(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Impelial());   Missing Stats
        pokemon.add(new Ashmodeus(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Marlequin(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Kojaku());   Missing Stats
        pokemon.add(new Fujaku(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Vasbar(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Combatant());   Missing Stats
        pokemon.add(new Sergeant());   Missing Stats
        pokemon.add(new Militant(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Puffume());   Missing Stats
        pokemon.add(new Smogstack(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Hazrat());   Missing Stats
        pokemon.add(new Atomant(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Mirorim());   Missing Stats
        pokemon.add(new Abstrarts(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Petrosaur());   Missing Stats
        pokemon.add(new Quartzcoatl(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Spinotap());   Missing Stats
        pokemon.add(new Spinoscrap(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Dregion());   Missing Stats
        pokemon.add(new Shalegion(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Dessicat());   Missing Stats
        pokemon.add(new Mummoth(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Zomboo(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Icevil());   Missing Stats
        pokemon.add(new Thycicle());   Missing Stats
        pokemon.add(new Andrymir(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Vikitten());   Missing Stats
        pokemon.add(new Vikottr());   Missing Stats
        pokemon.add(new Varingpard(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Dermug());   Missing Stats
        pokemon.add(new Necrophagus(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Oculyp());   Missing Stats
        pokemon.add(new Psynapse());   Missing Stats
        pokemon.add(new Brainowar(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Pootzin());   Missing Stats
        pokemon.add(new Hoatstink(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Ponarian());   Missing Stats
        pokemon.add(new Plakiton());   Missing Stats
        pokemon.add(new Astaron(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Sharog());   Missing Stats
        pokemon.add(new Sharagged());   Missing Stats
        pokemon.add(new Sharchaic(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Vaxxine(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Prickary(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Chelomat());   Missing Stats
        pokemon.add(new Chelosnap(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Slipeel());   Missing Stats
        pokemon.add(new Phonana());   Missing Stats
        pokemon.add(new Phonutree(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Tunihag());   Missing Stats
        pokemon.add(new Hagnoz(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Bandiero(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Spinnotaur(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Wetterwaul(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Crabuddy());   Missing Stats
        pokemon.add(new Palnemone());   Missing Stats
        pokemon.add(new Hermitwin(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Mermegg());   Missing Stats
        pokemon.add(new Wermaid());
        pokemon.add(new Flowerm());
        pokemon.add(new Vermenace());
        pokemon.add(new Sushef());   Missing Stats
        pokemon.add(new Grillardin(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Kestrail(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Sagittary(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Barbaron(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Spidirt());   Missing Stats
        pokemon.add(new Terraintula());   Missing Stats
        pokemon.add(new Tigearth(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Larvade());   Missing Stats
        pokemon.add(new Invadien());   Missing Stats
        pokemon.add(new Xenovader(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Mefowl(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Liviscous(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Punkoil(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Feverm(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Sinchilla(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Sourpent(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Perilouse(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Poxopon(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Grimongrel(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Baiking(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Caulderon());
        pokemon.add(new Seraphlea(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Nirvantis(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Gargorgon());
        pokemon.add(new Nitecrawler());
        pokemon.add(new Hallowither());
        pokemon.add(new Apeiron());
        pokemon.add(new Kathekon(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Olgorkoi(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Telos(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new AlkDhuulq(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new DNArc(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
        pokemon.add(new Snipierce(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(HP))));   Missing Stats
    }

}
