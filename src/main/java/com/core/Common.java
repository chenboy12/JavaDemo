package com.core;

public class Common {
    public String _str;
    public Common(String str){
        this._str=str;
    }
    @Override
    public String toString(){
        return _str;
    }
    @Override
    public boolean equals(Object obj){
        if(obj.toString()==_str) {
            return true;
        }
        else{
            return false;
        }

    }
}
