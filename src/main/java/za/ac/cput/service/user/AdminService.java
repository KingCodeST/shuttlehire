package za.ac.cput.service.user;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.user.Admin;
import za.ac.cput.service.IService;

import java.util.List;

@Service
public interface AdminService extends IService<Admin,String> {
    Admin retrieveByDesc(String adminDesc);
    List<Admin> getAll();
}
