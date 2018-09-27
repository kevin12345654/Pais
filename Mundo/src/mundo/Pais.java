/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author kevin
 */
class Pais {//inicio de clase pais
    //Declaracion de atributos
    
        String nombre;
        int ext_ter;
        double poblacion;
        
        //Metodos

    public String getNombre() {//Regresar Nombre
        return nombre;
    }

    public void setNombre(String n) {//Ingresar Nombre
        this.nombre = n;
    }

    public int getExt_ter() {//Regresar Ext_ter
        return ext_ter;
    }

    public void setExt_ter(int a) {//Ingresar Ext_ter
        this.ext_ter = a;
    }

    public double getPoblacion() {//Regresar Numero de Poblacion    
        return poblacion;
    }

    public void setPoblacion(double np) {//Ingresar Numero De Poblacion
        this.poblacion = np;
    }

    

}
    
    
    
    

