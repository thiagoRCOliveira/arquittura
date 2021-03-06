package util;

public enum EnumCod {
    INTERRUPT(0),
    READ(1),
    READ2(2),
    PREPARED(3),
    EXECUTE(4),
    WRITE(5),
    FINISH(6),
    MOV (0b01100100), //100
    ADD (0b01100101), //101
    IMUL(0b01100110), //102
    INC (0b01100111), //103
    INTERRUPCAO(1000),

    MOV3_2(121),
    ADD3_2(122),
    ADD4_2(123),
    INC2_2(124);

    private byte value;


    EnumCod(int value) {
        this.value =(byte) value;
    }





    public byte getValue() {
        return value;
    }


}
