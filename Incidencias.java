/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package incidencias;

/**
 *
 * @author zazi1

*/


public class Incidencias {

    private int Codigo;
    private int aux = 1;
    private String Estado ;
    private int Puesto;
    private String Descripcion;
    private String Informe;
    
    
    
    public Incidencias(String Estado,int Puesto,String Descripcion){
        this.Codigo = aux;
        aux++;
        this.Estado = Estado;
        this.Puesto = Puesto;
        this.Descripcion = Descripcion;
    }

    public Incidencias(String Estado, int Puesto, String Descripcion, String Informe) {
        this(Estado,Puesto,Descripcion);
        this.Informe = Informe;
    }

   
    public int getCodigo() {
         return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getPuesto() {
        return Puesto;
    }

    public void setPuesto(int Puesto) {
        this.Puesto = Puesto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
        public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public String getInforme() {
        return Informe;
    }

    public void setInforme(String Informe) {
        this.Informe = Informe;
    }
    
    
    
    
    @Override
    public String toString() {
        
        String output = "Incidencia " + Codigo + " - Puesto: " + Puesto + " - " + Descripcion + " - " + Estado;
        if (Estado.equals("Resuelta")) {
            output += " - " + Informe;
        }
        return output;
        
    }
        
       
    }
   
   
    
    
    
    
    
    
    

