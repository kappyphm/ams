package swp.gr5.ams.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UseCreateRequest {
    private String username;

    private String password;

    private String fullName;

    private String email;

    private String phoneNumber;

    private String Role;

    private Integer departmentId;

}
