package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.panjaea.*;

import java.util.*;

public class Panjaea extends drai.dev.data.games.registry.Game {
    public Panjaea() {
        super("Panjaea");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Owleaf());   
        addNewPokemon(new Fowliage());   
        addNewPokemon(new Strigallant(new Stats(524, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Coalverine());   
        addNewPokemon(new Charmaul());   
        addNewPokemon(new Brimscorch(new Stats(530, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Raindolph());   
        addNewPokemon(new Elkreek());   
        addNewPokemon(new Moocean(new Stats(528, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Caterpolar());   
        addNewPokemon(new Cryosalis());   
        addNewPokemon(new Monarctic(new Stats(420, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Leetle());   
        addNewPokemon(new Cherupace());   
        addNewPokemon(new Larviathan(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.ATTACK))));
//        addNewPokemon(new Sassquish());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new 341676());   Missing Art
        addNewPokemon(new Malacute());   
        addNewPokemon(new Huskules(new Stats(440, StatArchetype.FAST_SUPPORT,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Turfin());   
        addNewPokemon(new Metalodon(new Stats(440, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Frostkey());   
        addNewPokemon(new Frostrike(new Stats(445, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Smallet());   
        addNewPokemon(new Stormmer(new Stats(390, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Kikkyu(new Stats(380, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Necreon());
        addNewPokemon(new Tauroot());   
        addNewPokemon(new Taurmor());   
        addNewPokemon(new Minothorn(new Stats(510, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Cinduck());   
        addNewPokemon(new Volswan());   
        addNewPokemon(new Swanix(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Minkler());   
        addNewPokemon(new Lagoonorak());   
        addNewPokemon(new Tsunamink(new Stats(510, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Rugrant(new Stats(310, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Perdizzy());   
        addNewPokemon(new Perdazzle());   
        addNewPokemon(new Pheaseance(new Stats(500, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Knoknok(new Stats(380, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Gravyle());   
        addNewPokemon(new Hardgoyle(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Koolbeens());   
        addNewPokemon(new Straken(new Stats(460, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Adoraphin());   
        addNewPokemon(new Dolphet());   
        addNewPokemon(new Draphin(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Elekina());   
        addNewPokemon(new Chargehog(new Stats(420, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Mosquick());   
        addNewPokemon(new Mosquiteer(new Stats(420, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Jetkundo(new Stats(390, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Purty());   
        addNewPokemon(new Luvly(new Stats(430, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Awfoal());   
        addNewPokemon(new Mulevolent(new Stats(430, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Voltergeist(new Stats(350, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Cardinoir());   
        addNewPokemon(new Cardinuit(new Stats(420, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Ramster(new Stats(310, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Bladeon());
        addNewPokemon(new Bumblebaa(new Stats(340, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Womball());   
        addNewPokemon(new Wombatant(new Stats(410, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Cascavalve());   
        addNewPokemon(new Nozzleisk(new Stats(430, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Mossybara());   
        addNewPokemon(new Herbybara());   
        addNewPokemon(new Tropybara(new Stats(520, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.HP))));
        addNewPokemon(new Vulkit());   
        addNewPokemon(new Infeline());   
        addNewPokemon(new Jawar(new Stats(520, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Foamingo());   
        addNewPokemon(new Flowmingo());   
        addNewPokemon(new Dramingo(new Stats(520, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Gleech(new Stats(320, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Sparkeet());   
        addNewPokemon(new Shockatiel());   
        addNewPokemon(new Shockatoo(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Rubbite());   
        addNewPokemon(new Trasharp(new Stats(440, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Leappa());   
        addNewPokemon(new Locrush(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Sylphemy(new Stats(360, StatArchetype.FAST_SUPPORT,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Dankton());   
        addNewPokemon(new Planktarges(new Stats(430, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Toxow());   
        addNewPokemon(new Toxwine(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Amallama());   
        addNewPokemon(new Llamagma(new Stats(440, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Cryoman());   
        addNewPokemon(new Stalagator(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Pixiego());   
        addNewPokemon(new Faeroll(new Stats(430, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Fungoon());   
        addNewPokemon(new Truffian());   
        addNewPokemon(new Banditake(new Stats(490, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.HP))));
        addNewPokemon(new Auriconda(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Octusy(new Stats(340, StatArchetype.FAST_SUPPORT,
                List.of(StatType.HP))));
        addNewPokemon(new Fluffrie());   
        addNewPokemon(new Flufflame());   
        addNewPokemon(new Fluffury(new Stats(510, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Bristern());   
        addNewPokemon(new Larostache());   
        addNewPokemon(new Shorebeard(new Stats(510, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Chuego());   
        addNewPokemon(new Chualoon(new Stats(450, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Rutabug());   
        addNewPokemon(new Turniptero());   
        addNewPokemon(new Queenbeet(new Stats(480, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Waspeon());
        addNewPokemon(new Stemur());   
        addNewPokemon(new Vandalaye());   
        addNewPokemon(new Madarascal(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Embala());   
        addNewPokemon(new Sizzelle());   
        addNewPokemon(new Blazelle(new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Phantain());   
        addNewPokemon(new Phantide());   
        addNewPokemon(new Phantank(new Stats(490, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Pestiny());   
        addNewPokemon(new Kongroach());   
        addNewPokemon(new Monstroach(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Venosseous());   
        addNewPokemon(new Skelethal(new Stats(450, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Okapix(new Stats(340, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Seediment());   
        addNewPokemon(new Krakarock(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Naguni());   
        addNewPokemon(new Lamiante());   
        addNewPokemon(new Gorgana(new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Scopper());   
        addNewPokemon(new Amperator(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Wyldog());   
        addNewPokemon(new Grinreap(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Beakat());   
        addNewPokemon(new Fowland());   
        addNewPokemon(new Seismyth(new Stats(600, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Toxeon());
    }

}
