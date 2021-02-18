package betamindy.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import betamindy.graphics.*;
import betamindy.world.blocks.defense.*;
import betamindy.world.blocks.defense.turrets.*;
import betamindy.world.blocks.defense.turrets.pattern.*;
import betamindy.world.blocks.distribution.*;
import betamindy.world.blocks.environment.*;
import betamindy.world.blocks.logic.*;
import betamindy.world.blocks.power.*;
import betamindy.world.blocks.production.*;
import betamindy.world.blocks.units.BoostPad;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.experimental.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.with;

public class MindyBlocks implements ContentList {
    
    public static Block
    //evironmentment
    //payloads
    //pistons
    //effect
    //walls
    //drills
    //units
    //logic
    //turrets
    //power
    test;

    @Override
    public void load() {
        test = new Wall("lead-wall"){{
          health = 360;
          requirements(Category.defense, with(Items.lead, 6));
        }};
    }
}
