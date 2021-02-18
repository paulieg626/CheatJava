package cheat;

import mindustry.mod.Mod;
import cheat.content.*;

public class MainMod extends Mod{

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        new Blocks().load();
    }
}
