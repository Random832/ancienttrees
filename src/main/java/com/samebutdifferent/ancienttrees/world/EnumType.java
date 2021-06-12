package com.samebutdifferent.ancienttrees.world;

import net.minecraft.util.IStringSerializable;

public enum EnumType implements IStringSerializable {
    ACEMUS("acemus"),
    CEDRUM("cedrum"),
    CERASU("cerasu"),
    DELNAS("delnas");

    private final String species;

    EnumType(String name){
        this.species=name;
    }

    public String getName(){
        return species;
    }

    @Override
    public String getSerializedName() {
        return getName();
    }

    public static EnumType fromId(int id) {
        if(id<0||id>3){
            return ACEMUS;
        }
        else{
            return EnumType.values()[id];
        }
    }

    public int getId() {
        return ordinal();
    }
}
