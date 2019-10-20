package za.ac.cput.repository.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.vehicle.Door;

public interface DoorRepository extends JpaRepository<Door,String> {
}
