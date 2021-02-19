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
import mindustry.ui.*;

import arc.*;
import arc.scene.ui.layout.*;
import arc.scene.style.*;

import static mindustry.type.ItemStack.with;

public class Blocks implements ContentList {
    
    public static Block
    //item
    item,
    //liquid
    liquid,
    //wall
    wall;

    @Override
    public void load() {
        item = new ItemSource("item"){
            {
                size = 1;
                update = true;
                itemCapacity = 30;
                health = Integer.MAX_VALUE;
                alwaysUnlocked=true;
                requirements(Category.distribution, with(Items.copper, 0));
                buildType = () -> new Building(){ 
                    @Override 
                    public void update() {
                        this.health = Integer.MAX_VALUE;
                    }
                };
            }
        };
        liquid = new LiquidSource("liquid"){
            {
                size = 1;
                update = true;
                liquidCapacity = 30;
                health = Integer.MAX_VALUE;
                alwaysUnlocked=true;
                requirements(Category.liquid, with(Items.copper, 0));
                buildType = () -> new Building(){ 
                    @Override 
                    public void update() {
                        this.health = Integer.MAX_VALUE;
                    }
                    /*@Override testing
                    public void buildConfiguration(Table table) {
                      table.button(new TextureRegionDrawable(Core.atlas.find("item-copper")), Styles.clearToggleTransi, () -> { 
                        
                      });
                    }*/
                };
            }
        };
        wall = new LiquidSource("wall"){
            {
                size = 1;
                update = true;
                health = Integer.MAX_VALUE;
                alwaysUnlocked=true;
                requirements(Category.defense, with(Items.copper, 0));
                buildType = () -> new Building(){ 
                    @Override 
                    public void update() {
                        this.health = Integer.MAX_VALUE;
                    }
                };
            }
        };
    }
}
