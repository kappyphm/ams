package swp.gr5.ams.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DepartmentUpdateRequest {
    private Integer departmentId;

    private String departmentName;

    private String status;

    private Integer managerId;
}
