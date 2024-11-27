package drai.dev.data.games.instagram.eldark;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

import static drai.dev.data.attributes.StatArchetype.*;
import static drai.dev.data.attributes.StatType.*;

public class Raian extends drai.dev.data.games.registry.Game {
    public Raian() {
        super("Raian");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Migraff().setUsesBigModel());
        addNewPokemon(new Airgraff().setUsesBigModel());
        addNewPokemon(new Raffrobter(new Stats(530, BULKY_SUPPORT, List.of(HP))).setUsesBigModel());
        addNewPokemon(new Hymbr().setUsesBigModel());
        addNewPokemon(new Blayna().setUsesBigModel());
        addNewPokemon(new Ertheno(new Stats(525, BULKY_PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        addNewPokemon(new Aquama().setUsesBigModel());
        addNewPokemon(new Salaima().setUsesBigModel());
        addNewPokemon(new Amoxica(new Stats(534, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());

        addNewPokemon(new Flufforn().setUsesBigModel());
        addNewPokemon(new Sahawk().setUsesBigModel());
        addNewPokemon(new Driacon(new Stats(480, PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Pineque().setUsesBigModel());
        addNewPokemon(new Orcpine(new Stats(450, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        addNewPokemon(new Saltworm().setUsesBigModel());
        addNewPokemon(new Pocrock().setUsesBigModel());
        addNewPokemon(new Crystsap(new Stats(460, BULKY_PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        addNewPokemon(new Pomeed().setUsesBigModel());
        addNewPokemon(new Bloomnate().setUsesBigModel());
        addNewPokemon(new Kingpome(new Stats(450, PHYSICAL_WALL, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Coatity().setUsesBigModel());
        addNewPokemon(new Bintat(new Stats(440, FAST_PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        addNewPokemon(new Chubchu().setUsesBigModel()); //Evolves into Elfachu from LastPoint
        addNewPokemon(new Jakort().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Jaicicle(new Stats(450, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Jaklaze(new Stats(450, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Dimolf().setUsesBigModel());
        addNewPokemon(new Wultail(new Stats(454, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE, StatType.ATTACK, StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Maxard().setUsesBigModel());
        addNewPokemon(new Triagon(new Stats(410, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        addNewPokemon(new Snaprick().setUsesBigModel());
        addNewPokemon(new Turtace().setUsesBigModel());
        addNewPokemon(new Spiritur(new Stats(525, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Sycrog().setUsesBigModel());
        addNewPokemon(new Zenrog().setUsesBigModel());
        addNewPokemon(new Triclope(new Stats(534, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Dagekko().setUsesBigModel());
        addNewPokemon(new Evigekko().setUsesBigModel());
        addNewPokemon(new Predodator(new Stats(530, PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());

        addNewPokemon(new Bubotus().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Vamprquid(new Stats(440, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Lileaf().setUsesBigModel());
        addNewPokemon(new Comfleaf().setUsesBigModel());
        addNewPokemon(new Umleaf(new Stats(480, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Abuleaf(new Stats(480, PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Candilug().setUsesBigModel());
        addNewPokemon(new Slugrish(new Stats(440, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Envirock(new Stats(310, PHYSICAL_WALL, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new CaveEnvirock("", Aspect.CAVE, new Stats(310, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new ForestEnvirock("", Aspect.FOREST, new Stats(310, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new SeaEnvirock("", Aspect.SEA, new Stats(310, SPECIAL_WALL, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Collecrok().setUsesBigModel());
        addNewPokemon(new Dracnarok(new Stats(550, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Cheeda().setUsesBigModel());
        addNewPokemon(new Dameetah().setUsesBigModel());
        addNewPokemon(new Cherastle(new Stats(510, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE   ))).setUsesBigModel());
        addNewPokemon(new Zesee().setUsesBigModel());
        addNewPokemon(new Soishell().setUsesBigModel());
        addNewPokemon(new Maestryme(new Stats(500, SPECIAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Elphish().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Malactro(new Stats(460, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Cublog().setUsesBigModel());
        addNewPokemon(new Leoquare(new Stats(460, BULKY_SPECIAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        addNewPokemon(new Solice().setUsesBigModel());
        addNewPokemon(new Frozarawn().setUsesBigModel());
        addNewPokemon(new Darcicle(new Stats(534, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Watchost().setUsesBigModel());
        addNewPokemon(new Redinfine().setUsesBigModel());
        addNewPokemon(new Securider(new Stats(520, PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Clasoil().setUsesBigModel());
        addNewPokemon(new Cimentok().setUsesBigModel());
        addNewPokemon(new Closalarm(new Stats(525, SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());

        addNewPokemon(new Biomkid().setUsesBigModel());
        addNewPokemon(new Mbombo().setUsesBigModel());
        addNewPokemon(new Drwitch(new Stats(440, BULKY_SUPPORT, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Esudoo(new Stats(440, PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Blobybolb(new Stats(340, SPECIAL_WALL, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Apefant().setUsesBigModel());
        addNewPokemon(new Probsant(new Stats(430, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Hazaire().setUsesBigModel());
        addNewPokemon(new Expolaze().setUsesBigModel());
        addNewPokemon(new Gasular(new Stats(515, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Sphoild().setUsesBigModel());
        addNewPokemon(new Royalinx(new Stats(460, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Napohead(new Stats(420, PHYSICAL_WALL, List.of(HP))).setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Shargill(new Stats(430, FAST_PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        addNewPokemon(new Shielbow().setUsesBigModel());
        addNewPokemon(new Spearetle(new Stats(450, PHYSICAL_WALL, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Jembirit().setUsesBigModel());
        addNewPokemon(new Congumo(new Stats(450, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Siagibon(new Stats(450, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Parotish().setUsesBigModel());
        addNewPokemon(new Pentagle(new Stats(480, PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        addNewPokemon(new Chaontouka(new Stats(680, BULKY_PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        addNewPokemon(new Ordabada(new Stats(680, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Jumpkret(new Stats(500, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Jajagon(new Stats(500, PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Ariromode(new Stats(500, PHYSICAL_WALL, List.of(HP))).setUsesBigModel());
        addNewPokemon(new Batacuila(new Stats(500, FAST_SPECIAL_WALL, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Shroheat(new Stats(500, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Zonktress(new Stats(500, BULKY_PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Pearcious(new Stats(500, FAST_SUPPORT, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Pullrog(new Stats(500, SLOW_BULKY_SPECIAL_ATTACKER, List.of(HP))).setUsesBigModel());
        addNewPokemon(new Rugmamba(new Stats(500, FAST_SPECIAL_ATTACKER, List.of(SPEED, SPEED))).setUsesBigModel());
        addNewPokemon(new Fashinda(new Stats(500, SPECIAL_WALL, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Glaciking(new Stats(500, BULKY_SPECIAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Glaciqueen(new Stats(500, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Grouwary(new Stats(500, FAST_PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        addNewPokemon(new Articture(new Stats(500, FAST_SUPPORT, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Kiwalon(new Stats(500, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Gargaitor(new Stats(500, PHYSICAL_ATTACKER, List.of(ATTACK, HP))).setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Spiturtos(new Stats(500, FAST_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Beninroz(new Stats(500, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        addNewPokemon(new Tryambeak().setUsesBigModel()); //fossil
        addNewPokemon(new Terrotryma(new Stats(460, PHYSICAL_ATTACKER, List.of(ATTACK))).setUsesBigModel());
        addNewPokemon(new Nodoo().setUsesBigModel()); //fossil
        addNewPokemon(new Dodenius(new Stats(460, PHYSICAL_WALL, List.of(HP))).setUsesBigModel());
        addNewPokemon(new Chamenetic().setUsesBigModel());
        addNewPokemon(new Geneleon(new Stats(450, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Grifowl().setUsesBigModel());
        addNewPokemon(new Royaffin(new Stats(480, FAST_SPECIAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Emperoffin(new Stats(480, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new Harminanka(new Stats(590, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Sossnit(new Stats(590, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Trintity(new Stats(590, MIXED_WALL, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new Mawata(new Stats(600, ALL_ROUND, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addPokedexPokemon("growlithe, arcanine-raianian, scyther-raianian, scizor-raianian");
        addPokedexPokemon(
                "eevee," +
                        "vaporeon," +
                        "jolteon," +
                        "flareon," +
                        "espeon," +
                        "umbreon," +
                        "leafeon," +
                        "glaceon," +
                        "sylveon");
        addNewPokemon(new Cloueon(new Stats(524, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());

        addPokedexPokemon("dratini, dragonair, dragonite-raianian, dragonite-raianiantwo, hoothoot, noctowl-raianian, chinchou-raianian" +
                "lanturn-raianian, phanpy-raianian, donphan-raianian, whismur-raianian, loudred-raianian, exploud-raianian, absol-raianian, bagon, shelgon, salamence-raianian, " +
                "gible-raianian, gabite-raianian, garchomp-raianian, riolu, lucario-raianian, ralts, kirlia, gardevoir, gallade, gallade-raianian");
        addNewPokemon(new TribalRaffrobter("", Aspect.TRIBAL, new Stats(580, BULKY_SUPPORT, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new TribalErtheno("", Aspect.TRIBAL, new Stats(580, BULKY_PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        addNewPokemon(new TribalAmoxica("", Aspect.TRIBAL, new Stats(580, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new TribalSpiritur("", Aspect.TRIBAL, new Stats(580, SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new TribalTriclope("", Aspect.TRIBAL, new Stats(580, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new TribalPredodator("", Aspect.TRIBAL, new Stats(580, PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        addNewPokemon(new TribalDarcicle("", Aspect.TRIBAL, new Stats(580, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        addNewPokemon(new TribalSecurider("", Aspect.TRIBAL, new Stats(580, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new TribalClosalarm("", Aspect.TRIBAL, new Stats(580, SPECIAL_WALL, List.of(SPECIAL_DEFENCE, SPECIAL_DEFENCE))).setUsesBigModel());
    }

}
