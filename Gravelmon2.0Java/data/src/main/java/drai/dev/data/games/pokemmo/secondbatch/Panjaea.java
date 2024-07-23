package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.panjaea.*;

import drai.dev.data.pokemon.panjaea.Dramingo;
import drai.dev.data.attributes.*;

import java.util.*;

public class Panjaea extends drai.dev.data.games.registry.Game {
    public Panjaea() {
        super("Panjaea");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Owleaf());   
        pokemon.add(new Fowliage());   
        pokemon.add(new Strigallant(new Stats(524, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Coalverine());   
        pokemon.add(new Charmaul());   
        pokemon.add(new Brimscorch(new Stats(530, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Raindolph());   
        pokemon.add(new Elkreek());   
        pokemon.add(new Moocean(new Stats(528, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Caterpolar());   
        pokemon.add(new Cryosalis());   
        pokemon.add(new Monarctic(new Stats(420, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Leetle());   
        pokemon.add(new Cherupace());   
        pokemon.add(new Larviathan(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.ATTACK))));
//        pokemon.add(new Sassquish());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new 341676());   Missing Art
        pokemon.add(new Malacute());   
        pokemon.add(new Huskules(new Stats(440, StatArchetype.FAST_SUPPORT,
                List.of(StatType.ATTACK))));
        pokemon.add(new Turfin());   
        pokemon.add(new Metalodon(new Stats(440, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Frostkey());   
        pokemon.add(new Frostrike(new Stats(445, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Smallet());   
        pokemon.add(new Stormmer(new Stats(390, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Kikkyu(new Stats(380, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));   
        pokemon.add(new Necreon());
        pokemon.add(new Tauroot());   
        pokemon.add(new Taurmor());   
        pokemon.add(new Minothorn(new Stats(510, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Cinduck());   
        pokemon.add(new Volswan());   
        pokemon.add(new Swanix(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Minkler());   
        pokemon.add(new Lagoonorak());   
        pokemon.add(new Tsunamink(new Stats(510, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Rugrant(new Stats(310, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPEED))));   
        pokemon.add(new Perdizzy());   
        pokemon.add(new Perdazzle());   
        pokemon.add(new Pheaseance(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Knoknok(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Gravyle());   
        pokemon.add(new Hardgoyle(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Koolbeens());   
        pokemon.add(new Straken(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Adoraphin());   
        pokemon.add(new Dolphet());   
        pokemon.add(new Draphin(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Elekina());   
        pokemon.add(new Chargehog(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Mosquick());   
        pokemon.add(new Mosquiteer(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Jetkundo(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Purty());   
        pokemon.add(new Luvly(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Awfoal());   
        pokemon.add(new Mulevolent(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Voltergeist(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Cardinoir());   
        pokemon.add(new Cardinuit(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Ramster(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Bladeon());
        pokemon.add(new Bumblebaa(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Womball());   
        pokemon.add(new Wombatant(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Cascavalve());   
        pokemon.add(new Nozzleisk(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Mossybara());   
        pokemon.add(new Herbybara());   
        pokemon.add(new Tropybara(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Vulkit());   
        pokemon.add(new Infeline());   
        pokemon.add(new Jawar(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Foamingo());   
        pokemon.add(new Flowmingo());   
        pokemon.add(new Dramingo(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Gleech(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Sparkeet());   
        pokemon.add(new Shockatiel());   
        pokemon.add(new Shockatoo(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Rubbite());   
        pokemon.add(new Trasharp(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Leappa());   
        pokemon.add(new Locrush(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Sylphemy(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Dankton());   
        pokemon.add(new Planktarges(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Toxow());   
        pokemon.add(new Toxwine(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Amallama());   
        pokemon.add(new Llamagma(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Cryoman());   
        pokemon.add(new Stalagator(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Pixiego());   
        pokemon.add(new Faeroll(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Fungoon());   
        pokemon.add(new Truffian());   
        pokemon.add(new Banditake(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Auriconda(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Octusy(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Fluffrie());   
        pokemon.add(new Flufflame());   
        pokemon.add(new Fluffury(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Bristern());   
        pokemon.add(new Larostache());   
        pokemon.add(new Shorebeard(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Chuego());   
        pokemon.add(new Chualoon(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Rutabug());   
        pokemon.add(new Turniptero());   
        pokemon.add(new Queenbeet(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Waspeon());
        pokemon.add(new Stemur());   
        pokemon.add(new Vandalaye());   
        pokemon.add(new Madarascal(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Embala());   
        pokemon.add(new Sizzelle());   
        pokemon.add(new Blazelle(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Phantain());   
        pokemon.add(new Phantide());   
        pokemon.add(new Phantank(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Pestiny());   
        pokemon.add(new Kongroach());   
        pokemon.add(new Monstroach(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Venosseous());   
        pokemon.add(new Skelethal(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Okapix(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Seediment());   
        pokemon.add(new Krakarock(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Naguni());   
        pokemon.add(new Lamiante());   
        pokemon.add(new Gorgana(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Scopper());   
        pokemon.add(new Amperator(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Wyldog());   
        pokemon.add(new Grinreap(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Beakat());   
        pokemon.add(new Fowland());   
        pokemon.add(new Seismyth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Toxeon());
    }

}
