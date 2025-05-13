package drai.dev.gravelmon.mega.fabric;

import com.cobblemon.yajatkaul.mega_showdown.datamanage.*;
import net.minecraft.world.entity.player.*;

public class MegaEvolveLogicImpl {

    public static Boolean getMegaData(Player player) {
        return player.getAttached(DataManage.MEGA_DATA);
    }

    public static void setMegaData(Player player, boolean data) {
        player.setAttached(DataManage.MEGA_DATA, data);
    }

    public static void setMegaPokemon(Player player, PokeHandler handler){
        player.setAttached(DataManage.MEGA_POKEMON, handler);
    }
}
