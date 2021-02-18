package cheat.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
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

public class Blocks implements ContentList {
    
    public static Block
    //item
    item,
    //payloads
    //pistons
    //effect
    //walls
    //drills
    //units
    //logic
    //turrets
    //power
    //Testing
    test;

    @Override
    public void load() {
        test = new Wall("lead-wall"){{
          health = 360;
          requirements(Category.defense, with(Items.lead, 6));
        }};
        item = new ItemSource("item"){{
          size = 1;
          update = true;
          itemCapacity = 30;
          health = Number.MAX_VALUE;
          requirements(Category.defense, with(Items.lead, 6));
        }};
    }
}
