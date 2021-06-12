package com.samebutdifferent.ancienttrees.world;

import net.minecraft.util.IStringSerializable;

public enum EnumType implements IStringSerializable {
    ACEMUS("acemus"),
    CERASU("cerasu"),
    KULIST("kulist"),
    HEKUR("hekur"),
    EWCALY("ewcaly"),
    KIPARIS("kiparis"),
    LATA("lata"),
    NUCIS("nucis"),
    PORFFOR("porffor"),
    SALYX("salyx");

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
