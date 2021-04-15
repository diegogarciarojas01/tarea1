
/**
 * Write a description of class Automovil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class automovil{
    private String modelo;
    private String color;
    private String matricula;
    public automovil(String modelo, String color, String matricula){
    this.modelo = modelo;
    this.color = color;
    this.matricula = matricula;
    }
    public void setModelo(String modelo){
    this.modelo = modelo;
    }
    public void setColor(String color){
    this.color = color;
    }
    public void setMatricula(String matricula){
    this.matricula  = matricula;    
    }
    public String getModelo(){
    return modelo;
    }
    public String getColor(){
    return color;
    }
    public String getMatricula(){
    return matricula;
    }
}



