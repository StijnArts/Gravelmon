package drai.dev.data.games.instagram.eldark;


import drai.dev.data.pokemon.raian.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

import static drai.dev.data.attributes.StatType.*;
import static drai.dev.data.attributes.StatArchetype.*;

public class Raian extends drai.dev.data.games.registry.Game {
    public Raian() {
        super("Raian");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Migraff().setUsesBigModel());
        pokemon.add(new Airgraff().setUsesBigModel());
        pokemon.add(new Raffrobter(new Stats(530, BULKY_SUPPORT, List.of(HP))).setUsesBigModel());
        pokemon.add(new Hymbr().setUsesBigModel());
        pokemon.add(new Blayna().setUsesBigModel());
        pokemon.add(new Ertheno(new Stats(525, BULKY_PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        pokemon.add(new Aquama().setUsesBigModel());
        pokemon.add(new Salaima().setUsesBigModel());
        pokemon.add(new Amoxica(new Stats(534, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());

        pokemon.add(new Flufforn().setUsesBigModel());
        pokemon.add(new Sahawk().setUsesBigModel());
        pokemon.add(new Driacon(new Stats(480, PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Pineque().setUsesBigModel());
        pokemon.add(new Orcpine(new Stats(450, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        pokemon.add(new Saltworm().setUsesBigModel());
        pokemon.add(new Pocrock().setUsesBigModel());
        pokemon.add(new Crystsap(new Stats(460, BULKY_PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        pokemon.add(new Pomeed().setUsesBigModel());
        pokemon.add(new Bloomnate().setUsesBigModel());
        pokemon.add(new Kingpome(new Stats(450, PHYSICAL_WALL, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Coatity().setUsesBigModel());
        pokemon.add(new Bintat(new Stats(440, FAST_PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        pokemon.add(new Chubchu().setUsesBigModel()); //Evolves into Elfachu from LastPoint
        pokemon.add(new Jakort().setUsesBigModel());
        pokemon.add(new Jaicicle(new Stats(450, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Jaklaze(new Stats(450, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Dimolf().setUsesBigModel());
        pokemon.add(new Wultail(new Stats(454, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE, StatType.ATTACK, StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Maxard().setUsesBigModel());
        pokemon.add(new Triagon(new Stats(410, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        pokemon.add(new Snaprick().setUsesBigModel());
        pokemon.add(new Turtace().setUsesBigModel());
        pokemon.add(new Spiritur(new Stats(525, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Sycrog().setUsesBigModel());
        pokemon.add(new Zenrog().setUsesBigModel());
        pokemon.add(new Triclope(new Stats(534, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Dagekko().setUsesBigModel());
        pokemon.add(new Evigekko().setUsesBigModel());
        pokemon.add(new Predodator(new Stats(530, PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());

        pokemon.add(new Bubotus().setUsesBigModel());
        pokemon.add(new Vamprquid(new Stats(440, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Lileaf().setUsesBigModel());
        pokemon.add(new Comfleaf().setUsesBigModel());
        pokemon.add(new Umleaf(new Stats(480, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Abuleaf(new Stats(480, PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Candilug().setUsesBigModel());
        pokemon.add(new Slugrish(new Stats(440, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Envirock(new Stats(310, PHYSICAL_WALL, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new CaveEnvirock("", Aspect.CAVE, new Stats(310, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new ForestEnvirock("", Aspect.FOREST, new Stats(310, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new SeaEnvirock("", Aspect.SEA, new Stats(310, SPECIAL_WALL, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Collecrok().setUsesBigModel());
        pokemon.add(new Dracnarok(new Stats(550, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Cheeda().setUsesBigModel());
        pokemon.add(new Dameetah().setUsesBigModel());
        pokemon.add(new Cherastle(new Stats(510, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE   ))).setUsesBigModel());
        pokemon.add(new Zesee().setUsesBigModel());
        pokemon.add(new Soishell().setUsesBigModel());
        pokemon.add(new Maestryme(new Stats(500, SPECIAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Elphish().setUsesBigModel());
        pokemon.add(new Malactro(new Stats(460, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Cublog().setUsesBigModel());
        pokemon.add(new Leoquare(new Stats(460, BULKY_SPECIAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        pokemon.add(new Solice().setUsesBigModel());
        pokemon.add(new Frozarawn().setUsesBigModel());
        pokemon.add(new Darcicle(new Stats(534, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Watchost().setUsesBigModel());
        pokemon.add(new Redinfine().setUsesBigModel());
        pokemon.add(new Securider(new Stats(520, PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Clasoil().setUsesBigModel());
        pokemon.add(new Cimentok().setUsesBigModel());
        pokemon.add(new Closalarm(new Stats(525, SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());

        pokemon.add(new Biomkid().setUsesBigModel());
        pokemon.add(new Mbombo().setUsesBigModel());
        pokemon.add(new Drwitch(new Stats(440, BULKY_SUPPORT, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Esudoo(new Stats(440, PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Blobybolb(new Stats(340, SPECIAL_WALL, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Apefant().setUsesBigModel());
        pokemon.add(new Probsant(new Stats(430, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Hazaire().setUsesBigModel());
        pokemon.add(new Expolaze().setUsesBigModel());
        pokemon.add(new Gasular(new Stats(515, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Sphoild().setUsesBigModel());
        pokemon.add(new Royalinx(new Stats(460, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Napohead(new Stats(420, PHYSICAL_WALL, List.of(HP))).setUsesBigModel());
        pokemon.add(new Shargill(new Stats(430, FAST_PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        pokemon.add(new Shielbow().setUsesBigModel());
        pokemon.add(new Spearetle(new Stats(450, PHYSICAL_WALL, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Jembirit().setUsesBigModel());
        pokemon.add(new Congumo(new Stats(450, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Siagibon(new Stats(450, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Parotish().setUsesBigModel());
        pokemon.add(new Pentagle(new Stats(480, PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        pokemon.add(new Chaontouka(new Stats(680, BULKY_PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        pokemon.add(new Ordabada(new Stats(680, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Jumpkret(new Stats(500, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Jajagon(new Stats(500, PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Ariromode(new Stats(500, PHYSICAL_WALL, List.of(HP))).setUsesBigModel());
        pokemon.add(new Batacuila(new Stats(500, FAST_SPECIAL_WALL, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Shroheat(new Stats(500, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Zonktress(new Stats(500, BULKY_PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Pearcious(new Stats(500, FAST_SUPPORT, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Pullrog(new Stats(500, SLOW_BULKY_SPECIAL_ATTACKER, List.of(HP))).setUsesBigModel());
        pokemon.add(new Rugmamba(new Stats(500, FAST_SPECIAL_ATTACKER, List.of(SPEED, SPEED))).setUsesBigModel());
        pokemon.add(new Fashinda(new Stats(500, SPECIAL_WALL, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Glaciking(new Stats(500, BULKY_SPECIAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Glaciqueen(new Stats(500, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Grouwary(new Stats(500, FAST_PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        pokemon.add(new Articture(new Stats(500, FAST_SUPPORT, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Kiwalon(new Stats(500, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Gargaitor(new Stats(500, PHYSICAL_ATTACKER, List.of(ATTACK, HP))).setUsesBigModel());
        pokemon.add(new Spiturtos(new Stats(500, FAST_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Beninroz(new Stats(500, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        pokemon.add(new Tryambeak().setUsesBigModel()); //fossil
        pokemon.add(new Terrotryma(new Stats(460, PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        pokemon.add(new Nodoo().setUsesBigModel()); //fossil
        pokemon.add(new Dodenius(new Stats(460, PHYSICAL_WALL, List.of(HP))).setUsesBigModel());
        pokemon.add(new Chamenetic().setUsesBigModel());
        pokemon.add(new Geneleon(new Stats(450, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Grifowl().setUsesBigModel());
        pokemon.add(new Royaffin(new Stats(480, FAST_SPECIAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Emperoffin(new Stats(480, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new Harminanka(new Stats(590, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Sossnit(new Stats(590, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Trintity(new Stats(590, MIXED_WALL, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new Mawata(new Stats(600, ALL_ROUND, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new TribalRaffrobter("", Aspect.TRIBAL, new Stats(580, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new TribalErtheno("", Aspect.TRIBAL, new Stats(580, BULKY_PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        pokemon.add(new TribalAmoxica("", Aspect.TRIBAL, new Stats(580, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new TribalSpiritur("", Aspect.TRIBAL, new Stats(580, SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new TribalTriclope("", Aspect.TRIBAL, new Stats(580, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new TribalPredodator("", Aspect.TRIBAL, new Stats(580, PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new TribalDarcicle("", Aspect.TRIBAL, new Stats(580, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new TribalSecurider("", Aspect.TRIBAL, new Stats(580, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new TribalClosalarm("", Aspect.TRIBAL, new Stats(580, SPECIAL_WALL, List.of(SPECIAL_DEFENCE, SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Cloueon(new Stats(524, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
    }

}
