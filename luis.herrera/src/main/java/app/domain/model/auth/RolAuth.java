/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.model.auth;

import java.util.Set;

/**
 *
 * @author ad
 */
public class RolAuth {

    private Long id;
    private String nombre;
    private Set<PermisoAuth> permisos;

    public RolAuth() {}

    public RolAuth(Long id, String nombre, Set<PermisoAuth> permisos) {
        this.id = id;
        this.nombre = nombre;
        this.permisos = permisos;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Set<PermisoAuth> getPermisos() { return permisos; }
    public void setPermisos(Set<PermisoAuth> permisos) { this.permisos = permisos; }
}
