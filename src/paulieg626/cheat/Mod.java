package paulieg626.cheat;

import mindustry.mod.Mod;
import paulieg626.cheat.content.*;

public class Mod extends Mod{

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        new Blocks().load();
    }
}