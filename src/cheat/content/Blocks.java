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
import mindustry.world.blocks.sandbox.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.with;

public class Blocks implements ContentList {
    
    public static Block
    //item
    item,
    //liquid
    liquid;

    @Override
    public void load() {
        item = new ItemSource("item"){{
          size = 1;
          update = true;
          itemCapacity = 30;
          health = Integer.MAX_VALUE;
          requirements(Category.defense, with(Items.copper, 0),true);
        }};
        item = new LiquidSource("liquid"){{
          size = 1;
          update = true;
          itemCapacity = 30;
          health = Integer.MAX_VALUE;
          requirements(Category.defense, with(Items.copper, 0),true);
        }};
    }
}
