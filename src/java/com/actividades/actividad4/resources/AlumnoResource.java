package com.actividades.actividad4.resources;

import com.actividades.actividad4.models.Alumno;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ruben
 */

@Path("alumno")
@ManagedBean
public class AlumnoResource {
        
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public AlumnoResource() {
        this.initialize();
        
    }    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getList(){
        if (this.alumnos != null && this.alumnos.size() > 0) {
            return Response.ok(this.alumnos.toArray(new Alumno[this.alumnos.size()])).build();
        } else {
            return Response.noContent().build();
        }        
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") Integer id){
        if (id > 0 && id < (this.alumnos.size()) + 1) {
            Alumno alumnoResult = alumnos.get(id - 1);        
            return Response.ok(alumnoResult).build();
        } else {
            return Response.noContent().build();
        }
        
    }
    
    private void initialize(){
        this.alumnos.add(new Alumno(1, "Pedro", "Rivera", "123", "M"));
        this.alumnos.add(new Alumno(2, "María", "Hernandez", "124", "F"));
        this.alumnos.add(new Alumno(3, "Armando", "Ríos", "125", "M"));
        this.alumnos.add(new Alumno(4, "Germán", "Sampieri", "126", "M"));
        this.alumnos.add(new Alumno(5, "Jesús", "Tecalco", "127", "M"));
        this.alumnos.add(new Alumno(6, "Roberto", "León", "128", "M"));
        this.alumnos.add(new Alumno(7, "Guadalupe", "García", "129", "F"));
        this.alumnos.add(new Alumno(8, "Luis", "Escobar", "130", "M"));
        this.alumnos.add(new Alumno(9, "Sara", "Serna", "131", "F"));
        this.alumnos.add(new Alumno(10, "Efraín", "Dector", "132", "M"));
        
    }
    
}
