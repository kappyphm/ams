package swp.gr5.ams.service.impl;

import swp.gr5.ams.dao.DepartmentDAO;
import swp.gr5.ams.dto.request.DepartmentCreateRequest;
import swp.gr5.ams.dto.request.DepartmentUpdateRequest;
import swp.gr5.ams.model.Department;
import swp.gr5.ams.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    public final DepartmentDAO departmentDAO;

    @Override
    public void createDepartment(DepartmentCreateRequest request) {
        if (departmentDAO.existsByName(request.getDepartmentName())) {
            throw new IllegalArgumentException("Department already exists");
        }

        Department d = new Department();
        d.setDepartmentName(request.getDepartmentName());
        d.setStatus("ACTIVE");
        d.setCreatedDate(LocalDateTime.now());

        departmentDAO.insert(d);

    }

    @Override
    public void updateDepartment(DepartmentUpdateRequest request) {

    }
}
