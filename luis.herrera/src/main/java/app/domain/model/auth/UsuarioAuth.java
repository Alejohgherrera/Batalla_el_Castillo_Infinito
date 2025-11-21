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
public class UsuarioAuth {

    private Long id;
    private String username;
    private String password;
    private Set<RolAuth> roles;

    public UsuarioAuth() {}

    public UsuarioAuth(Long id, String username, String password, Set<RolAuth> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Set<RolAuth> getRoles() { return roles; }
    public void setRoles(Set<RolAuth> roles) { this.roles = roles; }
}