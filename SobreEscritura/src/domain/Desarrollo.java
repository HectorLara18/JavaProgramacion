package domain;

public class Desarrollo extends Empleado{
    //Atributos
    private String engLevel;
    private String devRole;
    private int gitLevelAccess;
    private int categoria;

    //Constructor
    public Desarrollo(String nombre, double sueldo, String engLevel){
        super(nombre, sueldo);
        this.engLevel = engLevel;
        this.categoria = categoria(this.engLevel);

    }

    public String getEngLevel() {
        return engLevel;
    }

    public void setEngLevel(String engLevel) {
        this.engLevel = engLevel;
    }

    public String getDevRole() {
        return devRole;
    }

    public void setDevRole(String devRole) {
        this.devRole = devRole;
    }

    public int getGitLevelAccess() {
        return gitLevelAccess;
    }

    public void setGitLevelAccess(int gitLevelAccess) {
        this.gitLevelAccess = gitLevelAccess;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    private int categoria(String level){
        if(level == "Principal"){
            return 14;
        } else if(level == "Sr") {
            return  8;
        } else if(level == "mid") {
            return 6;
        } else {
            return 4;
        }
        }
}
