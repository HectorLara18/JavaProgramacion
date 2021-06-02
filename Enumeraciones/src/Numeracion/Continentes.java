package Numeracion;

public enum Continentes {
    AMERICA(34, "1.6 Billones"),
    ASIA(46, "2.8 Billones"),
    EUROPA(44, "1.2 Billones"),
    AFRICA(53, "1.2 Billonesw"),
    OCEANIA(14, "0.96 Billones");

    private final int PAISES;
    private final String POBLACION;

    Continentes(int paises, String problacion){
        this.PAISES = paises;
        this.POBLACION = problacion;
    }

    public int getPaises(){
        return this.PAISES;
    }

    public String getPOBLACION(){
        return this.POBLACION;
    }
}
