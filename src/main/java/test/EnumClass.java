package test;

public enum EnumClass {
    XRGJ(2),RFID(3),RXSB(4);
    public final int _type;
    private EnumClass(int type){
        this._type=type;
    }
    @Override
    public String toString(){
        switch (_type){
            case 2:
                return "行人过街";
            case 3:
                return "RFID";
            case 4:
                return "人像识别";
            default:
                throw new RuntimeException("报错："+_type);
        }
    }
}
