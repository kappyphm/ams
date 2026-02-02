    package swp.gr5.ams.service;

    import swp.gr5.ams.dto.request.DepartmentCreateRequest;
    import swp.gr5.ams.dto.request.DepartmentUpdateRequest;

    public interface DepartmentService {
        void createDepartment(DepartmentCreateRequest request);
        void updateDepartment(DepartmentUpdateRequest request);
    }
