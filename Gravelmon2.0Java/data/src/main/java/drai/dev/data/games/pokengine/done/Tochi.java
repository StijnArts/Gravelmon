package drai.dev.data.games.pokengine.done;


import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.tochi.*;

import java.util.*;

public class Tochi extends drai.dev.data.games.registry.Game {
	public static final Game INSTANCE = new Tochi();
	private Tochi() {
        super("Tochi");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Brambli());
        addNewPokemon(new Sapli());
        addNewPokemon(new Coatimber());
        addNewPokemon(new Salamagma());
        addNewPokemon(new Salamolten());
        addNewPokemon(new Amphibroil(new Stats(534, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Octiny());
        addNewPokemon(new Octricity());
        addNewPokemon(new Plasmapod(new Stats(534, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Squirrey());
        addNewPokemon(new Raspberrel(new Stats(456, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Adoved());
        addNewPokemon(new Admibird());
        addNewPokemon(new Extravagale());
        addNewPokemon(new Silkapillar());
        addNewPokemon(new Mothread());
        addNewPokemon(new Strawbabe());
        addNewPokemon(new Fragalia());
        addNewPokemon(new Fraquility(new Stats(511, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Martwig());
        addNewPokemon(new Martimber(new Stats(441, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Glidair(new Stats(576, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Pepshroom(new Stats(432, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Chimary());
        addNewPokemon(new Canaring(new Stats(467, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Pitoxin(new Stats(467, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Satymp());
        addNewPokemon(new Bapherno(new Stats(468, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Apheeble());
        addNewPokemon(new Aphur(new Stats(443, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Calvolt());
        addNewPokemon(new Wildebolt());
        addNewPokemon(new Voltebeast(new Stats(521, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Rabineer(new Stats(435, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.HP))));
        addNewPokemon(new Clofae(new Stats(534, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Firant());
        addNewPokemon(new Dynamant(new Stats(443, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK, StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Vermoist());
        addNewPokemon(new Drizzlingua(new Stats(476, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Spriterra());
        addNewPokemon(new Faearth(new Stats(487, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Trainymph());
        addNewPokemon(new Locusteka(new Stats(475, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Chiqua());
        addNewPokemon(new Turphoon());
        addNewPokemon(new Typhitty());
        addNewPokemon(new Typheline());
        addNewPokemon(new Swampole());
        addNewPokemon(new Poliwamp());
        addNewPokemon(new Swamphibian());
        addNewPokemon(new Childew());
        addNewPokemon(new Salimist(new Stats(487, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Needlish());
        addNewPokemon(new IVish(new Stats(487, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Heartbill(new Stats(432, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.SPEED))));
        addNewPokemon(new Rubster(new Stats(421, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.HP))));
        addNewPokemon(new Immortoise(new Stats(487, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Ruffurchin(new Stats(387, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Hatox());
        addNewPokemon(new Shellice(new Stats(467, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Reefool(new Stats(434, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.HP))));
        addNewPokemon(new Lakalf());
        addNewPokemon(new Bullake(new Stats(487, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Pesketch(new Stats(386, StatArchetype.MIXED_WALL,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Nurshark());
        addNewPokemon(new Sharkure(new Stats(489, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE, StatType.HP))));
        addNewPokemon(new Shrimpno());
        addNewPokemon(new Shrimpadelic(new Stats(487, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK, StatType.DEFENCE))));
        addNewPokemon(new Garbezoa());
        addNewPokemon(new Jetsowar(new Stats(486, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Spectacea(new Stats(465, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPEED, StatType.HP))));
        addNewPokemon(new Helux());
        addNewPokemon(new Helectric(new Stats(476, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Tentacult());
        addNewPokemon(new Cultamari(new Stats(478, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Eggozoa());
        addNewPokemon(new Hydravenge(new Stats(481, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Booblue());
        addNewPokemon(new Submarooby(new Stats(467, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Whalobe());
        addNewPokemon(new Cerebeluga(new Stats(472, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Glorm());
        addNewPokemon(new Flyminate(new Stats(467, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Fearit());
        addNewPokemon(new Haunthin(new Stats(475, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Bisoil());
        addNewPokemon(new Buffalearth(new Stats(489, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Gecksquire());
        addNewPokemon(new Knightile());
        addNewPokemon(new Geckombat(new Stats(531, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Pyrogorgia(new Stats(444, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Snowbowll());
        addNewPokemon(new Overcowl(new Stats(481, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Puncholla(new Stats(436, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Caimolt());
        addNewPokemon(new Reptigon());
        addNewPokemon(new Spectragon(new Stats(540, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.SPEED))));
        addNewPokemon(new Farenhead());
        addNewPokemon(new Pyranium(new Stats(476, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Seworm());
        addNewPokemon(new Velvorm(new Stats(465, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Fungramp(new Stats(434, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Foscal());
        addNewPokemon(new Fossasin(new Stats(476, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Dodie());
        addNewPokemon(new Dodoc(new Stats(534, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Serpebble());
        addNewPokemon(new Serpentite(new Stats(512, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Rolyboly(new Stats(387, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Endearasite(new Stats(412, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPEED))));
        addNewPokemon(new Erosite());
        addNewPokemon(new Venusite(new Stats(458, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Impelt(new Stats(334, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Puzzlock(new Stats(331, StatArchetype.MIXED_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Chubaby());
        addNewPokemon(new Chubuffet());
        addNewPokemon(new Carnicabra(new Stats(521, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Sentennial(new Stats(680, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
    }

}
