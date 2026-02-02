package swp.gr5.ams.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users {
    private Integer userId;

    private String username;

    private String passwordHash;

    private String fullName;

    private String phoneNumber;

    private String email;

    private String status;

    private String role;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    //Foreign key of table Department
    private Integer departmentId;
}
