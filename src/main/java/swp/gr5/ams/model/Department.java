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
public class Department {
    private Integer departmentId;

    private String departmentName;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    // ACTIVE or INACTIVE
    private String status;

    //Foreign user_id of Table Users
    private Integer managerId;

}
