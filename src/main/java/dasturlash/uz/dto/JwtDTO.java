package dasturlash.uz.dto;

public class JwtDTO {
    private Integer id;
    private String username;
    private String role;

    public JwtDTO(Integer id, String username, String role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}
