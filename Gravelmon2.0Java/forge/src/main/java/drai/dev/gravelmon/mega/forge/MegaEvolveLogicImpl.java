package drai.dev.gravelmon.mega.forge;

import com.cobblemon.yajatkaul.mega_showdown.datamanage.*;
import net.minecraft.world.entity.player.*;

public class MegaEvolveLogicImpl {

    public static Boolean getMegaData(Player player) {
        return player.getData(DataManage.MEGA_DATA);
    }

    public static void setMegaData(Player player, boolean data) {
        player.setData(DataManage.MEGA_DATA, data);
    }

    public static void setMegaPokemon(Player player, PokeHandler handler){
        player.setData(DataManage.MEGA_POKEMON, handler);
    }
}
