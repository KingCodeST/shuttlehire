package za.ac.cput.repository.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.vehicle.Bus;

public interface BusRepository extends JpaRepository<Bus,String> {
}
